import java.util.Arrays;

public class ArrayStack<T> implements MyStack<T> {

    private Object[] data;
    private int top;

    public ArrayStack() {
        this(10);
    }

    public ArrayStack(int initialCapacity) {
       this.data = new Object[initialCapacity];
    }

    
    @Override
    public void push(T value) {
        this.data[top++] = value;
    }

    @Override
    public T pop() {
       if(isEmpty()) {
          System.out.println("Stack is empty");
            return null;
       }
       T value = (T) this.data[--top];
       data[top] = null;
       return value;
       
    }

    @Override
    public T peek() {
      if(isEmpty()) {
          System.out.println("Stack is empty");
            return null;
       }
       return (T) this.data[top];
    }

    @Override
    public boolean isEmpty() {
       if(top == 0) {
          return true;
       }
         return false;
    }

    @Override
    public int size() {
         return top;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    public void addCapacity() {
        if(top==data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }

    }

    // Método para imprimir los elementos de la pila
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

