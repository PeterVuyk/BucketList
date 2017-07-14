<%@include file="header.jsp"%>
<section>
	<h2>Add an item to the bucket list</h2>
	<p>Traveling, adventure, fun, connecting nature, chase a tornado? Don't consider and
		add it to the bucket list</p>

	<form action="${pageContext.request.contextPath}/SaveActivityServlet" method="post">
		<input type="text" name="activity-item" placeholder="Activity" required>
		<input type="submit" value="Add event">
	</form>
</section>
<%@include file="footer.jsp"%>