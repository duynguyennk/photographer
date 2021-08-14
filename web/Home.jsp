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
                        <!-- Page Left-->
                        <div class="content-left">
                            <div class="image-intro">
                                <img src="image/${contact.imgMain}" class="image-intro"/>
                                <!-- Intro Text -->           
                                <p class="intro-description">
                                    The quick brown fox jumps over the lazy dog
                                </p>    
                            </div>
                            <div class="gallery">
                                <c:forEach items="${listGalleryPaging}" var="o">
                                    <div class="gallery-item">
                                        <img src="image/${o.image}"/>  
                                        <p>
                                            <a href="gallery?galleryID=${o.id}">
                                                View ${o.name}
                                            </a>
                                        </p>           
                                        <p class="gallery-description">
                                            ${o.description}
                                        </p>
                                    </div>
                                </c:forEach>
                            </div>
                            <div class="paging">
                                <c:if test="${lastPage > 1}">
                                    <c:forEach begin="1" end="${lastPage}" var="i">
                                        <a class="${i==index?"active":""}" href="home?index=${i}">${i}</a>
                                    </c:forEach>
                                </c:if>
                            </div>


                            <div class="about-me">
                                <h1 class="main-color">
                                    About me
                                </h1>
                                <p class="about-me-description">
                                 ${contact.about}    
                                </p>
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
