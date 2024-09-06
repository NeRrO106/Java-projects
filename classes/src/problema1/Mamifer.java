
package problema1;

public abstract class Mamifer {
    String nume;
    int greutate;
    String continent;
    String marcaj;
    String locDormit;
    String mancare;

    public Mamifer(String nume, int greutate, String continent, String marcaj, String locDormit, String mancare) {
        this.nume = nume;
        this.greutate = greutate;
        this.continent = continent;
        this.marcaj = marcaj;
        this.locDormit = locDormit;
        this.mancare = mancare;
    }
    public abstract void locuieste();
    public abstract void delimiteazaTeritoriu();
    public void mananca(){
        System.out.println("Mamiferul mananca " + mancare);
    }
}
