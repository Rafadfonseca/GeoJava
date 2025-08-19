package geometrias;
public class plana {

    float operacao;
    public float quadrado() {
        double lado, area, perimetro, operacao;
        area = lado * lado;
        perimetro = 4 * lado;
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) perimetro;
        }
    }

    public float retangulo() {
        double altura, comprimento, area, perimetro, operacao;
        area = altura * comprimento;
        perimetro = (2 * altura) + (2 * comprimento);
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) perimetro;
        }
    }
    
    public float triangulo() {
        double ladoa, ladob, ladoc, altura, area, perimetro, operacao;
        area = (ladoa * altura)/2;
        perimetro = ladoa + ladob + ladoc;
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) perimetro;
        }
    }
    
    public float trianguloEquilatero() {
        double lado, altura, area, perimetro, operacao;
        area = ((Math.pow(lado, 2)) * Math.sqrt(3)) / 4;
        perimetro = 3 * lado;
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) perimetro;
        }
    }
    
    public float paralelogramo() {
        double ladoa, ladob, altura, area, perimetro, operacao;
        area = ladoa * altura;
        perimetro = (2 * ladoa) + (2 * ladob);
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) perimetro;
        }
    }
    
    public float losango() {
        double lado, diametroa, diametrob, area, perimetro, operacao;
        area = (diametroa * diametrob) / 2;
        perimetro = 4 * lado;
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) perimetro;
        }
    }
    
    public float trapezio() {
        double basea, baseb, ladoa, ladob, altura, area, perimetro, operacao;
        area = ((basea + baseb) * altura) / 2;
        perimetro = ladoa + ladob + basea + baseb;
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) perimetro;
        }
    }
    
    public float circulo() {
        double raio, area, comprimento, operacao;
        area = Math.PI * (Math.pow(raio, 2));
        comprimento = 2 * Math.PI * raio;
        
        if(operacao == 1){
            return (float) area;
        }else{
            return (float) comprimento;
        }
    }

}



