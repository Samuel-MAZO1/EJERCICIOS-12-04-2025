import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner h = new Scanner (System.in);/*Desde la línea 6 hasta la línea 15 definimos todas las variables utilizadasd e el programa*/
    int opcion;
    double r;
    double areaCirculo;
    double pi = 3.14159265359;
    double alturaTriangulo;
    double baseTriangulo;
    double areaTri;
    double alturaRectangulo;
    double baseRectangulo;
    double areaRectangulo;
       do { //Iniciamos el bucle "Repetir" para que se repita el programa.
       //Desde la línea de código 17 hasta la 24 hacemos el menú.
           System.out.println("Elige que area deseas calcular: ");
           System.out.println("");
           System.out.println("1. Triangulo");
           System.out.println("2. Rectangulo");
           System.out.println("3. Circulo");
           System.out.println("Presione cualquier otra tecla para salir");
           opcion = h.nextInt();
           
            switch (opcion) {/*Iniciamos el bucle "Según" para que dependiendo de la opción el programa ejecute una acción*/
               case 1:
               System.out.print("Ingrese la altura del triangulo: ");//Preguntamos el dato.
               alturaTriangulo = h.nextDouble();//Leemos el dato.
               System.out.print("Ingrese la base del triangulo: ");//Preguntamos el dato.
               baseTriangulo = h.nextDouble();//Leemos el dato.
               areaTri = ((alturaTriangulo * baseTriangulo) / 2);//Realizamos la operación.
               System.out.println("El area del triangulo es: " + areaTri);/*Mostramos el resultado*/
               break;
               
               case 2:
                System.out.print("Ingrese la altura del rectangulo: ");/*Preguntamos el dato*/
               alturaRectangulo = h.nextDouble();//Leemos el dato.
               System.out.print("Ingrese la base del rectangulo: ");//Preguntamos el dato.
               baseRectangulo = h.nextDouble();//Leemos el dato.
               areaRectangulo = alturaRectangulo * baseRectangulo;//Realizamos la operación
               System.out.println("El area del rectangulo es: " + areaRectangulo);
               break;
               
               case 3:
                System.out.print("Ingrese el radio del circulo: ");//Preguntamos el dato.
               r = h.nextDouble();//Leemos el dato.
               areaCirculo = pi * r * r;//Realizamos la operación.
               System.out.println("El area del circulo es: " + areaCirculo);/*Mostrar resultado*/
               break;
              
           }
       } while (opcion < 0 && opcion > 3);
       System.out.println("¡Gracias por utilizar el programa!");
    }
}
