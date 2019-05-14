<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title>
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<script type="text/javascript">

var y;
function denglu(){
	$.post("loginStaff",{
		Staff_Name:$("#Staff_Name").val(),
		Staff_Password:$("#Staff_Password").val(),
		kaptcha:$("#kaptcha").val()
	},function(res){
		if(res.success){
			 window.location.href="index.jsp";
		}else{
			$.messager.alert('提示信息',res.message); 
			return;
		}
	},"json")
}

/* 验证码刷新 */
 function changeCode() {  //刷新
	var data=new Date().getTime();
	
	$("#kaptcha").val("");
    $('#kaptchaImage').click().attr('src', 'KaptchaServlet?tt='+data);  
}

</script>
<%
Cookie []cookies =request.getCookies();
	String username=null;
	String password=null;
	if(cookies!=null){
		//遍历Cookie
		for(Cookie cookie:cookies){
			 String cookieName=cookie.getName();
			 String cookieValue=cookie.getValue();
			if("username".equals(cookieName)){
				username=cookieValue;
			}else if("password".equals(cookieName)){
				password=cookieValue;
			}
		}
	}

%>
<body>
<center style="margin-top: 150px;">
	<div id="" class="easyui-panel" data-options="title:'登录页面'" style="width: 400px;height: 300px;">
		<form id="fmLogin" method="post">
			<input type="hidden" name="token" id="token" value="" />
			<table style="padding: 30px;" cellpadding="10">
				<tr>
					<td>用户名：</td>
					<td>
						<input name="Staff_Name" id="Staff_Name" class="easyui-textbox" required="required"/>
					</td>
				</tr>
				<tr style="padding: 20px;">
					<td>密码：</td>
					<td>
						<input name="Staff_Password" id="Staff_Password" class="easyui-textbox" required="required"/>
					</td>
				</tr>
				<tr style="padding: 20px;">
					<td>验证码：</td>
					<td>
						<input name="kaptcha" type="text" id="kaptcha"  maxlength="4" class="easyui-textbox" required="required" style="width:60px"/>
						<img src="KaptchaServlet"  id="kaptchaImage" style="height:30px;"/>
   						<a href="javascript:changeCode()">看不清?换一张</a>
					</td>
				</tr>
				<tr>
					<td>${mesg }</td>
				</tr>
				<tr style="padding: 20px;">
					<td><input name="yes" id="yes" type="checkbox" value="yes" /></td>
					<td>
						七天免登陆
					</td>
				</tr>
				<tr style="padding: 20px;">
					<td></td>
					<td>
						<!-- <td rowspan="1"><input type="submit" id="dl" value="登陆"/></td> -->
						<a id="btn" href="javascript:denglu()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">登录</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</center>	
</body>
</html>