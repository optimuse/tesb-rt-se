package org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.3.1
 * Tue Dec 28 16:52:06 EET 2010
 * Generated source version: 2.3.1
 * 
 */
 
@WebService(targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/wsdl/", name = "SecurityTokenResponseService")
@XmlSeeAlso({org.xmlsoap.schemas.ws._2004._09.policy.ObjectFactory.class, org.oasis_open.docs.ws_sx.ws_trust._200512.ObjectFactory.class, org.w3._2000._09.xmldsig.ObjectFactory.class, org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_utility_1_0.ObjectFactory.class, org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SecurityTokenResponseService {

    @Oneway
    @WebMethod(operationName = "RequestSecurityTokenResponse", action = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/RequestSecurityTokenMsg")
    public void requestSecurityTokenResponse(
        @WebParam(partName = "response", name = "RequestSecurityTokenResponse", targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/")
        org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType response
    );
}
