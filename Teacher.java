package OOP.Lessen6;
// todo Тут используется 2, 3 принципы
// 2 - класс открыт для наследников
// 3 - наследник не изменят поведения родителя

public class Teacher extends User{
    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
