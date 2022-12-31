package chapters.chapter_12;

public class Exercise_10 {
    public static void main(String[] args) {
        try {
            double[] array = new double[(int) Math.pow(10000 , 100000)];
        }
        catch (OutOfMemoryError exception){
            System.out.println("OutOfMemoryError detected ! ");
        }
    }
}
