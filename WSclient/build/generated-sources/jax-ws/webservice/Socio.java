
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para socio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="socio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cmensual" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ptotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="socio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "socio", propOrder = {
    "cantidad",
    "cmensual",
    "monto",
    "ptotal",
    "socio",
    "tasa"
})
public class Socio {

    protected double cantidad;
    protected double cmensual;
    protected double monto;
    protected double ptotal;
    protected String socio;
    protected String tasa;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(double value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cmensual.
     * 
     */
    public double getCmensual() {
        return cmensual;
    }

    /**
     * Define el valor de la propiedad cmensual.
     * 
     */
    public void setCmensual(double value) {
        this.cmensual = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad ptotal.
     * 
     */
    public double getPtotal() {
        return ptotal;
    }

    /**
     * Define el valor de la propiedad ptotal.
     * 
     */
    public void setPtotal(double value) {
        this.ptotal = value;
    }

    /**
     * Obtiene el valor de la propiedad socio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocio() {
        return socio;
    }

    /**
     * Define el valor de la propiedad socio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocio(String value) {
        this.socio = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasa(String value) {
        this.tasa = value;
    }

}
