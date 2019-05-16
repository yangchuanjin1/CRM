<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>密码找回</title>
<script type="text/javascript" src="jquery-easyui-1.4.3/global.js"></script>
</head>
<body>
<div class="easyui-panel" title="密码找回" style="width: 250px;height: 150px;">
	<form class="easyui-form" id="deng-panel-form">
		<table>
			<tr>
				<td>请输入手机密保：</td>
				<td><input type="text" class="easyui-textbox" id="LoginName" /></td>
			</tr>
			<tr>
				<td>请输入邮箱密保：</td>
				<td><input type="password" class="easyui-textbox" id="Password" /></td>
			</tr>
		</table>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="denglu()">提交</a>
	</form>
</div>
</body>
</html>