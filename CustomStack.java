import java.util.ArrayList;

public class CustomStack<T> {
    ArrayList<T> elements = new ArrayList<>();

    public void push(T item){
        elements.add(item);
    }

    public T pop(){
        if(elements.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        } else{
           return elements.remove(elements.size()-1);
        }
        
    }

    public T peek(){
        if(elements.isEmpty()){
            throw new IllegalStateException("Stack is empty");
        } else{
           return elements.get(elements.size()-1);
        }
    }

    public static void main(String[] args){
        CustomStack<String> stringStack = new CustomStack<>();
        stringStack.push("apple");
        stringStack.push("orange");
        stringStack.push("banana");

        System.out.println("Removed String:" + stringStack.pop());
        System.out.println("Top String:" + stringStack.peek());

        CustomStack<Integer> intstack = new CustomStack<>();
        intstack.push(1);
        intstack.push(2);
        intstack.push(3);

        System.out.println("Removed Integer:" + intstack.pop());
        System.out.println("Top Integer:" + intstack.peek());

    }
}


