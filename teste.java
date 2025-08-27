import java.util.Scanner;
 
public class teste {
 
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("1-Plana");
        System.out.println("2-Espacial");
        System.out.print("Qual operação a cima você quer:");
 
        int operacao = scanner.nextInt();
        
        
        switch (operacao) {
            case 1:
                System.out.println("1-Quadrado");
                System.out.println("2-Retângulo");
                System.out.println("3-Triângulo");
                System.out.println("4-Triângulo Equilatero");
                System.out.println("5-Paralelogramo");
                System.out.println("6-Losango");
                System.out.println("7-Trapézio");
                System.out.println("8-Círculo");
                System.out.print("Qual figura a cima você quer:");
                int figura = scanner.nextInt();
                break;
            case 2:
                System.out.println("9-Prisma");
                System.out.println("10-Cílindro");
                System.out.println("11-Pirâmide");
                System.out.println("12-Cone");
                System.out.println("13-Esfera");
                System.out.print("Qual figura a cima você quer:");
                int figura = scanner.nextInt();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }


         switch (figura) {
            case 1:
                System.out.print("Informe o seu lado:");
                double lado = scanner.nextDouble();
                break;
            case 2:
                System.out.print("Informe a sua base:");
                double base = scanner.nextDouble();
                System.out.print("Informe a sua altura:");
                double altura = scanner.nextDouble();
                break;
            case 3:
                System.out.print("Informe o seu lado a:");
                double ladoa = scanner.nextDouble();
                System.out.print("Informe o seu lado b:");
                double ladob = scanner.nextDouble();
                System.out.print("Informe o seu lado c:");
                double ladoc = scanner.nextDouble();
                System.out.print("Informe a sua altura:");
                double altura = scanner.nextDouble();
                break;
            case 4:
                System.out.print("Informe o seu lado:");
                double lado = scanner.nextDouble();
                System.out.print("Informe a sua altura:");
                double altura = scanner.nextDouble();
                break;
            case 5:
                System.out.print("Informe o seu lado a:");
                double ladoa = scanner.nextDouble();
                System.out.print("Informe o seu lado b:");
                double ladob = scanner.nextDouble();
                System.out.print("Informe a sua altura:");
                double altura = scanner.nextDouble();
                break;
            case 6:
                System.out.print("Informe o seu lado:");
                double lado = scanner.nextDouble();
                System.out.print("Informe a sua diametro a:");
                double diametroa = scanner.nextDouble();
                System.out.print("Informe a sua diametro b:");
                double diametrob = scanner.nextDouble();
                break;
            case 7:
                System.out.print("Informe o seu lado a:");
                double ladoa = scanner.nextDouble();
                System.out.print("Informe o seu lado b:");
                double ladob = scanner.nextDouble();
                System.out.print("Informe o seu base a:");
                double basea = scanner.nextDouble();
                System.out.print("Informe o seu base b:");
                double baseb = scanner.nextDouble();
                System.out.print("Informe a sua altura:");
                double altura = scanner.nextDouble();
                break;
            case 8:
                System.out.print("Informe o seu raio:");
                double lado = scanner.nextDouble();
                break;
            default:
                System.out.println("Opção inválida.");
                return;


 
        System.out.println("Resultado: " + resultado);
 
        scanner.close();
    }
}}