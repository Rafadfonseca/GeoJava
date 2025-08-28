import java.util.Scanner;

import geometrias.geometriaPlana;

public class geometria {
    
    public static void quadrado() {
        double retorno;

        geometriaPlana objQuadrado = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o lado do seu quadrado:");
        objQuadrado.lado = ler.nextDouble();

        objQuadrado.quadrado();
        System.out.println(objQuadrado.area);
        System.out.println(objQuadrado.perimetro);
    }
    public static void retangulo() {
        double retorno;

        geometriaPlana objRetangulo = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um dos lados do seu retangulo:");
        objRetangulo.ladoa = ler.nextDouble();
        System.out.println("Digite o outro lado do seu retangulo:");
        objRetangulo.ladoa = ler.nextDouble();

        objRetangulo.retangulo();
        System.out.println(objRetangulo.area);
        System.out.println(objRetangulo.perimetro);
    }
    public static void triangulo() {
        double retorno;

        geometriaPlana objTriangulo = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um dos lados do seu triângulo:");
        objTriangulo.ladoa = ler.nextDouble();
        System.out.println("Digite o outro lado do seu triângulo:");
        objTriangulo.ladob = ler.nextDouble();
        System.out.println("Digite o outro lado do seu triângulo:");
        objTriangulo.ladoc = ler.nextDouble();
        System.out.println("Digite a altura do seu triângulo:");
        objTriangulo.altura = ler.nextDouble();

        objTriangulo.triangulo();
        System.out.println(objTriangulo.area);
        System.out.println(objTriangulo.perimetro);
    }
    public static void trianguloEquilatero() {
        double retorno;

        geometriaPlana objTrianguloEquilatero = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o lado do seu triângulo Equilatero:");
        objTrianguloEquilatero.lado = ler.nextDouble();
        System.out.println("Digite a altura do seu triângulo Equilatero:");
        objTrianguloEquilatero.altura = ler.nextDouble();

        objTrianguloEquilatero.trianguloEquilatero();
        System.out.println(objTrianguloEquilatero.area);
        System.out.println(objTrianguloEquilatero.perimetro);
    }
    public static void paralelogramo() {
        double retorno;

        geometriaPlana objparalelogramo = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um dos lados do seu paralelogramo:");
        objparalelogramo.ladoa = ler.nextDouble();
        System.out.println("Digite o outro lado do seu paralelogramo:");
        objparalelogramo.ladob = ler.nextDouble();
        System.out.println("Digite a altura do seu paralelogramo:");
        objparalelogramo.altura = ler.nextDouble();

        objparalelogramo.paralelogramo();
        System.out.println(objparalelogramo.area);
        System.out.println(objparalelogramo.perimetro);
    }
    public static void losango() {
        double retorno;

        geometriaPlana objlosango = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o lado do seu losango:");
        objlosango.lado = ler.nextDouble();
        System.out.println("Digite um dos diametros do seu losango:");
        objlosango.diametroa = ler.nextDouble();
        System.out.println("Digite o outro diametro do seu losango:");
        objlosango.diametrob = ler.nextDouble();

        objlosango.losango();
        System.out.println(objlosango.area);
        System.out.println(objlosango.perimetro);
    }
    public static void trapezio() {
        double retorno;

        geometriaPlana objtrapezio = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um dos lados do seu trapézio:");
        objtrapezio.ladoa = ler.nextDouble();
        System.out.println("Digite o outro lado do seu trapézio:");
        objtrapezio.ladob = ler.nextDouble();
        System.out.println("Digite uma das bases do seu trapézio:");
        objtrapezio.basea = ler.nextDouble();
        System.out.println("Digite a outra base do seu trapézio:");
        objtrapezio.baseb = ler.nextDouble();
        System.out.println("Digite a altura do seu trapézio:");
        objtrapezio.altura = ler.nextDouble();

        objtrapezio.trapezio();
        System.out.println(objtrapezio.area);
        System.out.println(objtrapezio.perimetro);
    }
    public static void circulo() {
        double retorno;

        geometriaPlana objcirculo = new geometriaPlana();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio do seu círculo:");
        objcirculo.raio = ler.nextDouble();

        objcirculo.circulo();
        System.out.println(objcirculo.area);
        System.out.println(objcirculo.comprimento);
    }


}
