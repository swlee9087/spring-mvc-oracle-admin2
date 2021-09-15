<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>
<h2>Pub List</h2>

<form action="${contextPath}/publishers" method="get">
  <div class="container">
    <h1>There should be a table list here. but eff it. </h1>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="exitbtn">Bye!</button>
  </div>
</form>
</body>
</html>