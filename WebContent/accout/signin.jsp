<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册 您的账户</title>
</head>
<body>
	<form action="signin" autocomplete="off" method="post">
		<div style="border: 1px #ffffss blue; background: #99aaaa;">
			<h1>
				帐号：<input type="text" name="sign_in_id" />
			</h1>
			<h1>
				密码：<input type="text" name="sign_in_password" />
			</h1>
			
			<h1>
				性别：
				男<input type="radio" name="sign_in_sex" value="man"/>
				 女<input type="radio" name="sign_in_sex" value="woman"/>
			</h1>
			<h1>
				毕业学校：<input type="text" name="sign_in_school" />
			</h1>
			
			<input type="submit" value="注册" /> 
			<input type="reset" value="清空" />
	</form>

	</div>
</body>
</html>