package Data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private int age;
    public static List<Integer> ids = new ArrayList<>();

    public Student(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
        Student.ids.add(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Name: %s - Id: %d - Age: %d", this.getName(), this.getId(), this.getAge());
    }
}
