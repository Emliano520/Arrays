public class ListaSimple {
    Nodo cabeza = null;

    // Agregar un número al final
    public void agregar(int num) {
        Nodo nuevo = new Nodo(num);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Contar cuántas veces aparece un número
    public int contarOcurrencias(int x) {
        int contador = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato == x) {
                contador++;
            }
            actual = actual.siguiente;
        }

        return contador;
    }

    // Imprimir lista
    public void imprimir() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
