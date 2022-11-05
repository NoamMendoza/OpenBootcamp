
package openbootcamp;
import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroif,numeroWhile,numeroDoWhile;
        String estacion;
        
        numeroif=sc.nextInt();
        if(numeroif>0){
            System.out.println("el numero es positivo");
        }else if(numeroif==0){
            System.out.println("El numero es cero");
        }else{
            System.out.println("El numero es negativo");
        }
        
        numeroWhile=sc.nextInt();
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        
        numeroDoWhile=sc.nextInt();
        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile<3);
        
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        
        estacion=sc.next();
        
        switch(estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}
