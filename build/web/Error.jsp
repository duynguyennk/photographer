<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="site-full">
            <%@include file="NavBar.jsp" %>
            <%@include file="Header.jsp" %>
            <div class="site-wrap">
                <div class="container">
                    <div class="content">
                        <div class="content-left">
                            <h1>${error}</h1>
                            <h2>${errorDetail}</h2>
                        </div>
                        <div class="content-right">
                            <%@include file="RightBar.jsp" %>
                        </div>
                    </div>
                </div>
            </div>
            <%@include file="Footer.jsp" %>
        </div>
    </body>
</html>
