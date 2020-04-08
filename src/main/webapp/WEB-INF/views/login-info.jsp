<%@ taglib prefix="spring"
	uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

	<table>
		<c:forEach items="${cust.dbDetails.keySet()}" var="e">
			<tr>
				<td>${e} - ${cust.dbDetails.get(e)}</td>

			</tr>
		</c:forEach>
	</table>

	<c:if test="${previous}">
		<a href="./getData?PageIndex=${curPage-1}">previous</a>
	</c:if>
	<c:if test="${next}">
		<a href="./getData?PageIndex=${curPage+1}">next</a>
	</c:if>
</body>

</html>