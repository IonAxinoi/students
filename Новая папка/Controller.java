import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static StudyGroup aggregateData(int teacherId, List<Integer> studentIds) {
        Teacher teacher = new Teacher(teacherId, "Преподаватель Имя");
        List<Student> students = createStudents(studentIds);
        
        return StudyGroupService.createStudyGroup(teacher, students);
    }

    private static List<Student> createStudents(List<Integer> studentIds) {
        List<Student> students = new ArrayList<>();
        for (int studentId : studentIds) {
            students.add(new Student(studentId, "Студент " + studentId));
        }
        return students;
    }
}