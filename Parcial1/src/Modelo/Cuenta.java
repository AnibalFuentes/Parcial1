package Modelo;

public class Cuenta {

    //Atributos
    private String noCuenta;
    private String tipoCuenta;
    private double saldoCuenta;
    private Usuario titular;

    //Constructor por defecto
    public Cuenta() {
    }

    //Contructor sobrecargado
    public Cuenta(String noCuenta, String tipoCuenta, double saldoCuenta, Usuario titular) {
        this.noCuenta = noCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
        this.titular = titular;
    }

    public Cuenta(String noCuenta, String tipoCuenta, double saldoCuenta) {
        this.noCuenta = noCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    //Gets
    public String getNoCuenta() {
        return this.noCuenta;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public double getSaldoCuenta() {
        return this.saldoCuenta;
    }

    public Usuario getTitular() {
        return titular;
    }

    //Sets
    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    //toString
    @Override
    public String toString() {
        return "Cuenta{" + "noCuenta=" + noCuenta + ", tipoCuenta=" + tipoCuenta + ", saldoCuenta=" + saldoCuenta + ", titular=" + titular + '}';
    }

}
