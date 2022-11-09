package chapters.chapter_10;

public class Exercise_26 {
    public static void main(String[] args) {
        String s = "" ;
        for (int i = 0; i < args.length; i++) {
            s += args[i];
        }
        s = s.replaceAll("[+]"," + ");
        s = s.replaceAll("[-]"," - ");
        s = s.replaceAll("[*]"," * ");
        s = s.replaceAll("[/]"," / ");

        String[] expression = s.trim().split("\\s+");
        if (expression.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        int result = 0;

        switch (expression[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(expression[0]) +
                        Integer.parseInt(expression[2]);
                break;
            case '-':
                result = Integer.parseInt(expression[0]) -
                        Integer.parseInt(expression[2]);
                break;
            case '.':
                result = Integer.parseInt(expression[0]) *
                        Integer.parseInt(expression[2]);
                break;
            case '/':
                result = Integer.parseInt(expression[0]) /
                        Integer.parseInt(expression[2]);
        }


        System.out.println(expression[0] + ' ' + expression[1] + ' ' + expression[2]
                + " = " + result);
    }
}
