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
function baocun(){
	var flag=$("#fmLogin").form("validate");
	if(flag){
		$.ajax({
			type:"post",
			url:"",
			data:{
				:$("#").val(),
				:$("#").val(),
				:$("#").val()
			},
			datatype:"json",
			
		})	
	}
	/* if(flag){
		$.post(globalDate.server+"login",{
			un:un,
			pwd:pwd,
			token:globalDate.myToken
		},function(res){
			if(res.success){
				var obj = eval("("+res.message+")");
				globalDate.setUserInfo(obj.uid,$("#un").val(),obj.roleNames);
				window.sessionStorage.setItem("roleNames",obj.roleNames);
				window.sessionStorage.setItem("loginName",un);
				window.sessionStorage.setItem("uid",obj.uid)
				window.location.href="rw7.html";
			}else{
				$.messager.alert("出错啦",res.message,"error");
			}
		},"json");
	}else{
		$.messager.alert("验证","请完善数据","info");
	} */
}

/* 验证码刷新 */
 function changeCode() {  //刷新
	var data=new Date().getTime();
	
	$("#kaptcha").val("");
    $('#kaptchaImage').click().attr('src', 'KaptchaServlet?tt='+data);  
}

</script>
<body>
<center style="margin-top: 150px;">
	<div id="" class="easyui-panel" data-options="title:'登录页面'" style="width: 400px;height: 300px;">
		<form id="fmLogin" method="post">
			<input type="hidden" name="token" id="token" value="" />
			<table style="padding: 30px;" cellpadding="10">
				<tr>
					<td>用户名：</td>
					<td>
						<input name="un" id="un" class="easyui-textbox" required="required"/>
					</td>
				</tr>
				<tr style="padding: 20px;">
					<td>密码：</td>
					<td>
						<input name="pwd" id="pwd" class="easyui-textbox" required="required"/>
					</td>
				</tr>
				<tr style="padding: 20px;">
					<td>验证码：</td>
					<td>
						<input name="j_code" type="text" id="kaptcha" maxlength="4" class="easyui-textbox" required="required" style="width:60px"/>
						<img src="KaptchaServlet"  id="kaptchaImage" style="height:30px;"/>
   						<a href="javascript:changeCode()">看不清?换一张</a>
					</td>
				</tr>
				<tr style="padding: 20px;">
					<td></td>
					<td>
						<a id="btnLogin" href="javascript:void(0)" class="easyui-linkbutton" onclick="baocun()">登录</a>  
					</td>
				</tr>
			</table>
		</form>
	</div>
</center>	
</body>
</html>