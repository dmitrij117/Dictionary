import java.util.Arrays;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static  String srcText = "Former Brazilian footballer Ronaldo shared his opinion that PSG cannot win the Champions League in any way."
            + "I have played for Real for almost five years with Galacticos and I have never won the Champions League."
            + "Victory is not a mathematical calculation, it does not happen, even if your team has the best,"
            + "and this also applies to PSG, Ronaldo quotes RMC."
            + "Recall that during the summer transfer window such world football stars as Lionel Messi,"
            + "Sergio Ramos, Gianluigi Donnarumma and Georginio Wijnaldum moved to PSG.";
    public static void main(String[] args) {
        //Функции высшего порядка
        Function<String, Set<String>> dictFunc = s -> Arrays.stream(s.trim().toLowerCase()
                .replaceAll("\\p{Punct}", " ").split("\\s"))
                .collect(Collectors.toSet());
        System.out.println("Словарь аборигенов: ");
        dictFunc.apply(srcText).stream().sorted().forEach(System.out::println); // монада через Stream API

    }
}
