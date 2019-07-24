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
public class User {
    
    public User(){
    
    
    }

    public java.util.List<webservice.Socio> obtener(double arg0) {
        webservice.WSfinanciacion_Service service = new webservice.WSfinanciacion_Service();
        webservice.WSfinanciacion port = service.getWSfinanciacionPort();
        return port.obtener(arg0);
    }
    
}
