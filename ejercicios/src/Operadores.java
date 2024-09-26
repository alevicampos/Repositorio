import java.util.Scanner;

public class Operadores {

    public void aritmeticos() {

    }

    public void asignacion() {


        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        String x = "Thank", y = "You";
        // Operador + y -
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        // El operador + si se usa con strings
        // concatena las cadenas dadas.
        System.out.println("x + y = " + x + y);
        // Operador * y /
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        // operador de módulo da el resto
        // de dividir el primer operando con el segundo
        System.out.println("a % b = " + (a % b));
        // si el denominador es 0 en la división
        // System.out.println(a/c);
        // lanzaría una java.lang.ArithmeticException


    }


    public void relacionales() {
        int a = 20, b = 10;
        String x = "Thank", y = "Thank";
        int ar[] = {1, 2, 3};
        int br[] = {1, 2, 3};
        boolean condicion = true;
//varios operadores condicionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));
        // Los Arrays no se pueden comparar con
        // operadores relacionales porque los objetos
        // almacenan referencias, mas no el valor
        System.out.println("x == y : " + (ar == br));
        System.out.println("condicion==true :" + (condicion == true));
    }

    public void logicos() {
        String x = "java";
        String y = "desdecero";
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese usuario:");
        String uuid = s.next();
        System.out.print("Ingrese contraseña:");
        String upwd = s.next();
        // Verifique si el nombre de usuario y la contraseña coinciden o no.
        if ((uuid.equals(x) && upwd.equals(y)) ||
                (uuid.equals(y) && upwd.equals(x))) {
            System.out.println("Bienvenido usuario.");
        } else {
            System.out.println("ID o Contraseña equivocada");
        }
    }
}