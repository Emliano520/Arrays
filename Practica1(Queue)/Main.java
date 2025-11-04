public class Main {
    public static void main(String[] args) {
        ArrayQueue<Customer> queue = new ArrayQueue<>(10);

        // Agregamos 5–6 clientes
        queue.enqueue(new Customer(1, "Ana"));
        queue.enqueue(new Customer(2, "Luis"));
        queue.enqueue(new Customer(3, "Carlos"));
        queue.enqueue(new Customer(4, "María"));
        queue.enqueue(new Customer(5, "Sofía"));
        queue.enqueue(new Customer(6, "Jorge"));

        System.out.println("Queue original:");
        queue.printQueue();

        // Invertimos la cola
        queue.reverse();

        System.out.println("\nQueue invertida:");
        queue.printQueue();

        System.out.println("\nNúmero de elementos: " + queue.size());
    }
}
