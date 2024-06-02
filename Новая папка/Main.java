import java.util.List;

public class Main {
    public static void main(String[] args) {
        int teacherId = 1;
        List<Integer> studentIds = List.of(101, 102, 103);

        StudyGroup studyGroup = Controller.aggregateData(teacherId, studentIds);
        System.out.println("Преподаватель: " + studyGroup.getTeacher());
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println("ID: " + student.getStudentId() + ", Имя: " + student.getName());
        }
    }
}