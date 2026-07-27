public class ChainFormating {
    public static void main(String[] args) {
        System.out.println("Welcome to the Chain Formatting System!");
        var nombre = "Renzo";
        var edad = 26;
        var salario = 7500.50;
        System.out.println("Name: " + nombre);
        System.out.println("Age: " + edad);
        System.out.println("Salary: " + salario);

        var mensaje = String.format("Name: %s, Age: %d, Salary: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        mensaje = """
                %nPerson Details:
                ------------------------
                \tName: %s
                \tAge: %d
                \tSalary: %.2f
                ------------------------
                """.formatted(nombre,edad,salario);
        System.out.println(mensaje);
        System.out.printf("""
                %nPerson Details:
                ------------------------
                \tName: %s
                \tAge: %d
                \tSalary: %.2f
                ------------------------
                """,nombre, edad, salario);
    }
}
