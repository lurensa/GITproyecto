package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de cuenta bancaria.
     */
    private String cuenta;

    /**
     * Saldo disponible en la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interés asociado a la cuenta.
     */
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     *
     * @param nombre       Nombre del titular de la cuenta.
     * @param cuenta       Número de cuenta bancaria.
     * @param saldo        Saldo inicial de la cuenta.
     * @param tipoInteres  Tipo de interés asociado a la cuenta.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    // Métodos getter y setter para encapsular los atributos

    /**
     * Obtiene el nombre del titular de la cuenta.
     *
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     *
     * @param nombre El nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta bancaria.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta bancaria.
     *
     * @param cuenta El nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo El nuevo saldo.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés asociado a la cuenta.
     *
     * @return El tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInteres El nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método para consultar el saldo actual.
     *
     * @return El saldo disponible.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta.
     *
     * @param cantidad Cantidad que se desea ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta.
     *
     * @param cantidad Cantidad que se desea retirar.
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (saldo < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo -= cantidad;
    }
}
