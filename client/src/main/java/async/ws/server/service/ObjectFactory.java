
package async.ws.server.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the async.ws.server.service package. 
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

    private final static QName _Registry_QNAME = new QName("http://service.server.ws.async/", "registry");
    private final static QName _Request_QNAME = new QName("http://service.server.ws.async/", "request");
    private final static QName _RegistryResponse_QNAME = new QName("http://service.server.ws.async/", "registryResponse");
    private final static QName _Response_QNAME = new QName("http://service.server.ws.async/", "response");
    private final static QName _ResponseResponse_QNAME = new QName("http://service.server.ws.async/", "responseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: async.ws.server.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Registry }
     * 
     */
    public Registry createRegistry() {
        return new Registry();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link RegistryResponse }
     * 
     */
    public RegistryResponse createRegistryResponse() {
        return new RegistryResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ResponseResponse }
     * 
     */
    public ResponseResponse createResponseResponse() {
        return new ResponseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Registry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.ws.async/", name = "registry")
    public JAXBElement<Registry> createRegistry(Registry value) {
        return new JAXBElement<Registry>(_Registry_QNAME, Registry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Request }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.ws.async/", name = "request")
    public JAXBElement<Request> createRequest(Request value) {
        return new JAXBElement<Request>(_Request_QNAME, Request.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.ws.async/", name = "registryResponse")
    public JAXBElement<RegistryResponse> createRegistryResponse(RegistryResponse value) {
        return new JAXBElement<RegistryResponse>(_RegistryResponse_QNAME, RegistryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.ws.async/", name = "response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.server.ws.async/", name = "responseResponse")
    public JAXBElement<ResponseResponse> createResponseResponse(ResponseResponse value) {
        return new JAXBElement<ResponseResponse>(_ResponseResponse_QNAME, ResponseResponse.class, null, value);
    }

}
