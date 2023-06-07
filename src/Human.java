import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Human {
    private String fullName;
    private String cccd;
    private int age;
    private Date dateOfBirth;

    public Human(String fullName, String cccd, int age, Date dateOfBirth) {
        this.fullName = fullName;
        this.cccd = cccd;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }
    public String getFullName() {
        return fullName;
    }

    public String getCccd() {
        return cccd;
    }

    public int getAge() {
        return age;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

}