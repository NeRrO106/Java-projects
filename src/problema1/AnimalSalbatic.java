
package problema1;

public class AnimalSalbatic extends Mamifer{

    public AnimalSalbatic(String nume, int greutate, String continent, String marcaj, String locDormit, String mancare) {
        super(nume, greutate, continent, marcaj, locDormit, mancare);
    }

        @Override
    public void locuieste() {
        System.out.println("Animalul salbatic locuieste " + continent);
    }

    @Override
    public void delimiteazaTeritoriu() {
        System.out.println("Teritoriul delimitat al animalului salbatic este: " + marcaj);
    }
    
}
