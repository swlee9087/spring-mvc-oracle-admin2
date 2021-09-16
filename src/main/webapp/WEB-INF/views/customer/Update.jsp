<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctx" value="<%=application.getContextPath()%>"/>
<jsp:include page="../common/head.jsp"/>
<body>
<h2>Customer Update</h2>
<form action="${ctx}/customers/update" method="post">
  <div class="container">
  	<label for="custId"><b>customer id</b></label>
    <input type="text" placeholder="Enter ID" name="custId" required>
    
    <label for="custName"><b>customer name</b></label>
    <input type="text" placeholder="Enter Username" name="custName" required>

    <label for="address"><b>address</b></label>
    <input type="text" placeholder="Enter Address" name="address" required>
        
    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>     
        
    <button type="submit">Update</button>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <a href="${ctx}/move/home/intro"><button type="button" class="cancelbtn">Cancel</button></a>
  </div>
</form>

</body>
</html>