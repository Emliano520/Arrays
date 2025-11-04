public class Main {

    // Metodo que determina si una palabra o frase es palíndroma
    public static boolean isPalindrome(String text) {
        // Limpiamos el texto: quitamos espacios, signos y pasamos a minúsculas
        text = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Creamos un stack con la longitud del texto
        MyStack<Character> stack = new MyStack<>(text.length());

        // Empujamos cada carácter en el stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Comparamos sacando del stack con el texto original
        for (int i = 0; i < text.length(); i++) {
            char fromStack = stack.pop();
            if (text.charAt(i) != fromStack) {
                return false;
            }
        }

        return true;
    }

    // Metodo principal para probar
    public static void main(String[] args) {
        String frase1 = "Anita lava la tina";
        String frase2 = "Hola";

        System.out.println(frase1 + " → " + isPalindrome(frase1));
        System.out.println(frase2 + " → " + isPalindrome(frase2));
    }
}
