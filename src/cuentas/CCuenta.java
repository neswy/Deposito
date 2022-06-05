package cuentas;

/**
 * 
 * Esta es la clase CCuenta
 * @author Sergio Maga
 * @since 13.0
 * @version 
 */

/*
Este comentario forma parte del punto 2 del 
apartado GIT  de la Tarea 4 
*/        
public class CCuenta {

    /**
     * 
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre de tipo string
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return cuenta. Devuelve un string cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * 
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * 
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * 
     * @param saldo de tipo double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @return the tipoInterés. Devuelve tipoInteres de tipo double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * 
     * @param tipoInterés de tipo double
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     *
     */
    public String nombre;

    /**
     *
     */
    public String cuenta;

    /**
     *
     */
    public double saldo;

    /**
     *
     */
    public double tipoInterés;

    /**
     *
     */
    public CCuenta()
    {
    }

    /**
     * 
     * @param nom tipo string
     * @param cue tipo string
     * @param sal tipo double
     * @param tipo tipo double
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @return parametro getSaldo
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * 
     * @param cantidad
     * @throws java.lang.Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * 
     * @param cantidad
     * @throws java.lang.Exception  
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}