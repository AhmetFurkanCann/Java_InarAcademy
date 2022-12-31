package chapters.chapter_11;

public class Exercise_02Person {
    private String name ;
    private String adress ;
    private String phoneNumber ;
    private String emailAddress ;

    public Exercise_02Person() {
        this("" , "" , "" , "");
    }

    public Exercise_02Person(String name, String adress, String phoneNumber, String emailAddress) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    @Override
    public String toString() {
        return "Person " + getName() ;
    }
}
