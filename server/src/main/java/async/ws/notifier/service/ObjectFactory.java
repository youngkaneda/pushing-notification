
package async.ws.notifier.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the async.ws.notifier.service package. 
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

    private final static QName _SubscribeResponse_QNAME = new QName("http://service.notifier.ws.async/", "subscribeResponse");
    private final static QName _Subscribe_QNAME = new QName("http://service.notifier.ws.async/", "subscribe");
    private final static QName _Notify_QNAME = new QName("http://service.notifier.ws.async/", "notify");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: async.ws.notifier.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Subscribe }
     * 
     */
    public Subscribe createSubscribe() {
        return new Subscribe();
    }

    /**
     * Create an instance of {@link SubscribeResponse }
     * 
     */
    public SubscribeResponse createSubscribeResponse() {
        return new SubscribeResponse();
    }

    /**
     * Create an instance of {@link Notify }
     * 
     */
    public Notify createNotify() {
        return new Notify();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notifier.ws.async/", name = "subscribeResponse")
    public JAXBElement<SubscribeResponse> createSubscribeResponse(SubscribeResponse value) {
        return new JAXBElement<SubscribeResponse>(_SubscribeResponse_QNAME, SubscribeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subscribe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notifier.ws.async/", name = "subscribe")
    public JAXBElement<Subscribe> createSubscribe(Subscribe value) {
        return new JAXBElement<Subscribe>(_Subscribe_QNAME, Subscribe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Notify }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.notifier.ws.async/", name = "notify")
    public JAXBElement<Notify> createNotify(Notify value) {
        return new JAXBElement<Notify>(_Notify_QNAME, Notify.class, null, value);
    }

}
