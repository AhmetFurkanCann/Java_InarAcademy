package chapters.chapter_10;

import java.util.Arrays;

public class Exercise_25 {
    public static void main(String[] args) {
        String[] array = split("#ab##12#453", "#");
        printArray(array);
        array = split("?a?b???gf#e", "[?#]") ;
        printArray(array);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static String[] split(String s, String regex) {
        char[] chars = s.toCharArray();
        char[] charRegex = getRegex(regex);
        String[] splitArray = new String[chars.length];
        int count = 0;
        for (int i = 0; i < chars.length ; i++) {
            boolean isContains = false ;
            for (int j = 0; j < charRegex.length ; j++) {
                if (chars[i] == charRegex[j]) {
                    isContains = true ;
                }
            }
            if (isContains){
                if (splitArray[count] == null){
                    splitArray[count] = "" + chars[i] ;
                }
                else {
                    count++;
                    splitArray[count] = "" + chars[i] ;
                }
                count++;
            }
            else {
                if (splitArray[count] == null){
                    splitArray[count] = "" + chars[i] ;
                }
                else {
                    splitArray[count] += "" + chars[i];
                }
            }
        }
        String[] result = new String[count + 1] ;
        System.arraycopy(splitArray , 0 , result , 0 , count + 1);
        return result ;
    }

    public static char[] getRegex(String regex) {
        if (regex.length() == 1){
            return regex.toCharArray();
        }
        else {
            char[] array = regex.toCharArray();
            return Arrays.copyOfRange(array , 1 , array.length - 1) ;
        }
    }
}
