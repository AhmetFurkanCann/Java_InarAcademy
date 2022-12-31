package chapters.chapter_07;

public class Exercise_23 {
    public static void main(String[] args) {
        Boolean[] lockers = new Boolean[100];
        for (int i = 0; i < lockers.length; i++) {
            lockers[i]= false ;
        }
        for (int i = 0; i < lockers.length; i++) {
            for (int j = i + 1 ; j <= lockers.length ; j += (i + 1 ) ){
                lockers[j - 1] = (lockers[j - 1] ) ? false : true ;
            }
        }
        System.out.println("Open Locker Numbers : ");
        for (int i = 0; i < lockers.length; i++) {
            if(lockers[i]){
                System.out.print("L" + (i + 1) + " ");

            }
        }
    }
}
