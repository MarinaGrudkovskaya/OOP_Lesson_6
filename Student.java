package OOP.Lessen6;
// todo Тут используется 2, 3 принципы
// 2 - класс открыт для наследников
// 3 - наследник не изменят поведения родителя

public class Student extends User implements Comparable<Student> {
    private Long studentId;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}