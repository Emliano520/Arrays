public class Main {
    public static void main(String[] args) {
        MyLinkedList original = new MyLinkedList();
        MyLinkedList pares = new MyLinkedList();
        MyLinkedList impares = new MyLinkedList();

        // Agregamos valores a la lista original
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);
        original.add(6);

        System.out.println("Lista original:");
        original.printList();

        // Dividimos
        MyLinkedList.splitEvenOdd(original, pares, impares);

        System.out.println("\nLista de pares:");
        pares.printList();

        System.out.println("\nLista de impares:");
        impares.printList();
    }
}
