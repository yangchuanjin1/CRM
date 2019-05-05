<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册页面</title>
<script type="text/javascript" src="jquery-easyui-1.4.3/global.js"></script>
</head>
<body>
<div class="easyui-panel" title="注册界面" style="width: 250px;height: 150px;">
	<form class="easyui-form" id="deng-panel-form">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" class="easyui-textbox" id="LoginName" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" class="easyui-textbox" id="Password" /></td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input type="password" class="easyui-textbox" id="Password" /></td>
			</tr>
		</table>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="denglu()">登录</a>
		<a href="">免费注册</a>
	</form>
</div>
</body>
</html>