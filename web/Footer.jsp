<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<footer>
    <div class="footer-text">
        <div class="footer-inner">
            <a href="#">
                Created with SimpleSite
            </a>
            <c:forEach items="${sessionScope.totalViewers}" var="i">
                <span class="footer-page-counter-item">${i}</span>
            </c:forEach>
        </div>
    </div>
</footer>