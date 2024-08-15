<%-- 
    Document   : resultadocheck
    Created on : 13 de mai. de 2024, 12:00:55
    Author     : PC Gamer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
                      <style>

            #formulario {
                width: 300px;
                height: 200px;
                background-color: #D9D9D9;
                border: solid;
                border-color: #5C5A5A;
                position: relative;
                left: 42%;
             margin-top: 5%;
               
            }

        </style>
    </head>
    <body>
        <div id="formulario" >
            <br> <center>
               <%
        String x = (String) request.getAttribute("msg");
        out.print(x);
        
        %>
        <br><br>
        <a href = "videogamecontrol?btnoperacao=BuscarDados"> <button>Voltar</button> </a>
            </center>
        </div>
    </body>
</html>
