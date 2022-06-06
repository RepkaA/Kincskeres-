
public class jatekostipp {

    // játékos tippjei getterek / setterek létrehozása
    public class Jatekos {
    public static final String TIPP_ARANY = "arany";
    public static final String TIPP_EZUST = "ezüst";
    public static final String TIPP_BRONZ = "ezüst";
    
    private String tipp;

    public Jatekos() {
        this("");
    }

    public Jatekos(String tipp) {
        this.tipp = tipp;
    }

    public String getTipp() {
        return tipp;
    }

    public void setTipp(String tipp) {
        this.tipp = tipp;
    }
    
    
}

    
}
