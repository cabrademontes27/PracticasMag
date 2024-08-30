/**
 * practica6
 */
public interface practica6 {

    void sumar();
    void restar();
    void dividir();
    void multiplicar();
}

class Calculadora : practica6{


    public void Calculadora()
    {
        
    }
    
}

/*ackage Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        while(true) {
            System.out.println("Escoge una opción: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            int choice = in.nextInt();
            if(choice == 5) {
                System.out.println("Saliendo..."); break;
            }

            System.out.println("Ingresa un numero:");
            int n1 = in.nextInt();
            System.out.println("Ingresa otro numero:");
            int n2 = in.nextInt();
            
            switch(choice) {
                case 1:
                    calculator.setOperation(new BasicOperations.Addition()); break;
                    case 2:
                        calculator.setOperation(new BasicOperations.substract()); break;
                        case 3:
                            calculator.setOperation(new BasicOperations.multiplication()); break;
                            case 4:
                                calculator.setOperation(new BasicOperations.division()); break;
                                default:
                                    System.out.println("Opcion invalida.");
            }
            int result  = (int) calculator.calculate(n1, n2);
            System.out.println("El resultado es: " + result);
            
        }
            
    }
}*/