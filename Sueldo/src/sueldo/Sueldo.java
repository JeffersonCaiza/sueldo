package sueldo;
import java.util.Scanner;
public class Sueldo {

    public static void main(String[] args) {
    Scanner dato=new Scanner(System.in);
    double sueldo;
    double total;
    double categoria;
    double porcentaje;
    System.out.println("Calculo de sueldo");
    System.out.println("Ingrese el sueldo");
    sueldo=dato.nextDouble();   
    System.out.println("Ingrese la categoria del 1 al 4");
    categoria=dato.nextDouble();
    if (categoria==1){
    porcentaje=sueldo*0.15;
    total=porcentaje+sueldo;
    System.out.println("Categoria "+ categoria);
    System.out.println("Sueldo anterior "+ sueldo);
    System.out.println("Nuevo sueldo "+ total);
    }
    
    else if (categoria==2){
    porcentaje=sueldo*0.10;
    total=porcentaje+sueldo;
    System.out.println("Categoria "+ categoria);
    System.out.println("Sueldo anterior "+ sueldo);
    System.out.println("Nuevo sueldo "+ total);
    }
    
    else if (categoria==3){
    porcentaje=sueldo*0.08;
    total=porcentaje+sueldo;
    System.out.println("Categoria "+ categoria);
    System.out.println("Sueldo anterior "+ sueldo);
    System.out.println("Nuevo sueldo "+ total);
    }
    
    else if (categoria==4){
    porcentaje=sueldo*0.07;
    total=porcentaje+sueldo;
    System.out.println("Categoria "+ categoria);
    System.out.println("Sueldo anterior "+ sueldo);
    System.out.println("Nuevo sueldo "+ total);
    }
    }
}
