
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div align="center">
    <a href="/create_phone">Add Phone</a>
    <h1>Phones List</h1>
    <table border="1" cellpadding="10">
        <thead>
        <tr>
            <th>Imei</th>
            <th>Model</th>
            <th>GB</th>
            <th>Color</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${phoneList}" var="phone">
            <tr>
                <td>${phone.imei}</td>
                <td>${phone.model}</td>
                <td>${phone.gb}</td>
                <td>${phone.color}</td>

                <td><a href="<c:url value='phone/edit/${phone.imei}' />">Edit</a></td>
                <td><a href="/phone/delete/${phone.imei}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>