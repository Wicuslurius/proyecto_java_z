import java.util.Scanner;

public class Operaciones{
  public static void main(String args[]){
    
    int num_uno = 5, num_dos = 3, resultado = 0;
    int parametro = 0;

    Scanner numIn = new Scanner(System.in);

    System.out.println("ingrese un parametro de 1 a 4 para saber si quiere , 1 - sumar , 2 - restar , 3 - multiplicar, 4 - dividir ");

    parametro = numIn.nextInt(); 

    switch(parametro){
      case 1:  
          resultado = num_uno + num_dos;
          System.out.println("El resultado de la suma es: "+ resultado);
        break;
      case 2:  
          resultado = num_uno - num_dos;
          System.out.println("El resultado de la resta es: "+ resultado);
        break;
      case 3:  
          resultado = num_uno * num_dos;
          System.out.println("El resultado de la multiplicacion es: "+ resultado);
        break;
      case 4:  
          resultado = num_uno / num_dos;
          System.out.println("El resultado de la multiplicacion es: "+ resultado);
        break;
      default:
          System.out.println("Error, esta opcion no la tenemos en el sistema");
        break;
    }
  }
}
