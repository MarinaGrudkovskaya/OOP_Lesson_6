package OOP.Lessen6;

import java.util.Comparator;
// todo Тут используется 1, 3, 4 принципы
// 1 - Этот класс создан только для реализации метода интерфейса Comparator
// 3 - наследник не изменят поведения родителя
// 4 - принцип разделения интерфейса, этот интерфейс имеет только за один метод

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.getStudyGroupList().size() - o1.getStudyGroupList().size();
    }
}
