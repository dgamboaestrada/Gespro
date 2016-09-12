<%-- 
    Document   : pedido_pedidoLocalizacion
    Created on : 12/12/2014, 11:32:49 AM
    Author     : 578
--%>

<%@page import="com.tsp.gespro.bo.RegistroCheckInBO"%>
<%@page import="com.tsp.gespro.dto.RegistroCheckin"%>
<%@page import="com.tsp.gespro.util.DateManage"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" class="com.tsp.gespro.bo.UsuarioBO"/>

<%
//Verifica si el cliente tiene acceso a este topico
if (user == null || !user.permissionToTopicByURL(request.getRequestURI().replace(request.getContextPath(), ""))) {
    response.sendRedirect("../../jsp/inicio/login.jsp?action=loginRequired&urlSource=" + request.getRequestURI() + "?" + request.getQueryString());
    response.flushBuffer();
} else {

        int idEmpresa = user.getUser().getIdEmpresa();        
         
        /*
         * Parámetros
         */
        
        int idCheck = -1;
        try{ idCheck = Integer.parseInt(request.getParameter("checkIn")); }catch(NumberFormatException e){}
        
              
        RegistroCheckin checkDto =  null;  
        RegistroCheckInBO registroCheckInBO =null;
        
        try{
            if (idCheck>0){
                registroCheckInBO = new RegistroCheckInBO(idCheck,user.getConn());
                checkDto = registroCheckInBO.getRegistroCheckin();
            }                 
        }catch(Exception ex){
            ex.printStackTrace();
        }
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../include/keyWordSEO.jsp" />

        <title><jsp:include page="../include/titleApp.jsp" /></title>

        <jsp:include page="../include/skinCSS.jsp" />

        <jsp:include page="../include/jsFunctions.jsp"/>
        
        <script type="text/javascript">
        
           /// Mapa
            var coordenada;
            var marker;
            var map;
               
            
           
            function initialize() {
                
                var coordenada = new google.maps.LatLng(<%=checkDto!=null?checkDto.getLatitud():0 %>,<%=checkDto!=null?checkDto.getLongitud():0%>);
                                
                obtenerDireccion(coordenada);
                
                var mapOptions = {
                    zoom: 15,
                    center: coordenada
                };

                 map = new google.maps.Map(document.getElementById('map_canvas'),
                          mapOptions);
                 
                 map.controls[google.maps.ControlPosition.TOP_RIGHT].push(
                FullScreenControl(map, 'Pantalla Completa',
                'Salir Pantalla Completa'));

                 marker = new google.maps.Marker({
                    map:map,
                    //icon: "../../images/Cart-32.png",
                    animation: google.maps.Animation.DROP,
                    position: coordenada,                   
                    title: "Registro: " + "<%=checkDto!=null?checkDto.getIdCheck():"" %>"  
                 });
                
                 var infowindow = new google.maps.InfoWindow({
                    content: "Fecha:  " + "<%=checkDto!=null?checkDto.getFechaHora():"" %>"      
                });
                
                
                infowindow.open(map,marker);  
                google.maps.event.addListener(marker, 'click', function() {
                    infowindow.open(map,marker);
                });
               
                             
            }
        
            function loadScript() {
                var script = document.createElement('script');
                script.type = 'text/javascript';
                script.src = 'https://maps.googleapis.com/maps/api/js?libraries=geometry,drawing&sensor=false&' +
                    'callback=initialize';
                document.body.appendChild(script);
            }
            
            window.onload = loadScript;
            
            
            
            function obtenerDireccion(latlng){
                var dir;
                var geocoder;          
                geocoder =  new google.maps.Geocoder(latlng);  
             
               geocoder.geocode({'latLng': latlng}, function(results, status) {
                    if (status == google.maps.GeocoderStatus.OK) {
                          if (results[1]) {
                             
                            dir = results[1].formatted_address;   
                            $('#dir').empty();
                            $('#dir').append(dir);
                            
                          } else {
                            $('#dir').empty();
                            $('#dir').append("No se encontraron resultados");                          
                          }
                    } else {
                        $('#dir').empty();
                        $('#dir').append("Geocoding no tuvo éxito debido a: " + status);                       
                    }
              });
             
                
            }
            
            
            /// Fin Mapa           
                    
            </script>
                                        
           
    </head>
    <body>
        <div class="content_wrapper">

            <jsp:include page="../include/header.jsp" flush="true"/>

            <jsp:include page="../include/leftContent.jsp"/>

            <!-- Inicio de Contenido -->
            <div id="content">

                <div class="inner">
                    <h1>Bitácora</h1>

                    <div id="ajax_loading" class="alert_info" style="display: none;"></div>
                    <div id="ajax_message" class="alert_warning" style="display: none;"></div>

                    <!--TODO EL CONTENIDO VA AQUÍ-->
                    <form action="" method="post" id="frm_action">
                    <div class="twocolumn">
                        <div class="column_left">
                            <div class="header">
                                <span>
                                    <img src="../../images/clock.png" alt="icon"/>
                                    <% if(checkDto!=null){%>
                                        Registro Id:  <%=checkDto!=null?checkDto.getIdCheck():"" %>
                                    <%}%>
                                    
                                </span>
                            </div>
                            <br class="clear"/>
                            <div class="content">                                  
                                    <p>
                                        <label>ID:</label><br/>
                                        <span><%=checkDto!=null?checkDto.getIdCheck():"" %></span>                                  
                                    </p>
                                    <br/>                                    
                                    <p>
                                        <label>Fecha/Hora:</label><br/>
                                        <span><%=checkDto!=null?checkDto.getFechaHora():"" %></span>                                  
                                    </p>
                                    <br/>                               
                                    <p>
                                        <label>Latitud:</label>
                                        <span><%=checkDto!=null?checkDto.getLatitud():"" %></span>                                  
                                        &nbsp;&nbsp;&nbsp;
                                        <label>Longitud:</label>
                                        <span><%=checkDto!=null?checkDto.getLongitud():"" %></span>                                  
                                    </p>
                                    <br/>
                                    <p>
                                        <label>Dirección aproximada:</label><br/>
                                        <span id="dir"></span>      
                                        <br>
                                    </p>
                                    <br/><br/><br/>
                            </div>
                        </div>
                        <!-- End left column window -->
                                                
                        <%
                        if (checkDto!=null){                                      
                            %>    
                            <div class="column_right">                            
                                <div class="header">
                                    <span>
                                        <img src="../../images/icon_mapa_1.png" alt="icon"/>
                                        Ubicación
                                    </span>
                                </div>
                                <div class="content">
                                <%if((checkDto.getLatitud() != 0)&& (checkDto.getLongitud() != 0) )
                                 { %>
                                
                                    <div id="map_canvas" style="height: 270px; width: 100%">
                                        <img src="../../images/maps/ajax-loader.gif" alt="Cargando" style="margin: auto;"/>
                                    </div>     
                               
                                <%}else{ %>
                                <div><span>No se registro ubicación</span><div>
                                <%
                                } 
                                %>
                            
                                </div> 
                             </div>
                            <%                              
                        }
                        %>
                    </div>
                    </form>
                    <!--TODO EL CONTENIDO VA AQUÍ-->     
                    
                </div>
                    
                    <div id="action_buttons">
                        
                        <p>   
                                   
                            <input type="button" id="regresar" value="Regresar" onclick="history.back();"/>
                        </p>
                    </div>
                    
                <jsp:include page="../include/footer.jsp"/>
            </div>
            <!-- Fin de Contenido-->
        </div>


    </body>
</html>
<%}%>