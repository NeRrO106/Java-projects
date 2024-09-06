package problema1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Om roman = new Om("Dorel", 100,"Europa","Marcaj", "Casa", "Pastrama");
        Om chinez = new Om("Viorel", 55,"China","Marcaj", "Bloc", "Mici cu paine si mustar");
        Om peruan = new Om("Andrew", 75,"Peru","Marcaj", "Casa", "Fish and chips");
        
        ArrayList<Om> oameni = new ArrayList<>();
        oameni.add(roman);
        oameni.add(chinez);
        oameni.add(peruan);
        
        AnimalDomestic caine = new AnimalDomestic("caine",25,"Europa","Marcaj","Strada","oase");
        AnimalDomestic pisica = new AnimalDomestic("pisica",5,"Europa","Marcaj","Strada","pliculet");
        AnimalDomestic porc = new AnimalDomestic("porc",120,"Europa","Marcaj","Cotet","Resturi");
        
        ArrayList<AnimalDomestic> animale1 = new ArrayList<>();
        animale1.add(caine);
        animale1.add(pisica);
        animale1.add(porc);
        
        AnimalSalbatic maimuta = new AnimalSalbatic("maimuta", 30, "Asia", "Marcaj", "In pom", "banane");
        AnimalSalbatic elefant = new AnimalSalbatic("elefant", 5000, "Africa", "Marcaj", "In savana", "arahide");
        AnimalSalbatic camila = new AnimalSalbatic("camila", 500, "Africa", "Marcaj", "in desert", "iarba");
        
        ArrayList<AnimalSalbatic> animale2 = new ArrayList<>();
        animale2.add(maimuta);
        animale2.add(elefant);
        animale2.add(camila);
        
        for(Om om : oameni){
            om.delimiteazaTeritoriu();
            om.locuieste();
            om.mananca();
        }
        for(AnimalDomestic animal : animale1){
            animal.delimiteazaTeritoriu();
            animal.locuieste();
            animal.mananca();
        }
        for(AnimalSalbatic animal2 : animale2){
            animal2.delimiteazaTeritoriu();
            animal2.locuieste();
            animal2.mananca();
        }
        
    }
}
