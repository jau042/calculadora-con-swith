package calculadora;

import java.util.*;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1,n2;
        double resul=0;
        String op;
        
        System.out.println("Ingrese el primer numaro");
        n1=leer.nextInt();
        System.out.println("ingrese el simbolo de la operacion a realizar");
        op=leer.next();
        System.out.println("ingrese el segundo numero");
        n2=leer.nextInt();
        
        switch(op){
            case "+" :
                resul=n1+n2;
                 System.out.println("El resultado de la operacion "+op+" es: "+resul);
                break;
            case "-" :
                resul=n1-n2;
                 System.out.println("El resultado de la operacion "+op+" es: "+resul);
                break;
            case "*" :
                resul=n1*n2;
                 System.out.println("El resultado de la operacion "+op+" es: "+resul);
                break;
            case "/" :
                resul=n1/n2;
                 System.out.println("El resultado de la operacion "+op+" es: "+resul);
                break;
                default:
                    System.out.println("error");
                    break;
        }        
    }
    
}
