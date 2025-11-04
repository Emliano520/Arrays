import java.util.Stack;

public class ArrayQueue<T> {
    private Object[] elements; // arreglo genérico
    private int front; // índice del frente
    private int rear;  // índice del final
    private int size;  // cuántos elementos hay

    public ArrayQueue(int capacity) {
        elements = new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Agregar un elemento al final
    public void enqueue(T item) {
        if (size == elements.length) {
            System.out.println("Queue llena, no se puede agregar: " + item);
            return;
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = item;
        size++;
    }

    // Quitar elemento del frente
    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue vacía");
            return null;
        }
        T item = (T) elements[front];
        front = (front + 1) % elements.length;
        size--;
        return item;
    }

    // Ver si está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Ver tamaño
    public int size() {
        return size;
    }

    // Mostrar la cola
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % elements.length;
            System.out.print(elements[index] + " ");
        }
        System.out.println();
    }

    // 🔄 Invertir la cola usando un stack auxiliar
    @SuppressWarnings("unchecked")
    public void reverse() {
        Stack<T> stack = new Stack<>();

        // Pasamos los elementos del queue al stack
        while (!isEmpty()) {
            stack.push(dequeue());
        }

        // Regresamos los elementos al queue (invertidos)
        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }
    }
}

