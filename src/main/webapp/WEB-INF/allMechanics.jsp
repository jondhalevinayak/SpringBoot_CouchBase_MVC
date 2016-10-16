<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/bootstrap-theme.min.css">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
</head>
<body>

<div class="example">
    <div class="container">

        <nav role="navigation">
            <div class="alert alert-info">
                <center><h1>UPS Mechanics</h1></center>
            </div>
            <div class='col-xs-12 col-sm-12 col-md-12 col-lg-12' >


                <c:forEach var="mechanic" items="${mechanicList}">
                <li>${mechanic.mechanicName}</li>
                </c:forEach>

            </div>
            </br></br></br></br>


        </nav>



    </div>
</div>
</body>
</html>