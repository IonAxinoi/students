import java.util.List;

public class StudyGroupService {
    public static StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
