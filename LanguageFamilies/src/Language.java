import java.util.ArrayList;
class Language{

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;

    protected String wordOrder;

    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public void setRegion(String region){
        this.regionsSpoken = region;
    }
    public void setSpeakers(int speakers){
        this.numSpeakers = speakers;
    }

    public void setWordOrder(String word){
        this.wordOrder = word;
    }

    public static void main(String[] args){
        ArrayList<Language> language = new ArrayList<>();
        Language spanish = new Language("Spanish", 555000000,"Spain", "subject-verb-object");
        language.add(spanish);

        Mayan kiche = new Mayan("Ki'che'", 2330000);
        language.add(kiche);

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        language.add(mandarin);

        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        language.add(burmese);
        for(Language lang : language){
            lang.getInfo();
        }
    }
}