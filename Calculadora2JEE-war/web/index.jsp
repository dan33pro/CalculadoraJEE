<%-- 
    Document   : index
    Created on : 2/05/2023, 04:27:17 PM
    Author     : ducar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculadora JEE</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="./styles/style.css" /> 
    </head>
    <body>
        <div>
            <form class="calculadora" action="./CalculadoraServlet">
                <span class="resultado">${actualNum}</span>
                <input type="submit" name="number" value="1" class="btn uno" />                
                <input type="submit" name="number" value="2" class="btn dos" />
                <input type="submit" name="number" value="3" class="btn tres" />
                <input type="submit" name="number" value="4" class="btn cuatro" />
                <input type="submit" name="number" value="5" class="btn cinco" />
                <input type="submit" name="number" value="6" class="btn seis" />
                <input type="submit" name="number" value="7" class="btn siete" />
                <input type="submit" name="number" value="8" class="btn ocho" />
                <input type="submit" name="number" value="9" class="btn nueve" />
                <input type="submit" name="number" value="0" class="btn cero" />
                <input type="submit" name="action" value="+" class="btn suma" />                
                <input type="submit" name="action" value="-" class="btn resta" />
                <input type="submit" name="action" value="*" class="btn multi" />
                <input type="submit" name="action" value="/" class="btn divi" />
                <input type="submit" name="action" value="%" class="btn mod" />
                <input type="submit" name="action" value="=" class="btn igual" />
            </form>
        </div>
    </body>
</html>
