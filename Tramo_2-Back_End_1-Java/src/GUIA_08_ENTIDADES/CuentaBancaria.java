/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vac?o, con par?metros, getters y
setters.
 */

package GUIA_08_ENTIDADES;

/**
* Lucky2103ar
*/
public class CuentaBancaria {
    
    // ATRIBUTOS
    
    private Integer numeroCuenta;
    private Long dniCliente;
    private Double saldoActual;
    
    // CONSTRUCTORES

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    // GETTERS

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    
    // SETTERS

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // toString
    
    @Override
    public String toString() {
        return "Cuenta Bancaria" + "\nN?mero de Cuenta: " + numeroCuenta + "\nDNI Cliente: " + dniCliente + "\nSaldo Actual: $" + saldoActual;
    }
    
}
