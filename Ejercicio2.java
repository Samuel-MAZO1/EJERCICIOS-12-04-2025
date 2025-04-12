import java.util.Scanner; //Aqui se "indica" para sacar la variable y poder pedir datos de fuera del sistema.
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //Inicializamos la variable "Leer".
        System.out.print("Ingrese su nombre: ");//Pedimos al usuario que ingrese los datos
        String dato1 = sc.nextLine();//Leemos los datos
        System.out.println("Ingrese su correo electronico: ");/*Pedimos al usuario que ingrese los datos*/
        String dato3 = sc.nextLine();//Leemos los datos
        System.out.print("Ingrese su edad: ");//Pedimos al usuario que ingrese los datos
        int dato2 = sc.nextInt();//Leemos los datos
        System.out.println("");
        System.out.println("Sus datos ordenados son: ");
        //En estas últimas 3 líneas de código ordenamos los datos y los mostramos al usuario.
        System.out.println("1. Nombre: " + dato1);
        System.out.println("2. Edad: " + dato2);
        System.out.println("3. Correo: " + dato3);
    }
}
