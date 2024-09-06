package staticpachet;

public class ClassStatic {
    public static int staticId;
    public static String staticName;

    public int id;
    public String nume;

    static{
        System.out.println("Mesaj prin bloc-ul static");
        staticId = 6;
        staticName = "NumeStatic";

    }
    static{
        System.out.println("Al doilea bloc static");
    }
    public ClassStatic(int id, String name, int sid, String sname){
        this.id = id;
        this.nume = name;
        this.staticId = sid;
        this.staticName = sname;
        System.out.println(metodaStatica() + " din constructor");
    }
    public ClassStatic(int id, String name){
        this.id = id;
        this.nume = name;

        System.out.println(metodaStatica() + " din constructorul cu 2 param.");
    }

    public static String metodaStatica(){
        return "Apel metoda statica";
    }

}
