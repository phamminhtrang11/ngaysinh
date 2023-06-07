import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Nguyễn Văn A", "CCCD 1", 15, new Date(2005, 2, 12), "10A", 10, "Trường A");
        Student student2 = new Student("Nguyễn Thị B", "CCCD 2", 16, new Date(2004, 6, 2), "10A", 10, "Trường A");
        Student student3 = new Student("Trần Văn C", "CCCD 3", 14, new Date(2006, 8, 25), "9B", 9, "Trường B");
        Student student4 = new Student("Lê Thị D", "CCCD 4", 17, new Date(2003, 10, 5), "11C", 11, "Trường C");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);

        Date startDate = new Date(2003, 11, 1);
        Date endDate = new Date(2006, 11, 12);
        List<Student> studentsInDateRange = school.getStudentsInDateRange(startDate, endDate);

        for (Student student : studentsInDateRange) {
            System.out.println(student.getFullName() + " " + student.getDateOfBirth());
        }
    }
}

