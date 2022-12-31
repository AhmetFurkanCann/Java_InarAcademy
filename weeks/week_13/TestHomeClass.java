package weeks.week_13;

public class TestHomeClass {
    public static void main(String[] args) {
        Home home1 = new Home();
        Home home2 = new Home(200 , 3 , 5 , true , 1000000 , 10000 , false , 2022);
        home1.print();
        System.out.println("--------------------------------------------");
        home2.print();
    }
}
