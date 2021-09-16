<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%=application.getContextPath()%>"/>
<jsp:include page="../common/head.jsp"/>

<body>
<h2>Book List</h2>
<form action="${ctx}/books">
  <div class="container">
    <h1>There should be a table list here. but eff it. </h1>
    <a href="${ctx}/move/book/Register">register books</a>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <a href="${ctx}/move/home/intro"><button type="button" class="cancelbtn">Main Page</button></a>
  </div>
</form>
</body>
</html>