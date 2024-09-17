package OOP.Lessen6;

import java.util.List;
// todo Тут используется 1 принцип
// 1 - Только один метод
// 5 - класс наследуется от интерфейса

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher: list){
            System.out.println(teacher.getFirstName());
        }
    }
}
