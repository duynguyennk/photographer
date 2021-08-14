<%-- 
    Document   : Contact
    Created on : Jun 4, 2021, 1:06:02 PM
    Author     : drako
--%>

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
                            <div class="contact">
                                <h1>Contact</h1><br>
                                <h2>
                                    PHOTOGRAPHER
                                </h2>
                                <br/>
                                <p>
                                    Address: ${contact.address}
                                </p>
                                <p>
                                    City: ${contact.city}
                                </p>
                                <p>
                                    Country: ${contact.country}
                                </p>
                                <br/>
                                <p>
                                    Tel: ${contact.telephone}
                                </p>
                                <p>
                                    Email: ${contact.email}
                                </p>
                                <div class="map">
                                    <iframe src="${contact.mapUrl}" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                                </div>
                            </div>
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
