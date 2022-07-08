import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Atributos
            int idade;

            // Input
            System.out.print("Fala a idade ai meu nobre: ");
            idade = input.nextInt();

            // Condições
            if (idade <= 3) {
                System.out.println("Você é um bebezin.");
            } else if (idade <= 9) {
                System.out.println("CUIDADO COM O PURPLE GUY.");
            } else if (idade <= 13) {
                System.out.println("Você é um pré-adolecente.");
            } else if (idade <= 17) {
                System.out.println("Você está na adolecencia.");
            } else if (idade <= 32) {
                System.out.println("Já é adulto, pode ser preso já.");
            } else if (idade <= 60) {
                System.out.println("Chegou na velhice.");
            } else if (idade >= 61) {
                System.out.println("Sinto informar mas já ta numa idade complicada.");
            }
        }
    }
}