import Modelos.*;

public class Main {
    public static void main(String[] args) {
        Beer duff = new BeerBuilder()
                .nombre("Benitocamela")
                .tipo("Suma")
                .cantidad(1231650265)
                .color("Veraguamarinaconnegor")
                .volumenAlcohol("25052ML")
                .build();
        System.out.println(duff);
    }
}