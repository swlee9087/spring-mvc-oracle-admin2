<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="ctx" value="<%=application.getContextPath()%>"/>
<jsp:include page="../common/head.jsp"/>
<body>
<h2>Login Form</h2>
<form action="${ctx}/customers" method="post">
  <div class="container">
    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter /" name="custId" required>

    <label for="phone"><b>phone</b></label>
    <input type="text" placeholder="Enter /" name="phone" required>
        
    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <a href="${ctx}/move/home/intro"><button type="button" class="cancelbtn">Cancel</button></a>
    <!-- <span class="psw">Forgot <a href="#">password?</a></span> -->
  </div>
</form>

</body>
</html>