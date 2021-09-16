<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctx" value="<%=application.getContextPath()%>"/>
<jsp:include page="../common/head.jsp"/>
<body>
<h2>Add Pub</h2>

<form action="${contextPath}/publishers" method="get">
    <div class="container">
  	<label for="pubId"><b>publisher id</b></label>
    <input type="text" placeholder="Enter publisher ID" name="pubId" required>
    
    <label for="pubName"><b>publisher name</b></label>
    <input type="text" placeholder="Enter publisher name" name="pubName" required>
    
    <label for="mgrName"><b>manager name</b></label>
    <input type="text" placeholder="Enter manager name" name="mgrName" required>

    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
        
    <button type="submit">Submit</button>
  </div>
  <div class="container" style="background-color:#f1f1f1">
    <a href="${ctx}/move/home/intro"><button type="button" class="cancelbtn">Cancel</button></a>
    </div></form>
</body>
</html>