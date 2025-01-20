package N2.E4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la lista de cadenas y números
        List<String> list = Arrays.asList("Word", "2", "paint", "45", "Ink", "740", "Aquarell", "34", "enterprise");

        // Crear instancia de ListProcessor
        ListProcessor processor = new ListProcessor();

        // Ordenar por primer carácter
        System.out.println("Ordenadas por primer carácter: " + processor.sortByFirstCharacter(list));

        // Ordenar por cadenas que contienen 'e'
        System.out.println("Cadenas con 'e' primero: " + processor.sortByContainsE(list));

        // Reemplazar 'a' con '4'
        System.out.println("Lista con 'a' reemplazada por '4': " + processor.replaceAWith4(list));

        // Filtrar números
        System.out.println("Números en la lista: " + processor.filterNumbers(list));
    }
}
