package Data;

import java.util.ArrayList;
import java.util.List;

public class University {
    private  List<Teacher> teacherList = new ArrayList<>();
    private List<Student> studentList = new ArrayList<>();
    private List<Class> classList = new ArrayList<>();

    public University(List<Teacher> teacherList, List<Student> studentList, List<Class> classList ){
        this.teacherList = teacherList;
        this.studentList = studentList;
        this.classList = classList;
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

    public List<Class> getClassList() {
        return classList;
    }

    public void setClassList(List<Class> classList) {
        this.classList = classList;
    }
}
