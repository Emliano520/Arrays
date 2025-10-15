public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        // Agregamos 5 elementos
        lista.agregar(5);
        lista.agregar(3);
        lista.agregar(7);
        lista.agregar(3);
        lista.agregar(2);

        // Imprimir lista
        System.out.println("Lista enlazada:");
        lista.imprimir();

        // Contar ocurrencias del número 3
        int x = 3;
        int ocurrencias = lista.contarOcurrencias(x);
        System.out.println("El número " + x + " aparece " + ocurrencias + " veces.");
    }
}
