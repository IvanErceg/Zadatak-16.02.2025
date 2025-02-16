package Vjezba;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaProizvoda {
    public static void main(String[] args) {
        ArrayList<Proizvodi>products=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        Proizvodi cokolada = new Proizvodi("čokolada", 10, 0);
        Proizvodi banana = new Proizvodi("banana", 4, 0);
        Proizvodi jabuka = new Proizvodi("jabuka", 3, 0);


        boolean unosimo = true;
            while (unosimo) {
                System.out.println("Unesi ime proizvoda: ");
                String unosIme=sc.nextLine().trim();
                if (unosIme.equals("prekid")) {
                    unosimo = false;
                } else {
                    int kolicina = 1;
                    switch (unosIme) {
                        case "čokolada":
                            products.add(cokolada);
                            cokolada.setKoličina(1);
                            break;
                        case "banana":
                            products.add(banana);
                            banana.setKoličina(1);
                            break;
                        case "jabuka":
                            products.add(jabuka);
                            jabuka.setKoličina(kolicina);
                            break;
                        case "prekid":
                            unosimo = false;
                            break;
                        default:
                            System.out.println("proizvod nije nađen");
                            break;
                    }
                }
            }
        System.out.println("Ispiši podatke o proizvodu: ");
        String ispis= sc.nextLine().trim();
        if(ispis.equalsIgnoreCase("ispis")) {
            System.out.println("broi proizvoda pohranjenih u listu  je: "+products.size());
            int i=0;
            int c=0;int j=0;int b=0;
                  while (i < products.size()) {
                    if (products.get(i).equals(cokolada)) {
                        c++;
                        cokolada.setKoličina(c);
                    } else if (products.get(i).equals(banana)) {
                        b++;
                        banana.setKoličina(b);
                    } else if (products.get(i).equals(jabuka)) {
                        j++;
                        jabuka.setKoličina(j);
                    }
                    i++;
                }
                System.out.println("Proizvod " + cokolada.getIme() + " ,količina u listi " + cokolada.getKoličina() + " ,cijena po artiklu: " + cokolada.getCijena()+" eura");
                System.out.println("Proizvod " + banana.getIme() + " ,količina u listi: " + banana.getKoličina() + " ,cijena po artiklu: " + banana.getCijena()+" eura");
                System.out.println("Proizvod " + jabuka.getIme() + " ,količina u listi: " + jabuka.getKoličina() + " ,cijena po artiklu: " + jabuka.getCijena()+" eura");

        }



    }
}
