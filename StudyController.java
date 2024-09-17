package OOP.Lessen6;

import java.util.List;
// todo Тут используется 5 принцип
// 5 - наследуется от интерфейса
public class StudyController implements UserController<Student> {
    private final StudyGroupServise studyGroupServise = new StudyGroupServise();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO  (String firstName, String lastName, String middleName) {
        studyGroupServise.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> getSortedStudentList(){
        List<Student> studentList = studyGroupServise.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studyGroupServise.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }
    private StreamServise streamServise;

    public StudyController() {
        this.streamServise = streamServise;
    }
    public void sortStream(List<Stream> streamList){
        streamServise.sortStreamBySize();
    }


    @Override
    public void create(String firstName, String LastName, String middleName) {
        studyGroupServise.createStudent(firstName, LastName, middleName);
    }
}

