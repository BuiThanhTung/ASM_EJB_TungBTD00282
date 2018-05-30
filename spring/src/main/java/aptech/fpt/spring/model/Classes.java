package aptech.fpt.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classes {
    private String class_id;
    private String create_date;

    public Classes() {
    }

    public Classes(String class_id, String create_date) {
        this.class_id = class_id;
        this.create_date = create_date;
    }

    @Id
    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }
}
