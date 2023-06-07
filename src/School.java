import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class School {
    private HashMap<String, List<Student>> classes;

    public School() {

        this.classes = new HashMap<>();
    }

    public void addStudent(Student student) {
        if (!classes.containsKey(student.getClassName())) {
            classes.put(student.getClassName(), new ArrayList<>());
        }
        classes.get(student.getClassName()).add(student);
    }

    public List<Student> getStudentsInDateRange(Date startDate, Date endDate) {
        List<Student> result = new ArrayList<>();
        for (List<Student> students : classes.values()) {
            for (Student student : students) {
                if (student.getDateOfBirth().after(startDate) && student.getDateOfBirth().before(endDate)) {
                    result.add(student);
                }
            }
        }

        return result;
    }
}
