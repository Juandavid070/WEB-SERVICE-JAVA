
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Obtener_QNAME = new QName("http://Webservice/", "obtener");
    private final static QName _ObtenerResponse_QNAME = new QName("http://Webservice/", "obtenerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Obtener }
     * 
     */
    public Obtener createObtener() {
        return new Obtener();
    }

    /**
     * Create an instance of {@link ObtenerResponse }
     * 
     */
    public ObtenerResponse createObtenerResponse() {
        return new ObtenerResponse();
    }

    /**
     * Create an instance of {@link Socio }
     * 
     */
    public Socio createSocio() {
        return new Socio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obtener }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Webservice/", name = "obtener")
    public JAXBElement<Obtener> createObtener(Obtener value) {
        return new JAXBElement<Obtener>(_Obtener_QNAME, Obtener.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Webservice/", name = "obtenerResponse")
    public JAXBElement<ObtenerResponse> createObtenerResponse(ObtenerResponse value) {
        return new JAXBElement<ObtenerResponse>(_ObtenerResponse_QNAME, ObtenerResponse.class, null, value);
    }

}
