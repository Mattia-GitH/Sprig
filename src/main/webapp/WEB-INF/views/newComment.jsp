<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Create New Comment</title>
</head>
<body>
<div align="center">
    <form:form method="post" modelAttribute="comment" action="/save_comment">
        <table border="1">
            <tr>
                <th colspan="2">New Comment</th>
            </tr>
            <tr>
                <td><form:label path="imei">imei:</form:label></td>
                <td><form:input path="imei"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="date">date:</form:label></td>
                <td><form:input path="date"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="problem">problem:</form:label></td>
                <td><form:input path="problem"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="comment">comment:</form:label></td>
                <td><form:input path="comment"></form:input></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"/></td>
            </tr>
        </table>
    </form:form>

</div>
</body>
</html>