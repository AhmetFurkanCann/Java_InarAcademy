package chapters.chapter_11;
import weeks.week_12.Circle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Exercise_06Loan()) ;
        list.add(new Date());
        list.add("AFC") ;
        list.add(new Circle()) ;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
