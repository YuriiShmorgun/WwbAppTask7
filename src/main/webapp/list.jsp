<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Hello servlet</h2>
<c:forEach var="user" items="${requestScope.userList}">
    <ul>
        <li>
            Name: <c:out value="${user.name}"/> Age: <c:out value="${user.age}"/>
        </li>
    </ul>
    <hr/>
</c:forEach>
</body>


    <label><a href="/sortByTitle"><button onclick="">Sort by title</button></a></label>
    <label><a href="/sortByName"><button onclick="">sortByName</button></a></label>
</html>
