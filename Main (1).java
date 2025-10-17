public class Main {

    // ----- Clase Nodo -----
    static class Nodo {
        int dato;
        Nodo anterior;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    // ----- Clase DoubleLinkedList -----
    static class DoubleLinkedList {
        Nodo head = null;
        Nodo tail = null;

        // Agregar elemento
        public void agregar(int num) {
            Nodo nuevo = new Nodo(num);
            if (head == null) {
                head = nuevo;
                tail = nuevo;
            } else {
                tail.siguiente = nuevo;
                nuevo.anterior = tail;
                tail = nuevo;
            }
        }

        // Imprimir lista
        public void imprimir() {
            Nodo actual = head;
            while (actual != null) {
                System.out.print(actual.dato + " <-> ");
                actual = actual.siguiente;
            }
            System.out.println("null");
        }

        // Eliminar el primer nodo con el valor dado
        public void remove(int valor) {
            // 1. Verificar si está vacía
            if (head == null) {
                System.out.println("La lista está vacía.");
                return;
            }

            // 2. Buscar el nodo
            Nodo actual = head;
            while (actual != null && actual.dato != valor) {
                actual = actual.siguiente;
            }

            // 3. No se encontró
            if (actual == null) {
                System.out.println("El valor " + valor + " no se encontró.");
                return;
            }

            // 4. Si es el primero
            if (actual == head) {
                head = actual.siguiente;
                if (head != null) {
                    head.anterior = null;
                } else {
                    tail = null;
                }
            }
            // 5 y 6. Si no es el primero
            else {
                actual.anterior.siguiente = actual.siguiente;
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    tail = actual.anterior;
                }
            }

            System.out.println("Elemento " + valor + " eliminado correctamente.");
        }
    }

    // ----- Método main -----
    public static void main(String[] args) {
        DoubleLinkedList lista = new DoubleLinkedList();

        // Agregar elementos
        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);

        System.out.println("Lista original:");
        lista.imprimir();

        // Eliminar elementos
        lista.remove(30);
        lista.remove(10);
        lista.remove(60);

        System.out.println("\nLista después de eliminar:");
        lista.imprimir();
    }
}
