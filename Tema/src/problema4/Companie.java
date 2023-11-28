//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package problema4;

import java.util.ArrayList;

public class Companie {
    private String numeCompanie;
    private double notaMinima;

    public String getCompanyName(){
        return numeCompanie;
    }
    public void setCompanyName(String value){
        if(value != null){
            this.numeCompanie = value;
        }
    }

    public double getCompanyGrade(){
        return notaMinima;
    }
    public void setCompanyGrade(double val){
        this.notaMinima = val;
    }

    public Companie(String nume, double nota) {
        setCompanyName(nume);
        setCompanyGrade(nota);
    }

    public ArrayList<Candidat> alegeCandicatiInterviu(ArrayList<Candidat> listaPiataMuncii) {
        ArrayList<Candidat> listaCompanie = new ArrayList();

        for(int i = 0; i < listaPiataMuncii.size(); i++) {
            if (((Candidat)listaPiataMuncii.get(i)).getCandidatGrade() >= this.notaMinima) {
                listaCompanie.add((Candidat)listaPiataMuncii.get(i));
                System.out.println("Candidatul " + ((Candidat)listaPiataMuncii.get(i)).getCandidatName() + "a obtinut un interviu telefonic la compania " + this.getCompanyName());
            }
        }

        return listaCompanie;
    }
}
