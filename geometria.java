import java.util.Scanner;

import geometrias.geometriaPlana;

public class geometria {
    
    public static double quadrado() {
        double retorno

        geometriaPlana objQuadrado = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o lado do seu quadrado:");
        objQuadrado.lado = ler.nextDouble();
        System.out.println("Digite a área do seu quadrado:");
        objQuadrado.area = ler.nextDouble();
        System.out.println("Digite o perimetro do seu quadrado:");
        objQuadrado.perimetro = ler.nextDouble();

        objQuadrado.quadrado();
        System.out.println(objQuadrado.area);
        System.out.println(objQuadrado.perimetro);
    }


}
