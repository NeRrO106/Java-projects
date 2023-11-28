//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package problema2;

import java.util.ArrayList;

public class Companie {
    String numeCompanie;
    double notaMinima;

    public Companie(String nume, double nota) {
        numeCompanie = nume;
        notaMinima = nota;
    }

    public ArrayList<Candidat> alegeCandicatiInterviu(ArrayList<Candidat> listaPiataMuncii) {
        ArrayList<Candidat> listaCompanie = new ArrayList();

        for(int i = 0; i < listaPiataMuncii.size(); i++) {
            if (((Candidat)listaPiataMuncii.get(i)).notaCandidat >= this.notaMinima) {
                listaCompanie.add((Candidat)listaPiataMuncii.get(i));
                System.out.println("Candidatul " + ((Candidat)listaPiataMuncii.get(i)).numeCandidat + "a obtinut un interviu telefonic la compania " + this.numeCompanie);
            }
        }

        return listaCompanie;
    }
}
