package weeks.week_12;

public class FootballClub {
    private double balance ;
    private String clubNAme ;
    private double ticketPrice ;
    private String stadium ;
    private int stadiumCapacity ;
    private int[] player ;

    public  FootballClub(){
        this(0 , "default" , 0 , "default stadium" , 0);
    }
    public  FootballClub(double balance , String clubNAme , double ticketPrice , String stadium , int stadiumCapacity){
        this.balance = balance;
        this.clubNAme = clubNAme;
        this.ticketPrice = ticketPrice ;
        this.stadium = stadium ;
        this.stadiumCapacity = stadiumCapacity;
    }

    public double getBalance() {
        return balance;
    }

    public String getClubNAme() {
        return clubNAme;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getStadium() {
        return stadium;
    }

    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClubNAme(String clubNAme) {
        this.clubNAme = clubNAme;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }
    public void sellTicket(int number) {
        balance += number * ticketPrice;
    }
    public void sellPlayer (double money) {
        balance += money ;
    }
    public void buyPlayer (double money) {
        balance -= money ;
    }

}
