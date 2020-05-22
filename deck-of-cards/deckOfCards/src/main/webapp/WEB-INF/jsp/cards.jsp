<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/header.jsp">
	   
	</c:import>

	<a href="shuffle" class="button">Shuffle Deck</a>
	<div id="grid" class="main-content">
	<c:forEach var="card" items="${cardList}">
		<div id="myCard" class="card hidden">
			<div id="cardImg" class="cardImg">
					<c:url var="imgCard" value="/img/${card.suit}.PNG"/>
					<img src="${imgCard}" />
			</div>
			<div class="content is-size-1">
				${card.value}
			</div>
		</div>
	</c:forEach>
	</div>
		
		
</html>