package OOP.Lessen6;


import java.util.Iterator;
import java.util.List;
// todo Тут используется 2, 3 принципы
// 2 - класс открыт для наследников
// 3 - наследник не изменят поведения родителя
public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void createStudent(String firstName, String LastName, String middleName){
        studentList.add(new Student(firstName, LastName, middleName));
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudyGroupIterator(this);
    }
}