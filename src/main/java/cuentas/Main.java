package cuentas;

/**
 * Clase principal para realizar operaciones sobre una cuenta bancaria.
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * @param args argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        operativa_cuenta(695f); // Llamar al método con un ejemplo de cantidad
    }

    /**
     * Método que engloba las operaciones sobre la cuenta bancaria.
     * @param cantidad monto que se desea ingresar en la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1; // Crear una instancia de CCuenta
        double saldoActual; // Variable para almacenar el saldo actual

        // Inicializar la cuenta con datos predefinidos
        cuenta1 = new CCuenta("Luisa Rentoumis", "1000-2365-85-1230456789", 2500, 0);

        // Consultar el saldo actual
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Intentar retirar dinero
        try {
            cuenta1.retirar(2300);
            System.out.println("Retiro realizado correctamente.");
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        // Intentar ingresar dinero
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
            System.out.println("Ingreso realizado correctamente.");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }

        // Consultar el saldo después de las operaciones
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual tras las operaciones es " + saldoActual);
    }
}
