package chapters.chapter_07;

public class Exercise_22 {
    public static void main(String[] args) {
        int[] placeOfQueens = new int[8];
        fillthePlaceOfQueens(placeOfQueens);
        int[] controlArray = new int[24];
        fillTheControlArray(controlArray);
        findSolution(placeOfQueens,controlArray);
        displayChessTable(placeOfQueens);
    }

    public static void fillthePlaceOfQueens(int[] placeOfQueens) {
        for (int i = 0; i < placeOfQueens.length; i++) {
            placeOfQueens[i] = -1 ;
        }
    }

    public static void displayChessTable(int[] placeOfQueens) {
        for (int i = 0; i < placeOfQueens.length; i++) {
            for (int j = 0; j < 8; j++) {
                if (placeOfQueens[i] == j){
                    System.out.print("|Q");
                }else {
                    System.out.print("| ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void findSolution(int[] placeOfQueens, int[] controlArray) {
        int controlIndex = 0;
        String notMatchedPlaces = "" ;

        for (int i = 0; i < placeOfQueens.length; i++) {
            boolean possible = false;
            int count = 0 ;
            while (!possible) {
                int place = (int) (Math.random() * 8);
                while (notMatchedPlaces.contains(place + "")){
                    place = (int) (Math.random() * 8);
                }
                if (isPossible(controlArray, place, controlIndex + 3)) {
                    placeOfQueens[i] = place;
                    possible=true;
                    controlIndex += 3;
                    notMatchedPlaces = "" ;
                }
                else {
                    if(!notMatchedPlaces.contains(place + "")){
                        count++;
                        notMatchedPlaces += place + "" ;
                    }
                }
                if (count == 8){
                    count = 0 ;
                    controlIndex = 0;
                    i = -1 ;
                    notMatchedPlaces = "";
                    fillTheControlArray(controlArray);
                    fillthePlaceOfQueens(placeOfQueens);
                    break;
                }

            }
        }
    }


    public static boolean isPossible(int[] controlArray, int place, int controlIndex) {

        for (int i = 0; i <controlIndex - 3 ; i++) {
            if(controlArray[i] == place){
                return false ;
            }
        }
            for (int i = controlIndex - 3; i < controlIndex ; i++) {
                controlArray[i] = place;
            }
            updateControlArray(controlArray,controlIndex);

        return true;
    }

    public static void updateControlArray(int[] controlArray, int count) {
        for (int i = 0; i < count; i++) {
            if (i % 3 == 1){
                controlArray[i]--;
            }
            if (i % 3 == 2){
                controlArray[i]++;
            }
        }
    }

    public static void fillTheControlArray(int[] controlArray) {
        for (int i = 0; i < controlArray.length; i++) {
            controlArray[i] = -1 ;
        }
    }
}
