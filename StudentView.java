package OOP.Lessen6;

import java.util.List;
// todo Тут используется 2, 3, 4 принципы
// 2 - класс открыт для наследников
// 3 - наследник не изменят поведения родителя
// 4 - принцип разделения интерфейса, этот интерфейс имеет только за один метод
public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student: list){
            System.out.println(student.getStudentId());
        }
    }
}
