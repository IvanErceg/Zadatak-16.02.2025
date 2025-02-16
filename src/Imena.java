import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Imena {
    public static void main(String[] args) {
        ArrayList<Popis> popis=new ArrayList<>();
       // popis.getPrezime();

        String[] imena={"Josip","Ivan","Teo"};
        String[] prezimena={"Marić","Horvat","Kovač"};
        for(int i=0;i<imena.length;i++){
                for (int j=0;j<prezimena.length;j++){
                    Popis ime=new Popis(imena[i],prezimena[j]);
                    popis.add(ime);
                }
        }
        System.out.println("U listi se nalaze : "+popis);
    }
}