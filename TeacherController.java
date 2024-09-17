package OOP.Lessen6;
// todo Тут используется 2, 3 принципы
// 2 - класс открыт для наследников
// 3 - наследник не изменят поведения родителя

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private TeacherServise teacherServise = new TeacherServise();

    @Override
    public void create(String firstName, String LastName, String middleName) {
        teacherServise.createTeacher(firstName, LastName, middleName);
    }
}
