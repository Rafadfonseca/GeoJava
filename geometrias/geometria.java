package geometrias;
import java.util.Scanner;

public class geometria {
    
    public static double quadrado() {
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



    //parte da geomatria espacial
    
    public static void esfera() {
        double retorno;

        geometriaEspacial objesfera = new geometriaEspacial();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o raio do seu esfera:");
        objesfera.raio = ler.nextDouble();

        objcirculo.esfera();
        System.out.println(objesfera.areaSuperficial);
        System.out.println(objesfera.volume);
    }
    public static void cone() {
        double retorno;

        geometriaEspacial objcone = new geometriaEspacial();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a altura do seu cone:");
        objcone.altura = ler.nextDouble();
        System.out.println("Digite a geratriz do seu cone:");
        objcone.geratriz = ler.nextDouble();
        System.out.println("Digite o raio do seu cone:");
        objcone.raio = ler.nextDouble();

        objcirculo.cone();
        System.out.println(objcone.areaLateral);
        System.out.println(objcone.areaBase);
        System.out.println(objcone.volume);
    }
    public static void cilindro() {
        double retorno;

        geometriaEspacial objcilindro = new geometriaEspacial();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a altura do seu cilíndro:");
        objcilindro.altura = ler.nextDouble();
        System.out.println("Digite o raio do seu cilíndro:");
        objcilindro.raio = ler.nextDouble();

        objcirculo.cilindro();
        System.out.println(objcone.areaLateral);
        System.out.println(objcone.areaBases);
        System.out.println(objcone.volume);
    }
    public static void piramideTriangular() {
        double retorno;

        geometriaEspacial objpiramideTriangular = new geometriaEspacial();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a altura da sua pirâmide triangular:");
        objpiramideTriangular.altura = ler.nextDouble();
        System.out.println("Digite a base do seu triangulo:");
        objpiramideTriangular.baseTriangulo = ler.nextDouble();
        System.out.println("Digite a área da base da sua pirâmide triangular:");
        objpiramideTriangular.areaBase = ler.nextDouble();

        objcirculo.piramideTriangular();
        System.out.println(objpiramideTriangular.areaLateral);
        System.out.println(objpiramideTriangular.areaTotal);
        System.out.println(objpiramideTriangular.volume);
    }
    public static void prismaRetangular() {
        double retorno;

        geometriaEspacial objprismaRetangular = new geometriaEspacial();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a altura do seu prisma retângular:");
        objprismaRetangular.altura = ler.nextDouble();
        System.out.println("Digite a área da base do seu prisma retângular:");
        objprismaRetangular.areaBase = ler.nextDouble();

        objcirculo.prismaRetangular();
        System.out.println(objprismaRetangular.areaLateral);
        System.out.println(objprismaRetangular.areaTotal);
        System.out.println(objprismaRetangular.volume);
    }
    public static void troncoCone() {
        double retorno;

        geometriaEspacial objtroncoCone = new geometriaEspacial();

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a altura do seu tronco cone:");
        objtroncoCone.altura = ler.nextDouble();
        System.out.println("Digite o raio da base menor do seu troncoCone:");
        objtroncoCone.raioBaseMenor = ler.nextDouble();
        System.out.println("Digite o raio da base maior do seu troncoCone:");
        objtroncoCone.raioBaseMaior = ler.nextDouble();

        objcirculo.troncoCone();
        System.out.println(objtroncoCone.volume);
    }
}
