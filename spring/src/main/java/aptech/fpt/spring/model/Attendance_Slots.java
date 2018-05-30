package aptech.fpt.spring.model;

import javax.persistence.*;

@Entity
public class Attendance_Slots {
    private int id_as;
    private Classes classes;
    private Timeslot timeslot;
    public String sub_id;
    private String  attendance_date;
    private int status;

    public Attendance_Slots() {
    }

    public Attendance_Slots(int id_as, Classes classes, Timeslot timeslot, String sub_id, String attendance_date, int status) {
        this.id_as = id_as;
        this.classes = classes;
        this.timeslot = timeslot;
        this.sub_id = sub_id;
        this.attendance_date = attendance_date;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId_as() {
        return id_as;
    }

    public void setId_as(int id_as) {
        this.id_as = id_as;
    }

    @ManyToOne
    @JoinColumn(name = "class_id")
    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @ManyToOne
    @JoinColumn(name = "slot_id")
    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public String getAttendance_date() {
        return attendance_date;
    }

    public void setAttendance_date(String attendance_date) {
        this.attendance_date = attendance_date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
