package singletonpachet;

public class MainSingleton {

    public static void main(String[] args){
        ClasaSingleton cs1 = ClasaSingleton.getInstance();
        ClasaSingleton cs2 = ClasaSingleton.getInstance();

        System.out.println((cs1.s).toLowerCase());
        System.out.println((cs2.s).toLowerCase());

        System.out.println();

        System.out.println((cs1.s).toUpperCase());
        System.out.println((cs2.s).toUpperCase());

        System.out.println();

        System.out.println(cs1 == cs2);

    }
}
