<%-- 
    Document   : index
    Created on : 22/07/2019, 08:18:29 PM
    Author     : PC HOGAR
--%>

<%@page import="java.util.List"%>
<%@page import="webservice.Socio"%>
<%@page import="Model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            
            .form-control{
                max-width: 80%;
                margin:auto;
            }
            
        </style>
        <title>Consumo de web service</title>
    </head>
    <body>
        
        
        <h1 class="container" mt-4>Consumo Webservice Soap</h1>
             <br><br>
             <form role="form" METHOD="POST"  id="fmBuscar">
     
  <div class="form-group" >
      <center><label for="email"><h2>Ingrese cotilazión a realizar</h2></label></center>
      <input type="text" class="form-control" id="cantidad" name="cantidad" placeholder="Digite el monto a cotizar" required>
  </div>
  
                 <center><button type="submit"  class="btn btn-primary" id="btn" >consultar</button></center>
</form>
   
        <br><br>
            <div class="card">
                
                <div class="card-header">
                    
                   
                    
                    <div class="card-body">
                        
                        <table class="table talbe-hover" id="table">
                            
                            <thead>
                                  <% User user = new User();
                                
                                double cantidad = Double.parseDouble(request.getParameter("cantidad"));
                                
                                List <Socio> datos=user.obtener(cantidad);
                                
                                if (datos.isEmpty()){
                                
                                    out.println("No hay socio disponible");
                                   
                                }else{
                                for(Socio u:datos){
                                
                                
                                
                             
                                %>
                                
                                <tr>
                                    <th>Monto</th>
                                    <th>Socio que realiza el préstamo</th>
                                    <th>Cuota mensual</th>
                                    <th>Pago total del crédito</th>
                                    <th>Tasa de interés mensual</th>
                                    
                                </tr>
                            </thead>
                            
                            <tbody>
                              
                                  
                                <tr>
                                    
                                   <td><%  out.println(u.getCantidad());  %></td>  
                                    <td>  <% out.println(u.getSocio()); %> </td>
                                     <td><% out.println(u.getCmensual()); %></td>
                                      <td><% out.println(u.getPtotal()); %></td>
                                       <td><%  out.println(u.getTasa()); %></td>  
                                       
                                    <%}}%>
                                </tr>
                            </tbody>
                            
                            
                        </table>
                        
                        
                    </div>
                <div id="resultado"></div>
            </div>
                                
            </div>

    </body>
</html>

   
  
