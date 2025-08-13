// Importando a classe Scanner do pacote java.util
import java.util.Scanner;

// Importando todas as classes do pacote java.util
import java.util.*;

// Importando o método estático PI da classe Math
import static java.lang.Math.PI;


public class plana {

    // Método para calcular a área de um quadrado
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular o perímetro de um quadrado
    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

    public static void main(String[] args) {
        double area = calcularAreaQuadrado(lado);
        double perimetro = calcularPerimetroQuadrado(lado);

        System.out.println("A área do quadrado é: " + area);
        System.out.println("O perímetro do quadrado é: " + perimetro);
    }
}





  
