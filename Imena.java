import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Imena {
    public static void main(String[] args) {
        ArrayList<Popis> popis=new ArrayList<>();
       // popis.getPrezime();

        String[] imena={"Josip","Ivan","Teo"};
        String[] prezimena={"Marić","Horvat","Kovač"};

        //int random=(int)(Math.random()*3);
       // System.out.println("random je: "+random);
        for(int i=0;i<imena.length;i++){//0-2
                for (int j=0;j<prezimena.length;j++){//0-2
                    Popis ime=new Popis(imena[(int)(Math.random()*3)],prezimena[(int)(Math.random()*3)]);
                    popis.add(ime);
                }
        }
        System.out.println("U listi se nalaze : "+popis);
    }
}