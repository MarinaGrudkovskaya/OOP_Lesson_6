package OOP.Lessen6;

import java.util.Iterator;
import java.util.List;
// todo Тут используется 5 принцип
// 5 - наследуется от интерфейса
public class Stream implements Iterable<StudyGroup>{
    private List<StudyGroup> studyGroupList;
    private String name;

    public Stream(List<StudyGroup> studyGroupList, String name) {
        this.studyGroupList = studyGroupList;
        this.name = name;
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudyGroup> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroupList.iterator();
    }
}
