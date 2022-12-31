package chapters.chapter_10;

public class Exercise_24TestMyCharacter {
    public static void main(String[] args) {
        Exercise_24MyCharacter ch1 = new Exercise_24MyCharacter('U');
        System.out.println(ch1.toString());
        Exercise_24MyCharacter ch2 = Exercise_24MyCharacter.valueOf('k');
        System.out.println(ch2.toString());
        System.out.println(ch1.getCh());
        System.out.println(Exercise_24MyCharacter.isDigit('a'));
        System.out.println(Exercise_24MyCharacter.isLetter('A'));
        System.out.println(Exercise_24MyCharacter.isLetterOrDigit('1'));
        System.out.println(Exercise_24MyCharacter.isLowerCase('a'));
        System.out.println(Exercise_24MyCharacter.isUpperCase('a'));
        System.out.println(ch1.compareTo(ch2));
        System.out.println(ch1.equals(ch2));

    }
}
