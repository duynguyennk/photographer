<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                            <h1>Gallery ${galleryID}</h1>

                            <div class="slide-show">
                                <img id="imageShow" src="image/${mainImage.image}"/>
                                <div class="play-button">
                                    <img id="playButton" src="image/icon_play.png" style="width:64px;" onclick="slideImage()"/>
                                </div>
                            </div>

                            <div class="photo-list">
                                <c:forEach var="o" items="${listImagePaging}">
                                    <div class="photo-item" onclick="updateImage('image/${o.image}')">
                                        <img src="image/${o.image}" class="imageThumb"/>
                                    </div>
                                </c:forEach>
                            </div>
                            <div class="paging">
                                <c:if test="${lastPage > 1}">
                                    <c:forEach begin="1" end="${lastPage}" var="i">
                                        <a class="${i==index?"active":""}" href="gallery?index=${i}&galleryID=${galleryID}">${i}</a>
                                    </c:forEach>
                                </c:if>
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
    <script src="js/gallery.js" type="text/javascript"></script>
</html>
