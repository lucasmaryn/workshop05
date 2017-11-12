<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><p>
<c:forEach items="${books}" var="item">
    ${item.id}, ${item.title}<br>
</c:forEach>
</p>