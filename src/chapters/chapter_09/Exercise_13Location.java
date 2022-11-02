package chapters.chapter_09;

public class Exercise_13Location {
    public int row;
    public int column ;
    public double maxValue ;

    public Exercise_13Location(int row , int column , double maxValue) {
        this.row = row;
        this.column = column ;
        this.maxValue = maxValue ;
    }

    public static Exercise_13Location locateLargest(double[][] a){
        int row = 0 ;
        int column = 0 ;
        double maxValue = 0 ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] > maxValue){
                    row = i ;
                    column = j ;
                    maxValue = a[i][j] ;
                }
            }
        }
        return new Exercise_13Location(row,column,maxValue);
    }
}
