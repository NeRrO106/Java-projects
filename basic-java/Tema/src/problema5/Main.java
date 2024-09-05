package problema5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> alegeStudent(int anAles, ArrayList<Student>listaTotiStudenti){
        ArrayList<Student> listaStudentiAn = new ArrayList<Student>();
        for(int i = 0; i<listaTotiStudenti.size();i++){
            if(listaTotiStudenti.get(i).anStudii == anAles){
                listaStudentiAn.add(listaTotiStudenti.get(i));
            }
        }
        return listaStudentiAn;
    }
    static ArrayList<Curs> alegeCurs(int anAles, ArrayList<Curs>listaToateCursurile){
        ArrayList<Curs> listaCursAn = new ArrayList<Curs>();
        for(int i = 0; i<listaToateCursurile.size();i++){
            if(listaToateCursurile.get(i).anCurs == anAles){
                listaCursAn.add(listaToateCursurile.get(i));
            }
        }
        return listaCursAn;
    }

    public static void main(String[] args) {
        ArrayList<Student> listaTotiStudentii = new ArrayList<Student>();
        ArrayList<Curs> listaToateCursurile = new ArrayList<Curs>();

        Student stud1 = new Student("An1", 1);
        listaTotiStudentii.add(stud1);

        Student stud2 = new Student("An1", 1);
        listaTotiStudentii.add(stud2);

        Student stud3 = new Student("An2", 2);
        listaTotiStudentii.add(stud3);

        Student stud4 = new Student("An2", 2);
        listaTotiStudentii.add(stud4);

        Student stud5 = new Student("An3", 3);
        listaTotiStudentii.add(stud5);

        Student stud6 = new Student("An3", 3);
        listaTotiStudentii.add(stud6);

        Student stud7 = new Student("An4", 4);
        listaTotiStudentii.add(stud7);

        Student stud8 = new Student("An4", 4);
        listaTotiStudentii.add(stud8);

        Curs curs1 = new Curs("Algad",1);
        listaToateCursurile.add(curs1);

        Curs curs2 = new Curs("Analiza",2);
        listaToateCursurile.add(curs2);

        Curs curs3 = new Curs("RM",3);
        listaToateCursurile.add(curs3);

        Curs curs4 = new Curs("ED",4);
        listaToateCursurile.add(curs4);

        System.out.println("Zi ce an alegi de la 1 la 4");
        Scanner scanner = new Scanner(System.in);
        int anAles = scanner.nextInt();

        ArrayList<Student> listaStudentiAn = alegeStudent(anAles,listaTotiStudentii);
        ArrayList<Curs> listaCursuriAn = alegeCurs(anAles,listaToateCursurile);
        System.out.println("Studentii urmatori sunt in anul " + anAles + ": ");
        for(int i = 0; i< listaStudentiAn.size(); i++){
            System.out.println(listaStudentiAn.get(i).numeStudent);
        }
        System.out.println("si vor studia: ");
        for(int i = 0;i < listaCursuriAn.size(); i++) System.out.println(listaCursuriAn.get(i).titluCurs);

    }
}
