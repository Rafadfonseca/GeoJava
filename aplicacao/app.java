package aplicacao;
import geometrias.*;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        geometrias.geometriaPlana planaValendo = new geometriaPlana ();
        geometrias.geometriaEspacial espacialValendo = new geometriaEspacial ();

        System.out.println("Escolha uma categoria:");
        System.out.println("1. Geometria plana");
        System.out.println("2. Geometria espacial");
        int categoria = scanner.nextInt();

        int formaGeometrica;


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
                formaGeometrica = scanner.nextInt();


                switch (formaGeometrica) {
                    case 1: System.out.println(geometria.quadrado()); break;
                    //case 2: System.out.println(geometria.retangulo()); break;  //coloquei como comentario pq da erro por nao estar pronto e ele nao executa, entao enquanto for fazendo tira de comentário p ir vendo
                    //case 3: System.out.println(geometria.triangulo()); break;
                    //case 4: System.out.println(geometria.trianguloEquilatero()); break;
                    //case 5: System.out.println(geometria.paralelogramo()); break;
                    //case 6: System.out.println(geometria.losango()); break;
                    //ase 7: System.out.println(geometria.trapezio()); break;
                    //case 8: System.out.println(geometria.circulo()); break;
                    default: System.out.println("Forma inválida."); break;
                }
                break;


            case 2:
                System.out.println("Agora, escolha a forma geométrica:");
                System.out.println("9-Prisma");
                System.out.println("10-Cílindro");
                System.out.println("11-Pirâmide");
                System.out.println("12-Cone");
                System.out.println("13-Esfera");
                formaGeometrica = scanner.nextInt();

                //switch (formaGeometrica) {
                    //case 9: System.out.println(geometria.prismaRetangular()); break; // mesma coisa aq
                    //case 10: System.out.println(geometria.cilindro()); break;
                    //case 11: System.out.println(geometria.piramideTriangular()); break;
                    //case 12: System.out.println(geometria.cone()); break;
                    //case 13: System.out.println(geometria.esfera()); break;
                    //case 14: System.out.println(geometria.troncoCone()); break;
                    //default: System.out.println("Forma inválida."); break;
                }
                //break;
        }
    }

