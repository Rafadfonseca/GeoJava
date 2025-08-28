package aplicacao;
import geometrias.*;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        espacial espacialValendo = new espacial ();
        geometriaPlana planaValendo = new geometriaPlana ();

        System.out.println("Escolha umaa categoria:");
        System.out.println("1. Geometria plana");
        System.out.println("2. Geometria espacial");
        int categoria = scanner.nextInt();
        scanner.close();



        switch (categoria) {
            case 1:
                System.out.println("Agora, escolha a forma geométrica:");
                System.out.println("1-Quadrado");
                System.out.println("2-Retângulo");
                System.out.println("3-Triângulo");
                System.out.println("4-Triângulo Equilatero");
                System.out.println("5-Paralelogramo");
                System.out.println("6-Losango");
                System.out.println("7-Trapézio");
                System.out.println("8-Círculo");
                scanner.close();
                String formaGeometrica = scanner.nextLine().toLowerCase();
                geometriaPlana.calcular(categoria, formaGeometrica, scanner);
                break;
            case 2:
                System.out.println("Agora, escolha a forma geométrica:");
                System.out.println("9-Prisma");
                System.out.println("10-Cílindro");
                System.out.println("11-Pirâmide");
                System.out.println("12-Cone");
                System.out.println("13-Esfera");
                scanner.close();
                espacial.calcular(categoria, formaGeometrica, scanner);
                break;


            
        }
    }
}