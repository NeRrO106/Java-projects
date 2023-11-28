package constructori;

public class MainContructori {
    public static void main(String[] args){
        Student studentGeneral = new Student();
        Student gigel = new Student("Gigel", 10);
        Student dorel = new Student(gigel);

        System.out.println(studentGeneral.getNume());
        System.out.println(studentGeneral.medie);

        System.out.println(gigel.getNume());
        System.out.println(gigel.medie);

        gigel.medie = 7;
        System.out.println(gigel.medie);

        System.out.println(dorel.getNume());
        System.out.println(dorel.medie);

    }
}
