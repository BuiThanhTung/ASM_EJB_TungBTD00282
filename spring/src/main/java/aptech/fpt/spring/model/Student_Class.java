package aptech.fpt.spring.model;

import javax.persistence.*;

@Entity
public class Student_Class {
    private int id;
    private Student student;
    private Classes classes;
    private String create_date;
    private int status;

    public Student_Class() {
    }

    public Student_Class(int id, Student student, Classes classes, String create_date, int status) {
        this.id = id;
        this.student = student;
        this.classes = classes;
        this.create_date = create_date;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "student_id")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "class_id")
    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
