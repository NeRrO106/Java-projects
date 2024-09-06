package pachetlaborator05;

public class ClasaExterioara {
    String campClasaExt = "campStaticClasaExt";
    static String campStaticClasaExt = "Camp Static Clasa Ext";
    int x = 0;
    class CLasaInterna{
        int x = 1;
        void accesMembri() {
            System.out.println(campClasaExt);
            System.out.println(campStaticClasaExt);
        }
        void afisare(int x){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(ClasaExterioara.this.x);
        }
    }
    static class ClasaInterfata{
        void accesMembri(ClasaExterioara referinta){
            System.out.println(referinta.campClasaExt);
            System.out.println(campStaticClasaExt);
        }
    }
}
