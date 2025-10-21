public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        // Agregar elementos
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Imprimir pila
        System.out.println("Despues de push:");
        stack.printStack();

        // Quitar un elemento
        System.out.println("Elemento eliminado: " + stack.pop());

        // Imprimir pila nuevamente
        System.out.println("Despues de pop:");
        stack.printStack();
    }
}

