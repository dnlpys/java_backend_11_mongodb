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

	<a href="findAll.do">findAll.do</a>
	0.MongoConfig >> create @Bean 등록 >> multi >> member
	1.MemberVO >> 롬복처리
	2.MemberDAO(인터페이스) >> findAll()
	3.@Repository >> MemberDAOimpl(MemberDAO상속) >>오버라이딩 >>  @Autowired >> member
	5.@Service >> MemberService >>  @Autowired >> MemberDAO
	6.@Controller >>MemberRestController >>  
		@Autowired >> MemberService >> @ResponseBody >> View
</body>
</html>
