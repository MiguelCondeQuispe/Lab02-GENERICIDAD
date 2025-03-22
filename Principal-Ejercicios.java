import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 8) {
                salir = true;
                continue;
            }

            System.out.print("Ingrese el tipo de dato: \n1. Integer \n2. Double\nSeleccione una opción: ");
            int tipo = scanner.nextInt();

            if (opcion == 6 || opcion == 7) {
                System.out.print("Ingrese el número: ");
            } else if (opcion == 5) {
                System.out.print("Ingrese la base: ");
            } else {
                System.out.print("Ingrese el primer número: ");
            }

            switch (tipo) {
                case 1:
                    int numInt = scanner.nextInt();
                    OperacionesMatInteger opInt = new OperacionesMatInteger(numInt);
                    ejecutarOperacion(opInt, scanner, opcion);
                    break;
                case 2:
                    double numDouble = scanner.nextDouble();
                    OperacionesMatDouble opDouble = new OperacionesMatDouble(numDouble);
                    ejecutarOperacion(opDouble, scanner, opcion);
                    break;
                default:
                    System.out.println("Tipo de dato inválido.");
            }
        }
        scanner.close();
    }

    private static <E extends Number> void ejecutarOperacion(Operable<E> op, Scanner scanner, int opcion) {
        if (opcion >= 1 && opcion <= 4) {
            System.out.print("Ingrese el segundo número: ");
            E otro = (op instanceof OperacionesMatInteger) ? (E) Integer.valueOf(scanner.nextInt()) : (E) Double.valueOf(scanner.nextDouble());
            switch (opcion) {
                case 1 :
                    System.out.println("Resultado de la suma: " + op.suma(otro));
                    break;
                case 2 :
                    System.out.println("Resultado de la resta: " + op.resta(otro));
                    break;
                case 3 :
                    System.out.println("Resultado del producto: " + op.producto(otro));
                    break;
                case 4 :    
                    System.out.println(otro.doubleValue() == 0 ? "Error: División por cero no permitida." : "Resultado de la división: " + op.division((otro)));
            }
        } else if (opcion == 5) {
            System.out.print("Ingrese el exponente: ");
            E exponente = (op instanceof OperacionesMatInteger) ? (E) Integer.valueOf(scanner.nextInt()) : (E) Double.valueOf(scanner.nextDouble());
            System.out.println("Resultado de la potencia: " + op.potencia(exponente));
        } else if (opcion == 6) {
            System.out.println("Resultado de la raíz cuadrada: " + op.raizCuadrada());
        } else if (opcion == 7) {
            System.out.println("Resultado de la raíz cúbica: " + op.raizCubica());
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
