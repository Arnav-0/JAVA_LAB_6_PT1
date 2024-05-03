import java.util.ArrayList;

abstract public class Growable_stk implements Interface_stk {
    private ArrayList<Integer> stack;
    private int top;

    public Growable_stk() {
        this.stack = new ArrayList<>(5);
        this.top = -1;
    }

    @Override
    public void push(int element) {
        if (isOverflow()) {

            System.out.println("Increasing stack capacity.");

        }

        top++;
        if (top < stack.size()) {
            stack.set(top, element);
        } else {
            stack.add(element);
        }
        System.out.println("Pushed element: " + element + ". Size: " + size() + ", Capacity: " + capacity());
    }

    @Override
    public void pop() {
        if (isUnderflow()) {
            System.out.println("Stack is Empty");

        }
        int element = stack.get(top);
        stack.remove(top);
        top--;
        System.out.println("Popped element: " + element + ". Size: " + size() + ", Capacity: " + capacity());

    }


    public void displayStack() {
        if (isUnderflow()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(stack.get(i));
        }
    }


    public boolean isOverflow() {

        return false;
    }


    public boolean isUnderflow() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int capacity() {
        return stack.size();
    }


}