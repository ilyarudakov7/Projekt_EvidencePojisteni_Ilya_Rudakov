package EvidencePojisteni;
//třída pro inicializaci pojištěnce
public class Pojistenec {
    //jméno pojištěnce
    private String jmeno;
    //příjmení pojištěnce
    private String prijmeni;
    //věk pojištěnce
    private int vek;
    //telefonní číslo pojištěnce
    private String telefonniCislo;

    //konstruktor pro vytvoření nové instance pojištnce
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

//getter jména
    public String getJmeno() {
        return jmeno;
    }
//getter příjmení
    public String getPrijmeni() {
        return prijmeni;
    }
//getter věku
    public int getVek() {
        return vek;
    }
//setter věku
    public void setVek(int vek) {
        this.vek = vek;
    }
//getter telefonního čísla
    public String getTelefonniCislo() {
        return telefonniCislo;
    }
//setter telefonního čísla
    public void setTelefonniCislo(String telefonniCislo) {
        this.telefonniCislo = telefonniCislo;
    }
//vypsání objektu - konkrétně jména, příjmení, věku a telefonního čísla
    @Override
    public String toString() {
        return String.format("%s   %s   %d   %s",getJmeno(),getPrijmeni(),getVek(),getTelefonniCislo());
    }
}
