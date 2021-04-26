<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Mijn Wijnkelder - Home</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="container">
    <header>
        <h1>Hello form</h1>

    </header>
    <main>
        <form  method="POST" action="Servlet?command=hello">
            <p><label for="name">name</label>
                <input type="text" id="name" name="name" required></p>

            <p><input type="submit" id="login" value="login"></p>

        </form>
    </main>
</div>
</body>
</html>