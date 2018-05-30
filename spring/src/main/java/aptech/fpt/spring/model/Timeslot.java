package aptech.fpt.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Timeslot {
    private int slot_id;
    private String time;

    public Timeslot() {
    }

    public Timeslot(int slot_id, String time) {
        this.slot_id = slot_id;
        this.time = time;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
