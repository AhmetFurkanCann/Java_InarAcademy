package weeks.week_13;

public class Home {
    private long yuzolcumu ;
    private int banyoSayisi;
    private int odaSayisi;
    private boolean garajVarMi;
    private long ucret ;
    private long kiraUcreti;
    private boolean kuzeyMi ;
    private int yil;
    public Home(){
        this(100 , 2 , 3 , true , 500000, 4000 , true , 2022) ;
    }
    public Home(long yuzolcumu , int banyoSayisi ,int odaSayisi , boolean garajVarMi , long ucret , long kiraUcreti , boolean kuzeyMi , int yil ) {
        this.yuzolcumu = yuzolcumu ;
        this.banyoSayisi = banyoSayisi ;
        this.odaSayisi = odaSayisi ;
        this.garajVarMi = garajVarMi ;
        this.ucret = ucret ;
        this.kiraUcreti = kiraUcreti ;
        this.kuzeyMi = kuzeyMi ;
        this.yil = yil ;
    }

    public long getYuzolcumu() {
        return yuzolcumu;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public boolean isGarajVarMi() {
        return garajVarMi;
    }

    public long getUcret() {
        return ucret;
    }

    public long getKiraUcreti() {
        return kiraUcreti;
    }

    public boolean isKuzeyMi() {
        return kuzeyMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYuzolcumu(long yuzolcumu) {
        this.yuzolcumu = yuzolcumu;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public void setGarajVarMi(boolean garajVarMi) {
        this.garajVarMi = garajVarMi;
    }

    public void setKiraUcreti(long kiraUcreti) {
        this.kiraUcreti = kiraUcreti;
    }

    public void setKuzeyMi(boolean kuzeyMi) {
        this.kuzeyMi = kuzeyMi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public void setUcret(long ucret) {
        this.ucret = ucret;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void print() {
        System.out.println("Yüz Ölçümü : " + yuzolcumu);
        System.out.println("Banyo Sayısı : " + banyoSayisi );
        System.out.println("Oda Sayısı : " + odaSayisi );
        System.out.println("Garajı Var Mı ?" + ((isGarajVarMi()) ? "Var" : "Yok"));
        System.out.println("Ücreti : " + ucret);
        System.out.println("Kira ücreti : " + kiraUcreti );
        System.out.println("Cephesi " + ((isKuzeyMi()) ? "Kuzey" : "Güney"));
        System.out.println("Yıl " + yil);
    }
}
