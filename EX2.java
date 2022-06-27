package pagina_26;

import java.util.Scanner;

public class exer2{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            float h, b, B, area;
            int area2;

            
            System.out.print("Digite a altura do trapézio(h): ");
            h = input.nextFloat();

            System.out.print("Digite a base menor do trapézio(b): ");
            b = input.nextFloat();

            System.out.print("Digite a base maior do trapézio(B): ");
            B = input.nextFloat();

             
            area = (float) (h * (b +B)) / 2;
            area2 = (int) (h * (b +B)) / 2;

            
            System.out.println("A área do trapézio é " + area + " ou cerca de " + area2 + ".");
        }
    }
}   