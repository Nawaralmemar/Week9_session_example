<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Hello</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="container">

    <main>
<article>
    <ul id="menu">
        <li><a href="helloagain.jsp">More information about ${user.name}</a></li>
        <li><a href="Servlet?command=helloagain">Change password of  ${user.name}</a></li>
    </ul>
</article>
    </main>
</div>
</body>
</html>