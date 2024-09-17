package OOP.Lessen6;
// todo Тут используется 1, 2, 4 принципы
// 1 - тут только один метод
// 2 - если нужно добавить функционал, можно просто создать новый класс и имплементировать от этого класса
// 4 - принцип разделения интерфейса, этот интерфейс имеет только за один метод


import java.util.List;

public interface UserView<T extends User>{
   void sendOnConsole(List<T> list);
}
