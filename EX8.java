import java.util.Scanner;

public class EX8 {

    static void quiloPlibra (float quilo) {
        float libra = (float) (quilo * 2.20462);
        System.out.println(quilo + " quilos equivalem à " + libra + " libras.");
    }

    static void libraPquilo (float libra) {
        float quilo = (float) (libra / 2.20462);
        System.out.println(libra + " libras iquivalem à " + quilo + " quilos.");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)){
            // Atributos
            int valor, menu;

            // Menu
            System.out.println("O que vc quer converter, meu mano? ");
            System.out.println("1 = converte ai quilogramas em libras.");
            System.out.println("2 = converte ai libras em quilogramas.");
            menu = input.nextInt();

            // Conversão 1
            if (menu == 1) {
                System.out.println("fala o valor pra converter ai: ");
                valor = input.nextInt();

                quiloPlibra(valor);
            }
            // Conversão 2
            else {
                System.out.println("fala o valor pra converter ai: ");
                valor = input.nextInt();

                libraPquilo(valor);
            }
        }
    }
}