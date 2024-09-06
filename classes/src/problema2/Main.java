package problema2;

public class Main {
    public static void main(String[] args){
        CeasDigital ceasd = new CeasDigital();
        CeasMecanic ceasM = new CeasMecanic();
        
        System.out.println(ceasd.citesteTimpul(11,9,45));
        System.out.println(ceasM.citesteTimpul(11,9,45));
        
    }
}
