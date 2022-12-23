public class Main {
    public static void main(String[] args) {
        int numeroIf=0;
        if(numeroIf<0){
            System.out.println("El mumero es Negativo");
        } else if (numeroIf>0) {
            System.out.println("El numero es positivo");
        }else
            System.out.println("El numero es igual a 0");


        int numeroWhile=0;
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile=3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while(numeroDoWhile<3);


    for(int numeroFor=0; numeroFor<=3; numeroFor++){
        System.out.println(numeroFor);
    }
    var estacion="Verano";
    switch(estacion){
        case "Primavera":
            System.out.println("La estacion en la que estas es " + estacion);
            break;
        case "Verano":
            System.out.println("La estacion en la que estas es " + estacion);
            break;
        case "Otoño":
            System.out.println("La estacion en la que estas es " + estacion);
            break;
        case "Invierno":
            System.out.println("La estacion en la que estas es " + estacion);
            break;
        default:
            System.out.println(estacion + "Esta no es una estacion");
    }

    }
    }
