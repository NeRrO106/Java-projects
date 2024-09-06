package singletonpachet;

public class ClasaSingleton {
    private static ClasaSingleton unicaInstanta = null;
    public String s;

    static{
        unicaInstanta = new ClasaSingleton();
    }

    private ClasaSingleton(){
        s = "Constructorul privat al clasei";
    }
    public static ClasaSingleton getInstance(){
        return unicaInstanta;
    }
}
