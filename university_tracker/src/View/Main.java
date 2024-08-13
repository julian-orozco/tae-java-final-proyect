package View;

import Data.*;

import java.lang.Class;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
    }

    public static void menu(){

    }


    // Parttime teachers
    static PartTimeTeacher pt1 = new PartTimeTeacher("Jose", 1000.0, 30);
    static PartTimeTeacher pt2 = new PartTimeTeacher("Laura", 1100.0, 25);

    //Fulltime teachers
    static FullTimeTeacher ft1 = new FullTimeTeacher("Gloria", 1300.0, 10);
    static FullTimeTeacher ft2 = new FullTimeTeacher("Miguel", 1400.0, 15);

    //Teachers list
    static List<Teacher> teachers = new ArrayList<>(){
        {
            teachers.add(pt1);
            teachers.add(pt2);
            teachers.add(ft1);
            teachers.add(ft2);
        }
    };

    // Students instances
    static Student st1 = new Student("Pepe", 1, 13);
    static Student st2 = new Student("Ana", 2, 14);
    static Student st3 = new Student("Luis", 3, 15);
    static Student st4 = new Student("Maria", 4, 16);
    static Student st5 = new Student("Juan", 5, 17);
    static Student st6 = new Student("Sofia", 6, 13);
    static Student st7 = new Student("Carlos", 7, 14);
    static Student st8 = new Student("Lucia", 8, 15);
    static Student st9 = new Student("Pedro", 9, 16);
    static Student st10 = new Student("Elena", 10, 17);

    //Students List
    static List<Student> students = new ArrayList<>(){{
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);
        students.add(st9);
        students.add(st10);
    }};

    // Lists of students for classes
    static List<Student> studentsList1 = new ArrayList<>() {{
        add(st1);
        add(st2);
        add(st3);
        add(st4);
    }};

    static List<Student> studentsList2 = new ArrayList<>() {{
        add(st5);
        add(st6);
        add(st7);
        add(st8);
    }};

    static List<Student> studentsList3 = new ArrayList<>() {{
        add(st9);
        add(st10);
    }};

    static List<Student> studentsList4 = new ArrayList<>() {{
        add(st1);
        add(st3);
        add(st5);
        add(st7);
        add(st9);
    }};

    // Classes
    static Classes c1 = new Classes("Biology", "5-B", studentsList1, pt1);
    static Classes c2 = new Classes("Mathematics", "3-A", studentsList2, ft1);
    static Classes c3 = new Classes("Chemistry", "4-C", studentsList3, pt2);
    static Classes c4 = new Classes("History", "2-D", studentsList4, ft2);
}