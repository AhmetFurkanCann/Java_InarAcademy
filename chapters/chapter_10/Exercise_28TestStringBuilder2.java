package chapters.chapter_10;

public class Exercise_28TestStringBuilder2 {
    public static void main(String[] args) {
        Exercise_28StringBuilder2 s = new Exercise_28StringBuilder2("Inar Academy");
        System.out.println(s.toString());
        s.insert(5,new Exercise_28StringBuilder2(" is Good"));
        System.out.println(s.toString());
        s.reverse();
        System.out.println(s.toString());
        System.out.println(s.substring(5).toString());
        System.out.println(s.toUpperCase().toString());
        System.out.println(s);
    }
}
