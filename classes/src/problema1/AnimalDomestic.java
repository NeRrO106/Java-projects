package problema1;

public class AnimalDomestic extends Mamifer{

    public AnimalDomestic(String nume, int greutate, String continent, String marcaj, String locDormit, String mancare) {
        super(nume, greutate, continent, marcaj, locDormit, mancare);
    }

        @Override
    public void locuieste() {
        System.out.println("Animalul domestic locuieste " + continent);
    }

    @Override
    public void delimiteazaTeritoriu() {
        System.out.println("Teritoriul delimitat al animalului domestic este: " + marcaj);
    }
    
}
