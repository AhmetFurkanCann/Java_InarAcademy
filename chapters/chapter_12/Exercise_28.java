package chapters.chapter_12;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_28 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("There is no file in the directory !");
            System.exit(1);
        }
        ArrayList<File> list = new ArrayList<>();
        // Add files in a list
        for (int i = 0; i < args.length; i++) {
            list.add(new File(args[i]));
        }
        while (!list.isEmpty()) {
            if (list.get(0).isDirectory()) {
                list.addAll(Arrays.asList(list.get(0).listFiles()));
            } else {
                renameTheFile(list.get(0));
                list.remove(0);
            }
        }
    }

    private static void renameTheFile(File file) {
        String name = file.getName();
        if (name.matches("Exercise\\d_\\d+")){
            String newName = "";
            for (int j = 0; j < name.length(); j++) {
                if (j == 8) {
                    newName += "0" + name.charAt(j);
                }
                else {
                    newName += name.charAt(j);
                }
            }
            File newNameFile = new File(newName);
            file.renameTo(newNameFile);
        }
    }
}
