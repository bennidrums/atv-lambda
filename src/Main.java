    import java.util.Arrays;
    import java.util.List;

    public class Main {

        public static void main(String[] args) {

            List<String> nomes = Arrays.asList(
                    "Chris",
                    "Claire",
                    "Leon",
                    "Jill",
                    "Ada",
                    "Wesker"
            );

            FiltroNome filtro = nome -> nome.startsWith("A");

            nomes.stream()
                    .filter(nome -> filtro.testar(nome))
                    .forEach(System.out::println);
        }
    }