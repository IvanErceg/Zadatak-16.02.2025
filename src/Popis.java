public class Popis {
private String ime;
private String prezime;
    public Popis(String i, String j) {
            this.ime=i;
            this.prezime=j;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIme() {
        return ime;
    }

    @Override
    public String toString() {
        return
                 "\n"+ime +"\t"+
                 prezime
                ;
    }
}
