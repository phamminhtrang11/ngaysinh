import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student extends Human {
    private String className;
    private int grade;
    private String school;

    public Student(String fullName, String cccd, int age, Date dateOfBirth, String className, int grade, String school) {
        super(fullName, cccd, age, dateOfBirth);
        this.className = className;
        this.grade = grade;
        this.school = school;
    }

    public String getClassName() {

        return className;
    }

    public int getGrade() {
        return grade;
    }


    public String getSchool() {

        return school;
    }

}