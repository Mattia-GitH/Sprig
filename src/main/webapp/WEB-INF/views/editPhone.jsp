<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Edit Phone</title>
</head>
<body>
<div align="center">
    <form:form method="post" modelAttribute="phone" action="/phone/update/${phone.imei}">
        <table border="1">
            <tr>
                <th colspan="2">New Comment</th>
            </tr>
            <tr>
                <td><form:label path="imei">imei:</form:label></td>
                <td><form:input path="imei"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="model">model:</form:label></td>
                <td><form:input path="model"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="gb">gb:</form:label></td>
                <td>
                    <form:select class="selectpicker form-control select-di" path="gb" id="east-order" isChanged="false">
                        <form:option value="32">32</form:option>
                        <form:option value="64">64</form:option>
                        <form:option value="128">128</form:option>
                        <form:option value="256">256</form:option>
                        <form:option value="512">512</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="color">color:</form:label></td>
                <td><form:input path="color"></form:input></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"/></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>