package N2.E4;

import java.util.List;
import java.util.Comparator;
import java.util.Locale;
import java.util.stream.Collectors;

public class ListProcessor {

    // Metodo para ordenar las cadenas según el primer carácter y si contienen una 'e'
    public List<String> sortByFirstCharacter(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(s -> s.toUpperCase(Locale.ROOT).charAt(0))) // Ordenar por el primer carácter
                .collect(Collectors.toList()); // Devolver una nueva lista
    }

    // Metodo para ordenar primero las cadenas que contienen 'e' y luego alfabéticamente
    public List<String> sortByContainsE(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing((String s) -> !s.toUpperCase(Locale.ROOT).contains("E"))
                        .thenComparing(s -> s.toUpperCase(Locale.ROOT))) // Usar Locale.ROOT en ambos casos
                .collect(Collectors.toList());
    }

    // Reemplaza todas las 'a' por '4' en la lista
    public List<String> replaceAWith4(List<String> list) {
        return list.stream()
                .map(s -> s.replace("a", "4")) // Reemplazar 'a' con '4'
                .collect(Collectors.toList()); // Crear una nueva lista con los cambios
    }

    // Filtra y retorna solo los números (como Strings)
    public String filterNumbers(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("\\d+"))  // Filtrar solo los números (como Strings)
                .collect(Collectors.joining(","));  // Unir los números filtrados en una cadena separada por comas
    }
}
