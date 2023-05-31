<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<hr>
	<a href="findAll.do">findAll.do</a>
	<hr>
	<a href="searchList.do?searchKey=name&searchWord=im">searchList.do : name</a>
	<a href="searchList.do?searchKey=tel&searchWord=7">searchList.do : tel</a>
	<a href="searchList2.do?num1=3&num2=6">searchList2.do : Filters.and,or,in</a>
	<hr>
	<a href="findOne.do?num=1">findOne.do : num</a>
	<a href="findOne.do?mid=6475895d1046e20cc70b8d8f">findOne.do : mid</a>
	<hr>
	<a href="insertOK.do?num=7&id=tester7&pw=hi77&name=han7&tel=077">insertOK.do</a>
	
</body>
</html>
