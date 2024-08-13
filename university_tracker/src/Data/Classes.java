package Data;

import java.util.ArrayList;
import java.util.List;

public class Classes {
    private String name;
    private String classroom;
    private List<Student> studentList = new ArrayList<>();
    private Teacher teacher;

    public Classes(String name, String classroom, List<Student> studentList, Teacher teacher){
        this.name = name;
        this.classroom = classroom;
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        String students = "";
        String teacher = this.getTeacher().toString();

        for (Student s: this.getStudentList()){
            students = students.concat(s.toString() + "\n");
        }

        return String.format("""
                Name: %s
                Assigned classroom: %s
                Teacher: %s
                Students:
                %s\n""", this.getName(), this.getClassroom(), teacher, students);
    }
}
