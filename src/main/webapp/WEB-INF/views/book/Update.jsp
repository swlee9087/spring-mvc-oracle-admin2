<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>
<body>
<h2>Book Update</h2>

<form action="${contextPath}/books" method="post">
<div class="container">
  	<label for="bookId"><b>book id</b></label>
    <input type="text" placeholder="Enter book ID" name="bookId" required>
    
    <label for="bookTitle"><b>book title</b></label>
    <input type="text" placeholder="Enter Book Title" name="bookTitle" required>

    <label for="price"><b>price</b></label>
    <input type="text" placeholder="Enter price" name="price" required>
        
    <label for="pubId"><b>publisher ID</b></label>
    <input type="text" placeholder="Enter publisher id" name="pubId" required>     
        
    <button type="submit">Submit</button>
  </div>
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button> 
  </div>
</form>
</body>
</html>