/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author PC HOGAR
 */
public class Socio {
    
    private String socio;
    private String tasa;
    private  double monto;
    private  double cmensual;
    private  double ptotal;
    private  double cantidad;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCmensual() {
        return cmensual;
    }

    public void setCmensual(double cmensual) {
        this.cmensual = cmensual;
    }

    public double getPtotal() {
        return ptotal;
    }

    public void setPtotal(double ptotal) {
        this.ptotal = ptotal;
    }

    
    

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public void setTasa(String tasa) {
        this.tasa = tasa;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getSocio() {
        return socio;
    }

    public String getTasa() {
        return tasa;
    }

    public double getMonto() {
        return monto;
    }
    
     public Socio() {
       
    }

    public Socio(String socio, String tasa, double monto) {
        this.socio = socio;
        this.tasa = tasa;
        this.monto = monto;
    }
   
    
}
