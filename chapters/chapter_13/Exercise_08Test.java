package chapters.chapter_13;

public class Exercise_08Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Exercise_08MyStackDeepCopy stack1 = new Exercise_08MyStackDeepCopy();
        Exercise_08MyStackDeepCopy stack2 = stack1 ;
        Exercise_08MyStackDeepCopy stack3 = (Exercise_08MyStackDeepCopy) stack1.clone();
        System.out.println(stack1 == stack2);
        System.out.println(stack1 == stack3);
    }
}
