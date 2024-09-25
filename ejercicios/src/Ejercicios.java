import java.util.Scanner;

public class Ejercicios{

    public void actividad_inicial() {

        System.out.println("¿Como Te llamas?");

        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();

        System.out.println("¿A qué curso vas?");

        String curso = entrada.next();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        System.out.println("Introduce el primer número:");

        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número:");

        int num2 = entrada.nextInt();

        System.out.println("La suma de "+num1+ " y " + num2 + " es igual a " + (num1+num2));

    }


}
