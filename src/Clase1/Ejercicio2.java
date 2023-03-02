package Clase1;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        float ingresos =0;
        int cant_vehiculos = 0, cant_inmuebles=0, cant_vehiculos_nuevos=0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresos totales del grupo familiar ($): ");
        ingresos = entrada.nextInt();

        System.out.println("");
        System.out.print("Cantidad de vehículos: ");
        cant_vehiculos = entrada.nextInt();

        int antiguedad[]= new int[cant_vehiculos];

        System.out.println("");
        for (int i = 0; i < cant_vehiculos; i++) {
            System.out.print("Antiguedad del primer vehiculo: ");
            antiguedad[i] = entrada.nextInt();
            if(antiguedad[i]<5){
                cant_vehiculos_nuevos++; 
            }
        }

        System.out.print("Cantidad de inmuebles que posee: ");
        cant_inmuebles = entrada.nextInt();

        System.out.print("Posee embarcación, aeronave de lujo: ");
        String embarcacion_text;

        embarcacion_text = entrada.next();

        if(ingresos>=489083||cant_vehiculos_nuevos>=3||cant_inmuebles>=3||"si".equals(embarcacion_text)){
            System.out.println("Usted pertenece al grupo de personas de Ingresos Altos");
        } else{
            System.out.println("Usted pertenece al grupo de personas de Ingresos Bajos");
        }
    }
}

