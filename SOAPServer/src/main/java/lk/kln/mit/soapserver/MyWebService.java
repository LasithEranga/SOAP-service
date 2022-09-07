/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.kln.mit.soapserver;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lasith
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {
    
    @WebMethod(operationName = "add")
    public double add(@WebParam(name = "firstNumber") double firstNumber,@WebParam(name = "secondNumber") double secondNumber) {
        return firstNumber + secondNumber;
    }
    
    @WebMethod(operationName = "divide")
    public double divide(@WebParam(name = "firstNumber") double firstNumber,@WebParam(name = "secondNumber") double secondNumber) {
        return firstNumber / secondNumber;
    }
    
    @WebMethod(operationName = "deduct")
    public double deduct(@WebParam(name = "firstNumber") double firstNumber,@WebParam(name = "secondNumber") double secondNumber) {
        return firstNumber - secondNumber;
    }
    
    @WebMethod(operationName = "multiply")
    public double multiply(@WebParam(name = "firstNumber") double firstNumber,@WebParam(name = "secondNumber") double secondNumber) {
        return firstNumber * secondNumber;
    }
    
    @WebMethod(operationName = "percentage")
    public double percentage(@WebParam(name="firstNumber") double firstNumber, @WebParam(name="secondNumber") double secondNumber){
        return (firstNumber * secondNumber)/100;
    }
    
}
