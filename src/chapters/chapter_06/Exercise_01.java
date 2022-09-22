package chapters.chapter_06;

public class Exercise_01 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            int pentagonalNumber = getPentagonalNumber(i);
            System.out.printf("%6d ", pentagonalNumber);
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }

        }

    }

    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1)) / 2;
    }
}
