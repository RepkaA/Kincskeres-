
public class Lada {   
    private String bronzFelirat;
    private String ezustFelirat;
    private String aranyFelirat;
    private String leiras;

    public Lada()  { // játékszabály
        this("3 láda közül az egyikben van a  rejti a kincs "
                + "Mindegyiken van egy felirat (ami nem változtatható, mert belevésték a ládába),"
                + " de csak az egyik láda állítása igaz!");
    }
    public Lada(String leiras) {
        this.leiras = leiras;
        this.aranyFelirat = "Én nálam van a kincs.";
        this.ezustFelirat = "Nem nálam van a kincs.";
        this.bronzFelirat = "Az arany hazudik!";
    }

    public String getLeiras() {
        return leiras;
    }

    public String getBronzFelirat() {
        return bronzFelirat;
    }

    public String getEzustFelirat() {
        return ezustFelirat;
    }

    public String getAranyFelirat() {
        return aranyFelirat;
    }    
}