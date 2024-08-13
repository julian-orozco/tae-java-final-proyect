package Data;

import java.util.ArrayList;
import java.util.List;

public class University {
    private  List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();
    private List<Classes> classesList = new ArrayList<>();

    public University(List<Teacher> teacherList, List<Student> studentList, List<Classes> classesList){
        this.teacherList = teacherList;
        this.studentList = studentList;
        this.classesList = classesList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public List<Classes> getClassList() {
        return classesList;
    }

    public void setClassList(List<Classes> classesList) {
        this.classesList = classesList;
    }
}
