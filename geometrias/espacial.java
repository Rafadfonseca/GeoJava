package geometrias;

public class espacial {
    Float operacao; 

    // esfera
    public double raio;
    public double areaSuperficial;
    public double volume;

    // cone
    public double geratriz;
    public double altura;
    public double areaLateral;
    public double areaBase;

    // cilindro  double raio = 0, altura = 0, areaBases, areaLateral, volume;
    public double areaBases;

    // piramide triangular e prisma
    public double baseTriangulo;
    public double areaTotal;


    //tronco de cone
    public double raioBaseMenor;
    public double raioBaseMaior;



    public void esfera() {

        areaSuperficial = (float) (4 * Math.PI * (Math.pow(raio, 2)));
        volume = (float) ((4 / 3) * Math.PI * (Math.pow(raio, 3)));
    }

    public void cone(){

        areaLateral = (float) (Math.PI * raio * geratriz);
        areaBase = (float) (Math.PI * (Math.pow(raio, 2)));
        volume = (float) ((Math.PI * (Math.pow(raio, 2)) * altura) / 2);
    }

    public void cilindro(){

        areaBases = Math.PI * (Math.pow(raio, 2));
        areaLateral = (2 * Math.PI) * raio * altura;
        volume = Math.PI * (Math.pow(raio, 2)) * altura;
    }

    public void piramideTriangular(){

        areaLateral = ((baseTriangulo * altura) /2) * 3;
        areaTotal = (areaBase + areaLateral);
        volume = areaBase * altura;
    }

    public void prismaRetangular(){
        
        areaLateral = (areaBase * 4);
        areaTotal = (areaBase + areaLateral);
        volume = areaBase * altura;
    }

    public void troncoCone(){

        volume= (Math.PI * altura * ((Math.pow(raioBaseMenor, 2)) + raioBaseMenor * raioBaseMaior + (Math.pow(raioBaseMaior, 2))) / 3);
    }


}




