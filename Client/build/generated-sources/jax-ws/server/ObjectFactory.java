
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _AdddResponse_QNAME = new QName("http://Server/", "adddResponse");
    private final static QName _Addd_QNAME = new QName("http://Server/", "addd");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdddResponse }
     * 
     */
    public AdddResponse createAdddResponse() {
        return new AdddResponse();
    }

    /**
     * Create an instance of {@link Addd }
     * 
     */
    public Addd createAddd() {
        return new Addd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "adddResponse")
    public JAXBElement<AdddResponse> createAdddResponse(AdddResponse value) {
        return new JAXBElement<AdddResponse>(_AdddResponse_QNAME, AdddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "addd")
    public JAXBElement<Addd> createAddd(Addd value) {
        return new JAXBElement<Addd>(_Addd_QNAME, Addd.class, null, value);
    }

}
