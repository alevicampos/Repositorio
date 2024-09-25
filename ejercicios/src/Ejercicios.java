import java.util.Scanner;

public class Ejercicios{

    public void actividad_inicial() {

        System.out.println("¿Como Te llamas?");

        Scanner entrada = new Scanner(System.in);

        String nombre = entrada.next();

        System.out.println("¿A qué curso vas?");

        String curso = entrada.next();

        System.out.println("Hola " + nombre + " bienvenido a " + curso);
        int num1= 0;
        int num2= 0;

        while (num1==num2) {

            System.out.println("Introduce el primer número:");

            num1 = entrada.nextInt();

            System.out.println("Introduce el segundo número:");

            num2 = entrada.nextInt();

            if (num1 == num2) {

                System.out.println("ERROR. Los números son iguales");

            }
        }

        System.out.println("La suma de "+num1+ " y " + num2 + " es igual a " + (num1+num2));

    }


}
