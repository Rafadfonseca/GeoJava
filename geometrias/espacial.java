package geometrias;

public class espacial {
    Float operacao; 


    public float esfera() {
        float raio = 0, areaSuperficial, volume; //soma, sub;
        areaSuperficial = (float) (4 * Math.PI * (Math.pow(raio, 2)));
        //4 pi r^2
        volume = (float) ((4 / 3) * Math.PI * (Math.pow(raio, 3)));
        
        if( operacao == 1){
            return areaSuperficial;
        }else{
            return volume;
        }
    }

    public float cone(){
        float raio = 0, geratriz = 0, altura = 0, areaLateral, areaBase, volume;
        
        areaLateral = (float) (Math.PI * raio * geratriz);
        areaBase = (float) (Math.PI * (Math.pow(raio, 2)));
        volume = (float) ((Math.PI * (Math.pow(raio, 2)) * altura) / 2);

        if( operacao == 1){
            return areaLateral;
        } if (operacao == 2){
            return (float) areaBase;
        } else{
            return (float) volume;
        }
    }

    public float cilindro(){
        double raio = 0, altura = 0, areaBases, areaLateral, volume;

        areaBases = Math.PI * (Math.pow(raio, 2));
        areaLateral = (2 * Math.PI) * raio * altura;
        volume = Math.PI * (Math.pow(raio, 2)) * altura;

        if( operacao == 1){
            return (float) areaBases;
        } if (operacao == 2){
            return (float) areaLateral;
        } else{
            return (float) volume;
        }
    }

    public float piramideTriangular(){
        double altura = 0, areaLateral, baseTriangulo = 0, areaBase=0, areaTotal, volume;

        areaLateral = ((baseTriangulo * altura) /2) * 3;
        areaTotal = (areaBase + areaLateral);
        volume = areaBase * altura;

        if( operacao == 1){
            return (float) areaLateral;
        } if (operacao == 2){
            return (float) areaTotal;
        } else{
            return (float) volume;
        }

    }

    public float prismaRetangular(){
        double areaLateral, areaBase=0, altura=0, areaTotal, volume;
        
        areaLateral = (areaBase * 4);
        areaTotal = (areaBase + areaLateral);
        volume = areaBase * altura;

        if( operacao == 1){
            return (float) areaLateral;
        } if (operacao == 2){
            return (float) areaTotal;
        } else{
            return (float) volume;
        }

    }

}




