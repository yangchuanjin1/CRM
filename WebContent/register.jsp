<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>密码找回</title>
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<script type="text/javascript">
	function denglu(){
		$.ajax({
			type : "post",//提交方式
			url : "",//提交路径
			datatype : "json",//格式
			data : {//传递的参数
				Staff_Name:$("#Staff_Name").val(),
				Staff_ProtectEmail:$("#Staff_ProtectEmail").val(),
				Staff_ProtecMtel:$("#Staff_ProtecMtel").val()
			},success:function(res){
				if (res > 0) {//判断回调的，受影响的行数是否大于零
					$("#tab").datagrid("reload");//刷新表格
					$.messager.alert('提示', '锁定成功');//提示信息
				}
			}
			
		})
	}
</script>
<body>
<div class="easyui-panel" title="密码找回" style="width: 250px;height: 150px;">
	<form class="easyui-form" id="deng-panel-form">
		<table>
			<tr>
				<td>请输入要找回的用户名：</td>
				<td><input type="text" class="easyui-textbox" id="Staff_Name" /></td>
			</tr>
			<tr>
				<td>请输入手机密保：</td>
				<td><input type="text" class="easyui-textbox" id="Staff_ProtecMtel" /></td>
			</tr>
			<tr>
				<td>请输入邮箱密保：</td>
				<td><input type="password" class="easyui-textbox" id="Staff_ProtectEmail" /></td>
			</tr>
		</table>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="denglu()">提交</a>
	</form>
</div>
</body>
</html>