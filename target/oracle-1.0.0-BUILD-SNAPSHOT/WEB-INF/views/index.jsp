<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello Spring MVC 시작이다 !</h1> 

<div><fieldset><legend><h4>/books  -> shows list in console. </h4></legend><table>
<ul>	<li>/books/bookId/{bookId}</li>
		<li>/books/pubId/{pubId}</li>
		<li>/books/bookTitle/{bookTitle}</li>
		<li>/books/price/{price}</li>
</ul></table></fieldset></div>
<div><fieldset><legend><h4>/customers  -> shows list in console. </h4></legend><table>
<ul>
		<li>/customers  -> shows list in console. </li>		
</ul></table></fieldset></div>
<div><fieldset><legend><h4>/orders  -> shows list in console. </h4></legend><table>
<ul>
		<li>/orders  -> shows list in console. </li>
		<li>ordermapper.xml not finished @0910PM17</li>
</ul></table></fieldset></div>
<div><fieldset><legend><h4>/publishers  -> shows list in console. </h4></legend><table>
<ul>
		<li><a href="./publishers">/publishers</a>  -> shows list in console. </li>		
</ul></table></fieldset></div>
<div><fieldset><legend><h4>join + login </h4></legend><table>
<ul>
		<li><a href="./joinform">/join form</a></li>
		<li><a href="./loginform">/login form</a></li>		
		<li><a href="./updateform">/update form</a></li>
		<li><a href="./detailform">/detail form</a></li>
</ul></table></fieldset></div>
<div><fieldset><legend><h4>new book </h4></legend><table>
<ul>
		<li><a href="./newbook">/newbook</a></li>		
</ul></table></fieldset></div>
<div><fieldset><legend><h4>new order </h4></legend><table>
<ul>
		<li><a href="./neworder">/neworder</a></li>		
</ul></table></fieldset></div>
<div><fieldset><legend><h4>new publisher </h4></legend><table>
<ul>
		<li><a href="./newpublisher">/newpublisher</a></li>		
</ul></table></fieldset></div>
</body>
</html>