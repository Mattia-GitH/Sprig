
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div align="center">
    <a href="/create_comment">Add Comment</a>
    <h1>Users List</h1>
    <table border="1" cellpadding="10">
        <thead>
        <tr>
            <th>Imei</th>
            <th>Date</th>
            <th>problem</th>
            <th>comment</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${commentList}" var="comment">
            <tr>
                <td>${comment.imei}</td>
                <td>${comment.date}</td>
                <td>${comment.problem}</td>
                <td>${comment.comment}</td>
                <td><a href="<c:url value='/edit/${comment.imei}' />">Edit</a></td>
                <td><a href="delete/${comment.imei}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>