package temaproblema2;

import singletonpachet.ClasaSingleton;

import java.util.ArrayList;
import java.util.Collections;

public class BazaDeDate{

    static int instanta = 0;

    private static BazaDeDate unicaInstanta = null;
    public final ArrayList<Reprezentanta> reprezentanta = new ArrayList<>();
    public final ArrayList<Vanzator> vanzator = new ArrayList<>();

    public ArrayList<Reprezentanta>getReprezentanta(){
        return reprezentanta;
    }
    public ArrayList<Vanzator>getVanzator(){
        return vanzator;
    }

    public static BazaDeDate returnDataBase(){
        if(unicaInstanta == null){
            unicaInstanta = new BazaDeDate();
            instanta++;
        }
        return unicaInstanta;
    }

    public static int returneazaNumarInstante(){
        return instanta;
    }

    public ArrayList<Reprezentanta>returneazaReprezentantaUnuiBrand(String brand){
        ArrayList<Reprezentanta> brandtemp = new ArrayList<>();
        for(Reprezentanta rep : reprezentanta){
            if(rep.checkBrand(brand)) brandtemp.add(rep);
        }
        return brandtemp;
    }

    public ArrayList<Vanzator>returneazaVanzatoriiUnuiBrand(String brand){
        ArrayList<Vanzator> tempSeller = new ArrayList<>();
        for(Vanzator seller : vanzator){
            if(seller.getSomeBrand(brand)) tempSeller.add(seller);
        }
        return tempSeller;
    }
    public ArrayList<Reprezentanta>returneazaReprezentanteDupaPretMediu(){
        ArrayList<Reprezentanta> sortedList = reprezentanta;
        for(int i = 0; i < sortedList.size() - 1; i++){
            for(int j = i + 1; j < sortedList.size(); j++){
                if(sortedList.get(i).mediaPreturilor() > sortedList.get(j).mediaPreturilor()) Collections.swap(sortedList,i,j);
            }
        }
        return sortedList;
    }

    public ArrayList<Reprezentanta>returneazaReprezentanteDupaPretBrand(String brand){
        ArrayList<Reprezentanta> sortedList = returneazaReprezentantaUnuiBrand(brand);
        for(int i = 0; i < sortedList.size() - 1; i++){
            for(int j = i + 1; j < sortedList.size(); j++){
                if(sortedList.get(i).returneazaPretulBrandului(brand) > sortedList.get(j).returneazaPretulBrandului(brand)) Collections.swap(sortedList,i,j);
            }
        }
        return sortedList;
    }


}
