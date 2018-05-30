package aptech.fpt.spring.model;

import javax.persistence.*;

@Entity
public class Attentdance_Details {
    private int id;
    private Attendance_Slots attendance_slots;
    private Student student;
    private String time;
    private int status;

    public Attentdance_Details() {
    }

    public Attentdance_Details(int id, Attendance_Slots attendance_slots, Student student, String time, int status) {
        this.id = id;
        this.attendance_slots = attendance_slots;
        this.student = student;
        this.time = time;
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
    @JoinColumn(name = "id_as")
    public Attendance_Slots getAttendance_slots() {
        return attendance_slots;
    }

    public void setAttendance_slots(Attendance_Slots attendance_slots) {
        this.attendance_slots = attendance_slots;
    }

    @ManyToOne
    @JoinColumn(name = "student_id")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
