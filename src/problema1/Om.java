package problema1;

public class Om extends Mamifer{

    public Om(String nume, int greutate, String continent, String marcaj, String locDormit, String mancare) {
        super(nume, greutate, continent, marcaj, locDormit, mancare);
    }

    @Override
    public void locuieste() {
        System.out.println("Omul locuieste " + continent);
    }

    @Override
    public void delimiteazaTeritoriu() {
        System.out.println("Teritoriul delimitat al omului este: " + marcaj);
    }
}
