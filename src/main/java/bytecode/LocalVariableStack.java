package bytecode;

import java.util.Stack;
import java.util.Vector;

public class LocalVariableStack extends Vector<String> {
    private Stack<Integer> pointers;

    public LocalVariableStack() {
        super();
        pointers = new Stack<>();
    }

    public int getStackpointer(){
        return size();
    }

    public void setStackpointer(int stackpointer){
        setSize(stackpointer);
    }

    public int push(String identifier){
        addElement(identifier);
        return getStackpointer() - 1;
    }

    public void startBlock(){
        pointers.push(getStackpointer());
    }

    public void endBlock(){
        setStackpointer(pointers.pop());
    }

    public int get(String identifier) {
        return lastIndexOf(identifier);
    }
}
