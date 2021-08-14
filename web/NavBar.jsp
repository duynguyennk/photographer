<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    <ul>
        <li>
            <a href="home">My front page</a>
        </li>
        <c:forEach items="${listGallery}" var="o" begin="0" end="2" step="1">
            <li>
            <a href="gallery?galleryID=${o.id}">${o.name}</a>
        </li>
        </c:forEach>
        <li>
            <a href="contact">Contact</a>
        </li>
    </ul>
</nav>