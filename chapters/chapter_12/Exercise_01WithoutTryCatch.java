package chapters.chapter_12;

public class Exercise_01WithoutTryCatch {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        if (!isDigit(args[0])){
            System.out.println("Wrong Input : " + args[0]);
        }else if (!isDigit(args[2])){
            System.out.println("Wrong Input : " + args[2]);
        }
        else {
            int result = 0;
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) +
                            Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) -
                            Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) *
                            Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) /
                            Integer.parseInt(args[2]);
            }

            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                    + " = " + result);
        }
    }

    private static boolean isDigit(String arg) {
        for (int i = 0; i < arg.length(); i++) {
            if (!Character.isDigit(arg.charAt(i))){
                return false ;
            }
        }
        return true ;
    }
}
