package Vjezba;

public class Proizvodi {
    private String ime;
    private int cijena;
    private int količina;

    public Proizvodi(String ime,int cijena,int količina) {
                  this.ime=ime;
                  this.cijena=cijena;
                  this.količina=količina;
    }

    public void setKoličina(int količina) {
        this.količina = količina;
    }

    public String getIme() {
        return ime;
    }

    public int getCijena() {
        return cijena;
    }

    public int getKoličina() {
        return količina;
    }
}
