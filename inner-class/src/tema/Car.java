package tema;

public class Car {
    public Car() {

    }

    enum CarType{
        Mercedes,
        Fiat,
        Skoda
    }
    int pret;
    int anFabricatie;
    CarType tip;

    public Car(int pret, int anFabricatie, CarType tip) {
        this.pret = pret;
        this.anFabricatie = anFabricatie;
        this.tip = tip;
    }
    @Override
    public String toString(){
        return "Masina din marca: " + tip + " fabricata in anul: " + anFabricatie + " cu pretul: " + pret;
    }
}
