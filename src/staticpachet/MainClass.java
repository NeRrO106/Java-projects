package staticpachet;

public class MainClass {

    public static void main(String[] args){
        System.out.println("Campul staticId " + ClassStatic.staticId);
        System.out.println("Campul staticName " + ClassStatic.staticName);
        System.out.println(ClassStatic.metodaStatica());

        System.out.println();

        ClassStatic cs = new ClassStatic(2, "Ana", 5, "Ionel");
        System.out.println(cs.id);
        System.out.println(cs.nume);
        System.out.println(cs.staticId);
        System.out.println(cs.staticName);

        System.out.println();

        ClassStatic cs2 = new ClassStatic(22, "Ana");
        System.out.println(cs2.id);
        System.out.println(cs2.nume);

        System.out.println(ClassStatic.staticId);
        System.out.println(ClassStatic.staticName);

    }

}
