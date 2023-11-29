public class DNA{
    public static void main(String[] args){
        //dna test
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna1;
        System.out.println(dna.length());

        int start = dna.indexOf("ATG");
        int stop = dna.indexOf("TGA");
        if(start != -1 &&
           stop != -1 &&
           (stop-start) % 3 == 0){
            String protein = dna.substring(start, stop+3);
            System.out.println("Primele 3 conditii indeplinite");
        }
        else{
            System.out.println("No protein");
        }

    }
}