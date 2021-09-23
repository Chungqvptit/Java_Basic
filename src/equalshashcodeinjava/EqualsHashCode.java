/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalshashcodeinjava;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADMIN
 */
/**
 * create class student
 * @author ADMIN
 */
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Student)){
            return false;
        }

        Student otherStudent = (Student) obj;
        if(this.id == otherStudent.id){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return id;
    }
}
public class EqualsHashCode {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(1, "Nguyen Van A");
        System.out.println(student1.equals(student2));

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);

        for(Student element:studentSet){
            System.out.println(element);
        }
    }
}
