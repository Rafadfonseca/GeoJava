package geometrias;

public class geometriaPlana {

    //quadrado
    public double lado;
    public double area;
    public double perimetro;
    public double operacao;

    //retangulo
    public double altura;
    public double comprimento;

    //triangulo
    public double ladoa;
    public double ladob;
    public double ladoc;

    //losango 
    public double diametroa;
    public double diametrob;

    //trapezio
    public double basea;
    public double baseb;

    //circulo
    public double raio;


    public void quadrado() {
        this.area = lado * lado;
        this.perimetro = 4 * lado;
    }

    public void retangulo() {
        this.area = altura * comprimento;
        this.perimetro = (2 * altura) + (2 * comprimento);
    }
    
    public void triangulo() {
        this.area = (ladoa * altura)/2;
        this.perimetro = ladoa + ladob + ladoc;
    }
    
    public void trianguloEquilatero() {
        this.area = ((Math.pow(lado, 2)) * Math.sqrt(3)) / 4;
        this.perimetro = 3 * lado;
    }
    
    public void paralelogramo() {
        this.area = ladoa * altura;
        this.perimetro = (2 * ladoa) + (2 * ladob);
    }
    
    public void losango() {
        this.area = (diametroa * diametrob) / 2;
        this.perimetro = 4 * lado;
    }
    
    public void trapezio() {
        this.area = ((basea + baseb) * altura) / 2;
        this.perimetro = ladoa + ladob + basea + baseb;
    }
    
    public void circulo() {
        this.area = Math.PI * (Math.pow(raio, 2));
        this.comprimento = 2 * Math.PI * raio;
    }

}



