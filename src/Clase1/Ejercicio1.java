package Clase1;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Ejercicio 1 a
        System.out.println("Ejercicio 1 a.");
        int numeroInicio = 5, numeroFin = 14;
        while(numeroInicio <= numeroFin){
            System.out.println(numeroInicio);
            numeroInicio = numeroInicio + 1;
        }
        numeroInicio=5;
        
        //Ejercicio 1 b
        System.out.println("");
        System.out.println("Ejercicio 1 b.");
        int resto = 0;
        while(numeroInicio <= numeroFin){
            resto = numeroInicio%2;
            if(resto == 0){
                System.out.println(numeroInicio);
            }
            numeroInicio = numeroInicio + 1;
        }
        numeroInicio=5;
        
        //Ejercicio 1 c
        System.out.println("");
        System.out.println("Ejercicio 1 c.");
        String paridad = "Impar";
        if(paridad =="Par"){
           while(numeroInicio <= numeroFin){
            resto = numeroInicio%2;
            if(resto == 0){
                System.out.println(numeroInicio);
            }
            numeroInicio = numeroInicio + 1;
            }
            numeroInicio=5; 
        } else {
            while(numeroInicio <= numeroFin){
            resto = numeroInicio%2;
            if(resto != 0){
                System.out.println(numeroInicio);
            }
            numeroInicio = numeroInicio + 1;
            }
            numeroInicio=5; 
        }
        
        //Ejercicio 1 d
        System.out.println("");
        System.out.println("Ejercicio 1 d.");
        for (int i = numeroFin; i >= numeroInicio; i--) {
            resto = i%2;
            if(resto == 0){
                System.out.println(i);
            }
        }
    }
}
