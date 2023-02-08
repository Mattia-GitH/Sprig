<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Edit test</title>
</head>
<body>
<div align="center">
    <form:form method="post" modelAttribute="test" action="/test/update/${test.imei}">
        <table border="1">
            <tr>
                <th colspan="2">New test</th>
            </tr>
            <tr>
                <td><form:label path="imei">imei:</form:label></td>
                <td><form:input path="imei"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="wifi">wifi:</form:label></td>
                <td><form:checkbox path="wifi"></form:checkbox></td>
            </tr>
            <tr>
                <td><form:label path="bluetooth">bluetooth:</form:label></td>
                <td><form:input path="bluetooth"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="gps">gps:</form:label></td>
                <td><form:input path="gps"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="battery">battery:</form:label></td>
                <td><form:input path="battery"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="proximity_sensor">proximity_sensor:</form:label></td>
                <td><form:input path="proximity_sensor"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="vibrations">vibrations:</form:label></td>
                <td><form:input path="vibrations"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="buttons">buttons:</form:label></td>
                <td><form:input path="buttons"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="microphones">microphones:</form:label></td>
                <td><form:input path="microphones"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="speakers">speakers:</form:label></td>
                <td><form:input path="speakers"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="cameras">cameras:</form:label></td>
                <td><form:input path="cameras"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="flash">flash:</form:label></td>
                <td><form:input path="flash"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="display">display:</form:label></td>
                <td><form:input path="display"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="face_id">face id / touch id:</form:label></td>
                <td><form:input path="face_id"></form:input></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit"/></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>