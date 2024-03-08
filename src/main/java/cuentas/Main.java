package cuentas;

/**
 *
 * @author miguel-castro
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativaCuenta(cuenta1, null);
    }
    
    private static void operativaCuenta (CCuenta cuenta, Float cantidad) {
        double saldoActual;
        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
