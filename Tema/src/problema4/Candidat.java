package problema4;

public class Candidat {
    private String numeCandidat;
    private double notaCandidat;

    String getCandidatName(){
        return numeCandidat;
    }
    public void setCandidatName(String value){
        if(value != null){
            this.numeCandidat = value;
        }
    }

    double getCandidatGrade(){
        return notaCandidat;
    }
    public void setCandidatGrade(double val){
        this.notaCandidat = val;
    }
    public Candidat(String nume, double nota) {
        setCandidatName(nume);
        setCandidatGrade(nota);
    }
}
