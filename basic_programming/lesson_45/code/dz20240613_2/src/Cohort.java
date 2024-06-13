import java.util.List;

public class Cohort {
    private String title;
    private List<Student> students;


    public Cohort(String title, List<Student> list) {
        this.title = title;
        this.students = list;
    }

    @Override
    public String toString() {
        return "Cohort{" +
                "title='" + title + '\'' +
                ", list=" + students +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getStudents() {
        return students;
    }
}
