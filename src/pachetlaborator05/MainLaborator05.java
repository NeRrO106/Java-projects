package pachetlaborator05;

public class MainLaborator05 {
    public static void main(String[] args){
        ClasaExterioara obiectClasaExt = new ClasaExterioara();
        obiectClasaExt.campClasaExt = "Camp clasa exterioara obiect";
        obiectClasaExt.x = 5;
        ClasaExterioara.campStaticClasaExt = "Camp static clasa exterioara modificat";
        ClasaExterioara.CLasaInterna obiectClasaInt = obiectClasaExt.new CLasaInterna();
        obiectClasaInt.accesMembri();
        obiectClasaInt.afisare(20);
        ClasaExterioara.ClasaInterfata obiectInterfata = new ClasaExterioara.ClasaInterfata();
        obiectInterfata.accesMembri(obiectClasaExt);
    }
}
