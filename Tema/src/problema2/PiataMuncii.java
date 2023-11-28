package problema2;

import java.util.ArrayList;

public class PiataMuncii {
    public PiataMuncii() {}

    public static void main(String[] args) {
        ArrayList<Candidat> listaPiataMuncii = new ArrayList<Candidat>();

        Candidat gigel = new Candidat("Gigel", 10.0);
        listaPiataMuncii.add(gigel);

        Candidat dorel = new Candidat("Dorel", 4.0);
        listaPiataMuncii.add(dorel);

        Candidat marcel = new Candidat("Marcel",5.0);
        listaPiataMuncii.add(marcel);

        Candidat ionel = new Candidat("Ionel", 7.0);
        listaPiataMuncii.add(ionel);

        Companie google = new Companie("Google", 7.0);
        google.alegeCandicatiInterviu(listaPiataMuncii);

        Companie amazon = new Companie("Amazon",8.0);
        amazon.alegeCandicatiInterviu(listaPiataMuncii);

        Companie facebook = new Companie("Facebook", 10.0);
        facebook.alegeCandicatiInterviu(listaPiataMuncii);

        Companie microsoft = new Companie("Microsoft",4.0);
        microsoft.alegeCandicatiInterviu(listaPiataMuncii);

        //problema3
        Candidat c1 = new Candidat("Da",1.0);
        Candidat c2 = new Candidat("Da",1.0);
        Candidat c3 = c1;
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        c1.numeCandidat = "Liviu";
        System.out.println(c1.numeCandidat);
        System.out.println(c2.numeCandidat);
        System.out.println(c3.numeCandidat);
    }
}
