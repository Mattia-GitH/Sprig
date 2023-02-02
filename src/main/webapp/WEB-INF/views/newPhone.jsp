<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>New Phone</title>
</head>
<body>
<div align="center">


    <form action="/create_phone" method="post">
        <table>
            <tr><td>QR Code:</td>
                <td><input type="text" name="qr_code" /></td>
        </table>
        <input type="submit" value="Input" />
    </form>



    <c:set var="decode" value="${fn:split(param.qr_code, ',')}" />
    <form:form method="post" modelAttribute="phone" action="/save_phone">
        <table border="1">
            <tr>
                <th colspan="2">New Phone</th>
            </tr>
            <tr>
                <td><form:label path="imei">imei:</form:label></td>
                <td><form:input path="imei" value="${decode[0]}"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="model">model:</form:label></td>
                <td><form:input path="model" value="${decode[1]}"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="gb">GB:</form:label></td>
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
                <td><form:label path="color">Color:</form:label></td>
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