<%-- 
    Document   : dados
    Created on : 28 de mar. de 2024, 16:36:22
    Author     : PC Gamer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
      <%@ page import="model.videogame" %>
        <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>

            #table {
           
                margin-top: 1%;
              
            }
            
               #button {
                margin-left: 73%;
               margin-top: 1%;
                position: absolute;
                padding: 10px 20px;
                background-color: gray;
                border:solid;
            }

            
             #button:hover {
                
                
                padding: 10px 20px;
                background-color: darkgray;
            }
            
            #textofiltro {
                margin-left: 17%;
            }
            
               #button2:hover {
                
              
                padding: 10px 20px;
                background-color: darkgray;
            }
            
                #button2 {
              
               margin-top: 1%;
               
                padding: 10px 20px;
                background-color: gray;
                border:solid;
            }
  
            
        </style>
                <script type="text/javascript">
            
            function msg(){
                alert("CONTA DELETADA");
            }
            
        
            </script>
        
    </head>
    <body>
        <div><a href="cadastrar.html"> <button id="button"> ADICIONAR ITEM </button></a>
        <form name="formfiltro" action="videogamecontrol" > <input type="text" id="textofiltro" name="parametro" maxlength="20" size="18"> &nbsp; <button id="button2" name="btnoperacao" value="Filtra" type="submit"> FILTRAR </button><br> </form> </div> 
    <CENTER><table border =1 id="table">
                   <th>ID</th> <th>NOME</th> <th>TIPO</th> <th>FABRICANTE</th> <th>TIPO DE MIDIA</th> <th>PROCESSADOR</th> <th>MEMORIA</th> <th>ANO DE LANÇAMENTO</th> <th>TEMPO DE GARANTIA</th> <th>VALOR</th> <th>EDITAR</th> <th>EXCLUIR</th>
        <% 
        List<videogame> lista = (List<videogame>) request.getAttribute("lista");
        
       for (videogame v : lista) {

        %>    
        
        <tr>
            <td> <%= v.getId() %> </td>
            <td> <%= v.getNome() %> </td>
            <td> <%= v.getTipo() %> </td>
            <td> <%= v.getFabricante() %> </td>
            <td> <%= v.getTipomidia() %> </td>
            <td> <%= v.getProcessador() %> </td>
            <td> <%= v.getMemoria() %> </td>
            <td> <%= v.getAno() %> </td>
            <td> <%= v.getGarantia() %> </td>
            <td> <%= v.getValor() %> </td>
            
            <td> <a href = "videogamecontrol?id=<%out.print(v.getId());%>&btnoperacao=Busca""> <img src="img/1.png" height="50px" width="50px"> </a> </td>
            <td>  <a href = "videogamecontrol?id=<%out.print(v.getId());%>&btnoperacao=Deleta" onclick="return msg()"> <img src="img/2.png" height="50px" width="50px"> </a> </td>
        </tr>
          
        <% } 
        %>
        
            
        </table>
        <br>
        <a href="checkbox.html"> <button> RECEBER NOTIFICAÇÕES </button> </a>
        </CENTER> 
    </body>
</html>
