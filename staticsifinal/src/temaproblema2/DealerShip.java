package temaproblema2;
import java.util.ArrayList;
import java.util.HashMap;

public class DealerShip {

    public static void main(String[] args){
        ArrayList <String> str1 = new ArrayList<>();
        str1.add("Mercedes");
        str1.add("BMW");
        str1.add("Subaru");

        ArrayList <String> str2 = new ArrayList<>();
        str2.add("Toyota");
        str2.add("Porsche");
        str2.add("Ferrari");

        ArrayList <String> str3 = new ArrayList<>();
        str3.add("Mitsubishi");
        str3.add("Dodge");
        str3.add("Ford");

        Vanzator v1 = new Vanzator("Seller 1", str1);
        Vanzator v2 = new Vanzator("Seller 2", str2);
        Vanzator v3 = new Vanzator("Seller 3", str3);

        ArrayList<Vanzator> sellers = new ArrayList<>();
        ArrayList<Reprezentanta> reprezentanta = new ArrayList<>();

        sellers.add(v1);
        sellers.add(v2);
        sellers.add(v2);

        HashMap<String, Double> h1 = new HashMap<>();
        HashMap<String, Double> h2 = new HashMap<>();
        HashMap<String, Double> h3 = new HashMap<>();

        h1.put("Mercedes", 50000.1);
        h1.put("BMW", 70000.1);
        h1.put("Subaru", 30000.1);

        h2.put("Toyota", 30000.2);
        h2.put("Porsche", 10000.2);
        h2.put("Ferrari", 200000.2);

        h3.put("Mitsubishi", 40000.3);
        h3.put("Dodge", 25000.3);
        h3.put("Ford", 30000.3);

        Reprezentanta r1 = new Reprezentanta("Rep1", h1);
        Reprezentanta r2 = new Reprezentanta("Rep2", h2);
        Reprezentanta r3 = new Reprezentanta("Rep3", h3);

        reprezentanta.add(r1);
        reprezentanta.add(r2);
        reprezentanta.add(r3);

        BazaDeDate db = BazaDeDate.returnDataBase();
        for(Reprezentanta rep : reprezentanta){
            db.reprezentanta.add(rep);
        }
        for(Vanzator seller : sellers){
            db.vanzator.add(seller);
        }
        for(Reprezentanta rep : db.returneazaReprezentantaUnuiBrand("BMW")){
            System.out.println(rep.toString());
        }
        for(Reprezentanta rep : db.returneazaReprezentanteDupaPretMediu()){
            System.out.println(rep.toString());
        }
        for(Reprezentanta rep : db.returneazaReprezentanteDupaPretBrand("Subaru")){
            System.out.println(rep.toString());
        }

    }

}
