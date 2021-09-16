<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%=application.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BookStore with eGovEclipse</title>
</head>
<body>
<h1>@09151600 - server linking left</h1> 
<div>
<ol>
<li><a href="${ctx}/move/customer/Register">Customer Register</a></li>
<li><a href="${ctx}/move/customer/Detail">Customer detail</a></li>
<li><a href="${ctx}/move/customer/List">Customer list</a></li>
<li><a href="${ctx}/move/customer/Update">Customer update</a></li></ol>
<ol>
<li><a href="${ctx}/move/book/Register">book Register</a></li>
<li><a href="${ctx}/move/book/Detail">book detail</a></li>
<li><a href="${ctx}/move/book/List">book list</a></li>
<li><a href="${ctx}/move/book/Update">book update</a></li></ol>
<ol>
<li><a href="${ctx}/move/publisher/Register">pub Register</a></li>
<li><a href="${ctx}/move/publisher/Detail">pub detail</a></li>
<li><a href="${ctx}/move/publisher/List">pub list</a></li>
<li><a href="${ctx}/move/publisher/Update">pub update</a></li></ol>
<ol>
<li><a href="${ctx}/move/order/Register">order Register</a></li>
<li><a href="${ctx}/move/order/Detail">order detail</a></li>
<li><a href="${ctx}/move/order/List">order list</a></li>
<li><a href="${ctx}/move/order/Update">order update</a></li></ol>

</div>
</body>
</html>