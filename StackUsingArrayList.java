import java.util.ArrayList;

public class StackUsingArrayList<T> {

    private ArrayList<T> stackList;

    public StackUsingArrayList() {
        stackList = new ArrayList<>();
    } // Function to check if the stack is empty

    public boolean isEmpty() {
        return stackList.isEmpty();
    } // Function to push an element onto the stack

    public void push(T value) {
        stackList.add(value);
    } // Function to pop an element from the stack

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackList.remove(stackList.size() - 1);
    } // Function to get the top element of the stack without popping it

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return stackList.get(stackList.size() - 1);
    }
}
