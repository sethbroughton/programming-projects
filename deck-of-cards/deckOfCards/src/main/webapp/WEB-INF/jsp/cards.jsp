<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
	   
	</c:import>

	<h1>Hello, <c:out value="${param.name}" />!</h1>

	<c:forEach var="card" items="${cardList}">
		<div class="card" style="width:50px">
			<div class="card-image">
					<c:url var="imgCard" value="/img/${card.suit}.PNG"/>
					<img src="${imgCard}" />
			</div>
			<div class="card-content">
				${card.value}
			</div>
		</div>
	</c:forEach>
		
		
</html>