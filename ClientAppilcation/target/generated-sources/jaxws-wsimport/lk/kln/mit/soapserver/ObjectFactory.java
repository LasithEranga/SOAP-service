
package lk.kln.mit.soapserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lk.kln.mit.soapserver package. 
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

    private final static QName _DivideResponse_QNAME = new QName("http://soapserver.mit.kln.lk/", "divideResponse");
    private final static QName _Divide_QNAME = new QName("http://soapserver.mit.kln.lk/", "divide");
    private final static QName _DeductResponse_QNAME = new QName("http://soapserver.mit.kln.lk/", "deductResponse");
    private final static QName _Multiply_QNAME = new QName("http://soapserver.mit.kln.lk/", "multiply");
    private final static QName _PercentageResponse_QNAME = new QName("http://soapserver.mit.kln.lk/", "percentageResponse");
    private final static QName _Add_QNAME = new QName("http://soapserver.mit.kln.lk/", "add");
    private final static QName _Deduct_QNAME = new QName("http://soapserver.mit.kln.lk/", "deduct");
    private final static QName _Percentage_QNAME = new QName("http://soapserver.mit.kln.lk/", "percentage");
    private final static QName _AddResponse_QNAME = new QName("http://soapserver.mit.kln.lk/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://soapserver.mit.kln.lk/", "multiplyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lk.kln.mit.soapserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link Deduct }
     * 
     */
    public Deduct createDeduct() {
        return new Deduct();
    }

    /**
     * Create an instance of {@link PercentageResponse }
     * 
     */
    public PercentageResponse createPercentageResponse() {
        return new PercentageResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link Percentage }
     * 
     */
    public Percentage createPercentage() {
        return new Percentage();
    }

    /**
     * Create an instance of {@link Divide }
     * 
     */
    public Divide createDivide() {
        return new Divide();
    }

    /**
     * Create an instance of {@link DivideResponse }
     * 
     */
    public DivideResponse createDivideResponse() {
        return new DivideResponse();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link DeductResponse }
     * 
     */
    public DeductResponse createDeductResponse() {
        return new DeductResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivideResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "divideResponse")
    public JAXBElement<DivideResponse> createDivideResponse(DivideResponse value) {
        return new JAXBElement<DivideResponse>(_DivideResponse_QNAME, DivideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Divide }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "divide")
    public JAXBElement<Divide> createDivide(Divide value) {
        return new JAXBElement<Divide>(_Divide_QNAME, Divide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "deductResponse")
    public JAXBElement<DeductResponse> createDeductResponse(DeductResponse value) {
        return new JAXBElement<DeductResponse>(_DeductResponse_QNAME, DeductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PercentageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "percentageResponse")
    public JAXBElement<PercentageResponse> createPercentageResponse(PercentageResponse value) {
        return new JAXBElement<PercentageResponse>(_PercentageResponse_QNAME, PercentageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "deduct")
    public JAXBElement<Deduct> createDeduct(Deduct value) {
        return new JAXBElement<Deduct>(_Deduct_QNAME, Deduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Percentage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "percentage")
    public JAXBElement<Percentage> createPercentage(Percentage value) {
        return new JAXBElement<Percentage>(_Percentage_QNAME, Percentage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapserver.mit.kln.lk/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

}
