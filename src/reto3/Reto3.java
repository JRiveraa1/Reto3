package reto3;

import java.util.Scanner;

/**
  @authors:
   Juan Camilo Rivera Avnedaño
   Oswald Daniel Gutierrez Cortina
 */
public class Reto3 {
    
    public static void Punto1(){
        int n;
        int m;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número para las filas de la matriz: ");
        n = leer.nextInt();
        System.out.print("Ingrese otro número para las columnas de la matriz: ");
        m = leer.nextInt();
        double matrix[][] = new double[n][m];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print("Ingrese el elemento [" + i + "," + j + "]: ");
                matrix[i][j] = leer.nextInt();
            }
        }
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.println("[" + i + "," + j + "]:  " + matrix[i][j]);
  }
}
    }
    public static void Punto2(){
        String set = "";
        int sum = 0;
        double average = 0;
        double elements = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un conjunto de número enteros separados por comas: ");
        set = leer.nextLine();
        String[] numbers = set.split(",");
        int[] values = new int[numbers.length];
        for(int i=0;i<values.length;i++){
            values[i] = Integer.parseInt(numbers[i]);
        }
        for(int i=0;i<values.length;i++){
            sum += values[i];
        }
        int higher = values[0];
        for(int i=1;i<values.length;i++){
            if(values[i] > higher){
                higher = values[i];
            }
        }
        int less = values[0];
        for(int i=1;i<values.length;i++){
            if(values[i] < less){
                less = values[i];
            }
        }
        elements = values.length;
        average = sum / elements;
        System.out.println("Suma: " + sum);
        System.out.println("Promedio: " + average);
        System.out.println("Mayor: " + higher);
        System.out.println("Menor: " + less);
        
    }
    public static void Punto3(){
        int n;
        int m;
        double product = 0;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos del Vector A: ");
        n = leer.nextInt();
        double[] vectorA = new double[n];
        for(int i=0;i<vectorA.length;i++){
            System.out.print("Ingrese el elemento [" + i +"]: ");
            vectorA[i] = leer.nextDouble();
        }
        System.out.print("Ingrese el número de elementos del Vector B: ");
        m = leer.nextInt();
        double[] vectorB = new double[m];
        for(int i=0;i<vectorB.length;i++){
            System.out.print("Ingrese el elemento [" + i +"]: ");
            vectorB[i] = leer.nextDouble();
        }
        for(int i=0;i<vectorA.length;i++){
            product = product + (vectorA[i] * vectorB[i]);
        }
        System.out.println("Vector A * VectorB = " + product);
    }
    public static void Punto4(){
        Scanner leer = new Scanner(System.in);
        double[] vectorA = new double[3];
        double[] vectorB = new double[3];
        double[] vectorC = new double[3];
        System.out.println("Ingrese los datos del 1° Vector: ");
        for(int i=0;i<vectorA.length;i++){
            System.out.print("Ingrese el elemento [" + i +"]: ");
            vectorA[i] = leer.nextDouble();
        }
        System.out.println("Ingrese los datos del 2° Vector: ");
        for(int i=0;i<vectorB.length;i++){
            System.out.print("Ingrese el elemento [" + i +"]: ");
            vectorB[i] = leer.nextDouble();
        }
        vectorC[0] = (vectorA[1]*vectorB[2]) - (vectorA[2]*vectorB[1]);
        vectorC[1] = (vectorA[0]*vectorB[2]) - (vectorA[2]*vectorB[0]);
        vectorC[2] = (vectorA[0]*vectorB[1]) - (vectorA[1]*vectorB[0]);
        for(int i=0;i<vectorC.length;i++){
            System.out.println("[" + i + "]: " + vectorC[i]);
        }
    }
    public static void main(String[] args) {
       int option;
       Scanner leer = new Scanner(System.in);
       boolean sw = true;
       while(sw){
           System.out.println("         Ingrese el número correspondiente al punto a desarrollar:         ");
           System.out.println("1. Punto 1.");
           System.out.println("2. Punto 2.");
           System.out.println("3. Punto 3.");
           System.out.println("4. Punto 4.");
           System.out.println("0. Salir.");
           option = leer.nextInt();
           
           switch(option){
               case 1: 
                   Punto1();
                   break;
               case 2: 
                   Punto2();
                   break;
               case 3: 
                   Punto3();
                   break;
               case 4: 
                   Punto4();
                   break;
               case 0: 
                   sw = false;
                   break;
               default:
                   System.out.println("Ingrese una opcón válida: ");
                  
           }
       }
        
    }  
}
