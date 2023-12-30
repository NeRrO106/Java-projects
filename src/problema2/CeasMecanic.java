package problema2;

public class CeasMecanic implements Ceas{

    @Override
    public String citesteTimpul(int ora, int minut, int secunda) {
        int gradeOra = 0, gradeMinut = 0, gradeSecunda = 0;
        if(ora < 23 && minut < 59 && secunda < 59){
            gradeOra += ora * 30;
            gradeMinut += minut * 6;
            gradeSecunda += secunda * 6;
        }
        return "ora, minut, secunda in grade: " + gradeOra + "," + gradeMinut + "," + gradeSecunda;
    }
    
}
