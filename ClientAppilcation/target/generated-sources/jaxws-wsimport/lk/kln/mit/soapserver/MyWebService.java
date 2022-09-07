
package lk.kln.mit.soapserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MyWebService", targetNamespace = "http://soapserver.mit.kln.lk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MyWebService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://soapserver.mit.kln.lk/", className = "lk.kln.mit.soapserver.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://soapserver.mit.kln.lk/", className = "lk.kln.mit.soapserver.HelloResponse")
    @Action(input = "http://soapserver.mit.kln.lk/MyWebService/helloRequest", output = "http://soapserver.mit.kln.lk/MyWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}