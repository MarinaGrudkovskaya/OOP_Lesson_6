package OOP.Lessen6;

import java.util.Comparator;
// todo Тут используется 1, 2, 3, 4 принципы
// 1 - Этот класс создан только для реализации метода интерфейса Comparator
// 2 - если нужно добавить функционал, можно просто создать новый класс, например StreamComparator
// 3 - Благодаря дженерикам <T extends User> возможно создавать наследников, которые не изменят поведения родителя
// 4 - принцип разделения интерфейса, этот интерфейс имеет только за один метод
public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfComparing == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
