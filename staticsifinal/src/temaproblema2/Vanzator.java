package temaproblema2;


import java.util.ArrayList;

public class Vanzator {
    public String nume;
    ArrayList<String> brand = new ArrayList<String>();

    Vanzator(Vanzator v){
        this.nume = nume;
        this.brand = brand;
    }

    public Vanzator(String s, ArrayList<String> str1) {
        this.nume = s;
        this.brand = str1;
    }

    public boolean getSomeBrand(String brand){
        if(this.brand.contains(brand)) return true;
        else return false;
    }
    @Override
    public String toString(){
        return "Vanzator: nume = " + nume + " brands = " + brand + ".";
    }
    public ArrayList<Reprezentanta> getReprezentanta(){
        return BazaDeDate.returnDataBase().getReprezentanta();
    }
    public ArrayList<Vanzator> getVanzator(){
        return BazaDeDate.returnDataBase().getVanzator();
    }
    public ArrayList<Vanzator>returneazaVanzatoriiUnuiBrand(String brand){
        return BazaDeDate.returnDataBase().returneazaVanzatoriiUnuiBrand(brand);
    }
    public ArrayList<Reprezentanta>returneazaReprezentanteDupaPretMediu(){
        return BazaDeDate.returnDataBase().returneazaReprezentanteDupaPretMediu();
    }
    public ArrayList<Reprezentanta>returneazaReprezentanteDupaPretBrand(String brand){
        return BazaDeDate.returnDataBase().returneazaReprezentanteDupaPretBrand(brand);
    }
    public ArrayList<Reprezentanta>returneazaReprezentantaUnuiBrand(String brand){
        return BazaDeDate.returnDataBase().returneazaReprezentantaUnuiBrand(brand);
    }
}
