<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctx" value="<%=application.getContextPath()%>"/>
<jsp:include page="../common/head.jsp"/>
<body>
<h2>Order Update</h2>

<form action="${contextPath}/orders" method="post">

  <div class="container">
  	<label for="orderId"><b>order id</b></label>
    <input type="text" placeholder="Enter order ID" name="orderId" required>
    
    <label for="custId"><b>customer ID</b></label>
    <input type="text" placeholder="Enter customer ID" name="custId" required>
    
    <label for="bookId"><b>book ID</b></label>
    <input type="text" placeholder="Enter book ID" name="bookId" required>

    <label for="orderPrice"><b>order price</b></label>
    <input type="text" placeholder="Enter ORDER price" name="orderPrice" required>
        
    <label for="orderDate"><b>order date</b></label>
    <input type="text" placeholder="Enter order date" name="orderDate" required>     
        
    <button type="submit">Submit</button>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <a href="${ctx}/move/home/intro"><button type="button" class="cancelbtn">Cancel</button></a>
  </div>
</form>
</body>
</html>