<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}
input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}
button:hover {
  opacity: 0.8;
}
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}
img.avatar {
  width: 40%;
  border-radius: 50%;
}
.container {
  padding: 16px;
}
span.psw {
  float: right;
  padding-top: 16px;
}
/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
</head>
<body>

<h2>New Order Form</h2>

<form action="${contextPath}/book/new" method="get">


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
    <!-- <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label> -->
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <!-- <span class="psw">Forgot <a href="#">password?</a></span> -->
  </div>
</form>

</body>
</html>