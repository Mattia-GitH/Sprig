
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
    <a href="/create_test">Add Test</a>
    <h1>Phones List</h1>
    <table border="1" cellpadding="10">
        <thead>
        <tr>
            <th>IMEI</th>
            <th>Wi-Fi</th>
            <th>Bluetooth</th>
            <th>GPS</th>
            <th>Battery</th>
            <th>Proximity Sensor</th>
            <th>Vibrations</th>
            <th>Buttons</th>
            <th>Microphones</th>
            <th>Speakers</th>
            <th>Cameras</th>
            <th>Flash</th>
            <th>Display</th>
            <th>Face ID / Touch ID</th>
            <th>Date</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${testList}" var="test">
            <fmt:formatDate value="${test.date}" var="formattedDate"
                            type="date" pattern="MM-dd-yyyy" />
            <tr>
                <td>${test.imei}</td>
                <td>${test.wifi}</td>
                <td>${test.bluetooth}</td>
                <td>${test.gps}</td>
                <td>${test.battery}</td>
                <td>${test.proximity_sensor}</td>
                <td>${test.vibrations}</td>
                <td>${test.buttons}</td>
                <td>${test.microphones}</td>
                <td>${test.speakers}</td>
                <td>${test.cameras}</td>
                <td>${test.flash}</td>
                <td>${test.display}</td>
                <td>${test.face_id}</td>
                <td>${formattedDate}</td>

                <td><a href="<c:url value='test/edit/${test.imei}' />">Edit</a></td>
                <td><a href="/test/delete/${test.imei}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>