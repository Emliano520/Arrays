public class MyLinkedList {
    private Node head;

    // Agregar un elemento al final
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Mostrar la lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Obtener la cabeza de la lista (para recorrerla desde otra clase)
    public Node getHead() {
        return head;
    }

    // Dividir en pares e impares
    public static void splitEvenOdd(MyLinkedList original, MyLinkedList evenList, MyLinkedList oddList) {
        Node current = original.getHead();

        while (current != null) {
            if (current.data % 2 == 0) {
                evenList.add(current.data);
            } else {
                oddList.add(current.data);
            }
            current = current.next;
        }
    }
}
