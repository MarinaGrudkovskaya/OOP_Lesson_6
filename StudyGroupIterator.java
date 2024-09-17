package OOP.Lessen6;



import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
// todo Тут используется 2, 3 принципы
// 5 - наследуется от интерфейса
public class StudyGroupIterator implements Iterator<Student> {

    private int count;
    private final List<Student> studentList;

    public StudyGroupIterator(StudyGroup studyGroup) {
        this.count = 0;
        this.studentList = studyGroup.getStudentList();
    }

    @Override
    public boolean hasNext() {
        return count < studentList.size()-1;
    }

    @Override
    public Student next() {
        if(!hasNext()){
            return null;
        }
        count++;
        return studentList.get(count);
    }

    @Override
    public void remove() {
        studentList.remove(count);
    }
}
