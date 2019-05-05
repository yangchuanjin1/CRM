<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
<script type="text/javascript" src="jquery-easyui-1.4.3/global.js"></script>
<style type="text/css">
	body{
		background:url("jquery-easyui-1.4.3/img/timg.gif") no-repeat;
		background-size: 100% 100%;
		
	}
</style>
<script type="text/javascript">
function denglu(){
	if($("#denglu").form("validate")){
		$.ajax({
			type:"post",
			url:"loginUsers",
			datatype:"json",
			data:{
				"LoginName":$("#LoginName").val(),
				"Passwords":$("#Password").val()
			},
			success:function(res){
				if(res.success){
					var obj=JSON.parse(res.message);
					$.message.alert("提示","登陆成功");
					globalData.setUserInfo(obj.UsersID,$("#LoginName").val(),obj.roles.RolesName);
				}else{
					$.message.alert("提示","登陆失败");
				}
			}
		})
	}
}
</script>
</head>
<body>
<div class="easyui-panel" title="登录界面" style="width: 250px;height: 150px;">
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
		</table>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="denglu()">登录</a>
		<a href="register.jsp">免费注册</a>
	</form>
</div>
</body>
</html>