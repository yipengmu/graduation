<!DOCTYPE html>
<%@page import="org.apache.struts2.components.Include"%>
<html>
<head>
<style type="text/css">
.white_section {
	border: 1px #360 solid;
}

white_38 {
	color: white;
	font-size: 38pt;
}

white_18 {
	color: white;
	font-size: 18pt;
}

white_12 {
	color: white;
	font-size: 12pt;
}

body {
	background: #ffffff;
	color: #111111;
	font-family: Georgia, "Times New Roman", Times, serif;
	padding: 20px;
}

</style>

<script type="text/javascript">

function doSignin() {
	window.location.href = "/StructsHello/accout/signin.jsp";
}

</script>
<meta charset="UTF-8">
<title>China one</title>
</head>
<body style="background: #0d8919">
	<white_38>中国 好毕业</white_38> &nbsp; <white_12>分享你的毕业故事。。</white_12>
	<hr style="width: 100%; height: 4px; background: #ffffff"/>
	<div style="background: #c9dd23;">

		<form action="login" method="post" autocomplete="off">
			<div style="border: 1px solid #ffeeff;">
				<white_18>帐号:</white_18>
				<input type="text" name="uid" placeholder="Username" ></input><br />
			</div>
			<div style="border: 1px solid #ffeeff;">
				<white_18>密码:</white_18>
				<input type="password" name="upassword" placeholder="Password" ></input><br />
			</div>
			<div style="margin-top: 30px; text-align: left; ">
				<input type="submit" value="登录"></input>
				<input type="button" value="注册" onclick="doSignin()"></input>
			</div>
		</form>

	</div>
	<br>
<white_12><jsp:include page="readme.txt"></jsp:include></white_12>
</body>
</html>