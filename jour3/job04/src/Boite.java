import java.util.ArrayList;
import java.util.List;

public class Boite<T> {
    public ArrayList<T> list = new ArrayList<>();

    public void addList(T item){
        list.add(item);
    }

    public List<T> getAllList(){
        return list;
    }


}
