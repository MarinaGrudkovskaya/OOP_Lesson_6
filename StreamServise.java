package OOP.Lessen6;
// todo Тут используется 1 принципы
// 1 - отвечает только за один класс
import java.util.ArrayList;
import java.util.List;


public class StreamServise {

    private Stream stream;

    public List<Stream> sortStreamBySize(){
        List<Stream> streamList = new ArrayList<>();
        streamList.sort(new StreamComparator());
        return streamList;
    }

}
