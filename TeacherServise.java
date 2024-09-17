package OOP.Lessen6;
// todo Тут используется 1 принципы
// 1 - отвечает только за один класс

public class TeacherServise {

    public Teacher createTeacher(String firstName, String lastName, String middleName){
        return new Teacher(firstName, lastName, middleName);
    }

}
