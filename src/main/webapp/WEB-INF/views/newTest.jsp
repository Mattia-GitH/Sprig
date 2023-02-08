<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <link href="/style.css" rel="stylesheet" type="text/css">

    <meta charset="utf-8"/>
    <title>New Comment</title>
</head>
<body>

    <div class="container">
        <div class="wrapper">
            <div class="tabs-wrapper">
                <span class="left scroller-btn"><</span>
                <ul id="scroller" class="nav nav-tabs">
                    <li class="active"><a data-toggle="tab" href="#home">Home</a></li>
                    <li><a data-toggle="tab" href="#menu1">Menu 1</a></li>
                    <li><a data-toggle="tab" href="#menu2">Menu 2</a></li>
                    <li><a data-toggle="tab" href="#menu3">Menu 3</a></li>
                    <li><a data-toggle="tab" href="#menu4">Menu 4</a></li>
                    <li><a data-toggle="tab" href="#menu5">Menu 5</a></li>
                    <li><a data-toggle="tab" href="#menu6">Menu 6</a></li>
                    <li><a data-toggle="tab" href="#menu7">Menu 7</a></li>
                    <li><a data-toggle="tab" href="#menu8">Menu 8</a></li>
                    <li><a data-toggle="tab" href="#menu9">Menu 9</a></li>
                    <li><a data-toggle="tab" href="#menu10">Menu 10</a></li>
                </ul>
                <span id="right" class="right scroller-btn">></span>
            </div>
            <div class="tab-content">
                <div id="home" class="tab-pane fade in active">
                    <h3>HOME</h3>
                    <p>Some content.</p>
                </div>
                <div id="menu1" class="tab-pane fade">
                    <h3>Menu 1</h3>
                    <p>Some content in menu 1.</p>
                </div>
                <div id="menu2" class="tab-pane fade">
                    <h3>Menu 2</h3>
                    <p>Some content in menu 2.</p>
                </div>
                <div id="menu3" class="tab-pane fade">
                    <h3>Menu 3</h3>
                    <p>Some content in menu 3.</p>
                </div>
                <div id="menu4" class="tab-pane fade">
                    <h3>Menu 4</h3>
                    <p>Some content in menu 4.</p>
                </div>
                <div id="menu5" class="tab-pane fade">
                    <h3>Menu 5</h3>
                    <p>Some content in menu 5.</p>
                </div>
                <div id="menu6" class="tab-pane fade">
                    <h3>Menu 6</h3>
                    <p>Some content in menu 6.</p>
                </div>
                <div id="menu7" class="tab-pane fade">
                    <h3>Menu 7</h3>
                    <p>Some content in menu 7.</p>
                </div>
                <div id="menu8" class="tab-pane fade">
                    <h3>Menu 8</h3>
                    <p>Some content in menu 8.</p>
                </div>
                <div id="menu9" class="tab-pane fade">
                    <h3>Menu 9</h3>
                    <p>Some content in menu 9.</p>
                </div>
                <div id="menu10" class="tab-pane fade">
                    <h3>Menu 10</h3>
                    <p>Some content in menu 10.</p>
                </div>
            </div>
        </div>
    </div>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script  src="/script.js"></script>
</body>
</html>