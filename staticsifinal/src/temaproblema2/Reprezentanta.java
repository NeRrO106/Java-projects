package temaproblema2;

import java.util.ArrayList;
import java.util.HashMap;

public class Reprezentanta {

    public String nume;
    public HashMap<String, Double> cars = new HashMap<>();

    public Reprezentanta(String rep1, HashMap<String, Double> h1) {
        this.nume = rep1;
        this.cars = h1;
    }

    public int mediaPreturilor(){
        Double medie = 0.0;
        int total = 0;
        for(Double value : cars.values()){
            medie += value;
            total ++;
        }
        return (int) (medie / total);
    }
    public Reprezentanta(Reprezentanta r){
        this.nume = r.nume;
        this.cars = r.cars;
    }
    public Double returneazaPretulBrandului(String brand){
        if(cars.containsKey(brand)) return cars.get(brand);
        return null;
    }

    public boolean checkBrand(String brand){
        if(cars.containsKey(brand)) return true;
        else return false;
    }

    @Override
    public String toString(){
        return "Reprezentanta: nume = " + nume + " cars = " + cars + ".";
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