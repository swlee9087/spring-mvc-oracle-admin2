<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%=application.getContextPath()%>"/>
<jsp:include page="../common/head.jsp"/>
<body>
<h2>Book Detail</h2>

<form action="${ctx}/book/find" method="get">
  <div class="container">
  	<label for="bookId"><b>book id</b></label>
    <input type="text" placeholder="Enter book ID" name="bookId" required>
           
    <button type="submit">Submit</button>
  </div>
  <div class="container" style="background-color:#f1f1f1">
    <a href="${ctx}/move/home/intro"><button type="button" class="cancelbtn">Cancel</button></a>
  </div>
</form>
</body>
</html>