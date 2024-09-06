package finalpackage;

public class FinalClass {
    int id;
    public FinalClass(){}
    public FinalClass(int id){
        this.id = id;
    }
    public final String metodaFinala(){
        return "Metoda finala " + id;
    }
    public String netodaNotFinal(){
        return "Metoda nefinala " + id;
    }

}
