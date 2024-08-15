<%-- 
    Document   : editar
    Created on : 4 de abr. de 2024, 10:27:49
    Author     : PC Gamer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.videogame" %>
<!DOCTYPE html>
<html>
    <head>
        
                <style>

            #formulario {
                width: 500px;
                height: 400px;
                background-color: #D9D9D9;
                border: solid;
                border-color: #5C5A5A;
                position: relative;
                left: 38%;
             margin-top: 5%;
               
            }

        </style>
        
                        <script type="text/javascript">
            
            function msg(){
                alert("VIDEOGAME ATUALIZADO");
            }
            
        
            </script>
        
    </head>
    <body>
             <%
        model.videogame v = (model.videogame) request.getAttribute("videogame");
        
        %>
        
  <div id="formulario" >
      <form name="formeditar" action="videogamecontrol" onsubmit="return msg()">
      <BR>
      <center> <p id="tituloform"> Editar videogame </p> </center> <br>
      <center> id &nbsp; <input type="text" name="id" maxlength="20" size="18" readonly value="<%out.print(v.getId());%>"> </center> <br>
      &nbsp; Nome &nbsp; <input type="text" name="nome" maxlength="20" size="18" value="<%out.print(v.getNome());%>"> &nbsp; Fabricante &nbsp; <input name="fabricante" type="text" maxlength="20" size="18" value="<%out.print(v.getFabricante());%>">
      <br> <br> &nbsp; Tipo &nbsp; <input name="tipo" type="text" maxlength="20" size="20" value="<%out.print(v.getTipo());%>"> &nbsp; Garantia &nbsp; <input name="garantia" type="text" value="<%out.print(v.getGarantia());%>">
      <br><br> &nbsp; Valor &nbsp; <input name="valor" type="text" maxlength="17" size="16" value="<%out.print(v.getValor());%>"> &nbsp; memoria &nbsp; <input name="memoria" type="text" maxlength="17" size="15" value="<%out.print(v.getMemoria());%>">
      <br><br> &nbsp; processador &nbsp; <input name="processador" type="text" value="<%out.print(v.getProcessador());%>"> &nbsp; tipo de midia &nbsp; <input name="tipomidia" type="text"  size="7" value="<%out.print(v.getTipomidia());%>"> 
      <br><br>&nbsp; Ano &nbsp; <input name="ano" type="text" maxlength="20" size="18" value="<%out.print(v.getAno());%>">
      <br><br><br><br> <center> <button id="button" name="btnoperacao" value="Edita" type="submit"> Editar </button></center>
        
      </form>
  </div>
    
</html>
