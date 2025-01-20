package N1.E2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> fruitsList = Arrays.asList("apple", "orange", "banana", "kiwi", "melon", "grape");

        // Filtrar las frutas
        List<String> filteredFruits = WordProcessor.filterWordsContainingOAndLongerThanFive(fruitsList);

        // Imprimir las frutas filtradas con detalles
        WordProcessor.printFilteredFruits(filteredFruits);
    }
}