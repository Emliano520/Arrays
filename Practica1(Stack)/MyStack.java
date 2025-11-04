public class MyStack<T> {
    private Object[] elements;
    private int top;
    private int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1;
    }

    public void push(T value) {
        if (top == capacity - 1) {
            System.out.println("Stack lleno");
            return;
        }
        elements[++top] = value;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack vacío");
            return null;
        }
        return (T) elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void clear() {
        top = -1;
    }
}

