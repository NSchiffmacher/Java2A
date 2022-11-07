package stacks;
import java.util.ArrayList;

public class WrongStack<E> extends ArrayList<E>{
    public WrongStack(){
        super();
    }
    

    public void push(E element){
        if (element != null){
            this.add(0, element);
        }
    }

    public E pop(){
        if (!this.isEmpty()){
            E tmp = this.get(0);
            this.remove(0);
            return tmp;
        }
        return null;
    }
}
