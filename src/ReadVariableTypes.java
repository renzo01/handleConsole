import java.util.Scanner;

public class ReadVariableTypes {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("fill with ur age: ");
        var edad = console.nextInt();
        System.out.println("Tu edad es: " + edad);
        console.nextLine(); // consume the leftover newline character
        // double type
        System.out.println("fill with ur height: ");
        var altura = console.nextDouble();
        System.out.println("Tu altura es: " + altura);
        console.nextLine(); // consume the leftover newline character
        // String type
        System.out.println("fill with ur name: ");
        var nombre = console.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        //Data convertion
        System.out.println("Give a Interger value: ");
        // var enteroString =  console.nextLine();
        // var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(console.nextLine());
        System.out.println("Tu valor entero es: " + entero);
        //Tipo flotante
        System.out.println("Give a Float value: ");
        var floatString =  Float.parseFloat(console.nextLine());
        System.out.println("Tu valor flotante es: " + floatString);
    }
}
