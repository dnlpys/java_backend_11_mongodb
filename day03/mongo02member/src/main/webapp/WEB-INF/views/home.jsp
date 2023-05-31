<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<script type="text/javascript">
	let txt = `[{"_id":{"timestamp":1685424477,"machineIdentifier":1066722,"processIdentifier":3271,"counter":757140,"date":1685424477000,"time":1685424477000,"timeSecond":1685424477},"num":6,"id":"admin6","pw":"hi1116","name":"kim6","tel":"016"},{"_id":{"timestamp":1685424477,"machineIdentifier":1066722,"processIdentifier":3271,"counter":757139,"date":1685424477000,"time":1685424477000,"timeSecond":1685424477},"num":5,"id":"admin5","pw":"hi1115","name":"kim5","tel":"015"},{"_id":{"timestamp":1685424477,"machineIdentifier":1066722,"processIdentifier":3271,"counter":757138,"date":1685424477000,"time":1685424477000,"timeSecond":1685424477},"num":4,"id":"admin4","pw":"hi1114","name":"kim4","tel":"014"},{"_id":{"timestamp":1685424477,"machineIdentifier":1066722,"processIdentifier":3271,"counter":757137,"date":1685424477000,"time":1685424477000,"timeSecond":1685424477},"num":3,"id":"admin3","pw":"hi1113","name":"kim3","tel":"013"}]`;
	console.log(txt);
	console.log(JSON.parse(txt));
	console.log(JSON.parse(txt)[0]._id.time);
	console.log(new Date(JSON.parse(txt)[0]._id.time));
	console.log(new Date(JSON.parse(txt)[0]._id.time).toLocaleString());
	console.log(new Date(JSON.parse(txt)[0]._id.time).toLocaleDateString());
	console.log(new Date(JSON.parse(txt)[0]._id.time).toISOString());

</script>
</head>
<body>
	<h1>Hello world!</h1>
	<hr>
	<a href="findAll.do">findAll.do</a>
	<a href="findAll2.do?page=1&limit=3">1 findAll.do : skip , limit</a>
	<a href="findAll2.do?page=2&limit=3">2 findAll.do : skip , limit</a>
	<hr>
	<a href="searchList.do?searchKey=name&searchWord=im">searchList.do : name</a>
	<a href="searchList.do?searchKey=tel&searchWord=7">searchList.do : tel</a>
	<a href="searchList2.do?num1=3&num2=6">searchList2.do : Filters.and,or,in</a>
	<a href="searchList3.do?num1=3&num2=6">searchList3.do : Document</a>
	<hr>
	<a href="findOne.do?num=1">findOne.do : num</a>
	<a href="findOne.do?mid=6475895d1046e20cc70b8d8f">findOne.do : mid</a>
	<hr>
	<a href="insertOK.do?num=7&id=tester7&pw=hi77&name=han7&tel=077">insertOK.do</a>
	<a href="updateOK.do?num=8&id=tester888&pw=hi8888&name=han8888&tel=08888">updateOK.do</a>
	
</body>
</html>
