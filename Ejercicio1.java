import java.util.Scanner;//Aqui se "indica" para sacar la variable y poder pedir datos de fuera del sistema.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);/*Inicializamos la variable "Leer"*/
     System.out.println("Ingrese el primer número");//Pedimos al usuario el 1er número
    double n1 = sc.nextDouble();//Lo leemos
     System.out.println("Ingrese el segundo numero");//Pedimos al usuario el 2do número.
    double n2 = sc.nextDouble();//Lo leemos.
    /*En las siguientes líneas de código mostramos el resultado de la suma, resta, división, multiplicación y módulo*/
     System.out.println("El resultado de la suma es: " + (n1 + n2));
    System.out.println("El resultado de la resta es: " + (n1 - n2));
    System.out.println("El resultado de la division es: " + (n1 / n2));
    System.out.println("El resultado de la multiplicacion es: " + (n1 * n2));
    System.out.println("El resultado de l modulo es: " + (n1 % n2));
    }
}
