import java.util.Arrays;

interface MyStack<T> {
    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
}

class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.top = 0;
    }

    @Override
    public void push(T value) {
        addCapacity();
        this.data[top++] = value;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        T value = (T) this.data[--top];
        data[top] = null;
        return value;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return (T) this.data[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    //  clear() implementado 
    @Override
    public void clear() {
        for (int i = 0; i < top; i++) {
            data[i] = null; // vaciamos los elementos
        }
        top = 0;
        System.out.println("Stack cleared");
    }

    private void addCapacity() {
        if (top == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    // Metodo para imprimir la pila
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements (top → bottom): ");
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Después de push:");
        stack.printStack();

        System.out.println("Elemento eliminado: " + stack.pop());

        System.out.println("Después de pop:");
        stack.printStack();

        // Vaciar la pila
        stack.clear();

        System.out.println("Después de clear:");
        stack.printStack();
    }
}
