package constructori;

public class Student {
    private String nume;
    public int medie;

    public Student(){
        setNume("Necunoscut");
        this.medie = 4;
    }

    public Student(String nume){
        this(nume, 4);
    }

    public Student(String nume, int medie){
        setNume(nume);
        this.medie = medie;
    }

    public Student(Student s){
        setNume(s.getNume());
        this.medie = s.medie;
    }

    String getNume(){
        return nume;
    }

    void setNume(String nume){
        this.nume = nume;
    }

}
