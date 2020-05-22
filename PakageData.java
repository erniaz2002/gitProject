package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class PakageData implements Serializable {
    private String operationType;
    private Student student;
    private ArrayList<Student> students;

    public PakageData(String operationType, Student student) {
        this.operationType = operationType;
        this.student = student;
    }

    public PakageData(ArrayList<Student> students) {
        this.students = students;
    }

    public PakageData(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationType() {
        return operationType;
    }

    public Student getStudent() {
        return student;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
