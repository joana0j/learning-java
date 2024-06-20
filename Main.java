public class Main {
    public static void main(String[] args) {

        String password = "polvoroxo";
        if (password.equals("polvoroxo")) {
            System.out.println("Authorized Access!");
        } else {
            System.out.println("Access Denied!");
        }

        String initialMessage = "Welcome to Bobo School, ";
        String student = "Olivia";
        double studentNote1 = 8.2d;
        double studentNote2 = 7.5d;
        double noteMedia = (studentNote1 + studentNote2) / 2;
        System.out.println(initialMessage + student + "!" + " Your final note is: " + noteMedia);

        double one = 5.8d;
        int two = (int) one;
        System.out.println(two);

        String word = "Me sinto";
        String word2 = " \"triste\"";
        System.out.println(word.concat(word2));

        double productPrice = 4.75d;
        int quantity = 12;
        double total = (quantity * productPrice);
        System.out.println("The total of itens is " + total);

        double dolarInReal = 5.15;
        int dolarValue = 12;
        double conversion = dolarInReal * dolarValue;
        String finalMessage2 = String.format("Total of Reais is %.2f", conversion);

        System.out.println(finalMessage2);

        double pizzaPrice = 42.50;
        double pizzaDiscount = 10.0;
        double newPrice = (pizzaDiscount / 100.0) + pizzaPrice;
        System.out.println(newPrice);

        String text = "CAT CHEESE MOON CHOCOLATE BREAD TOMATO";
        System.out.println(text.indexOf("CAT"));



        /* String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);

        double celsius = 34.5;
        double fahrenheit = (celsius * 1.8) + 32;
        String temperatureInfo = String.format("The temperature of %.1f celsius is equivalent as %.1f fahrenheit", celsius, fahrenheit);

        System.out.println(temperatureInfo);

        int fahrenheitTemperature = (int) fahrenheit;
        System.out.println(fahrenheitTemperature);
        */
    }
}
