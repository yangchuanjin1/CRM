<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
   $(function(){  
	   init();
   });
   function init(){ 
	   $("#tab").datagrid({
		   url:'selectStaffCountYang',
		   method:"post",
		   pagination:true,
		   singleSelect:true ,
		   queryParams:{
			   staff_Name:$("#staff_Name").val(),
			   sstaff_CreatTime:$("#sstaff_CreatTime").datebox("getValue"),
			   estaff_CreatTime:$("#estaff_CreatTime").datebox("getValue"),
			   Staff_IsLockout:$("#staff_IsLockout").combobox("getValue"),
		   } 
	   });
   }
    /*格式化列  */
   function staff_IsLockout(value,row,index){
	   return row.staff_IsLockout==0?"否":"是";
   }
    function staffjuese(value,row,index){
    	return "<a href='javascript:shezhiStaff("+index+")'>设置</a>";
    }
    function staffCaozuo(value,row,index){
    	return "<a href='javascript:updateStaff("+index+")'>编辑</a> <a href='javascript:deleteStaff("+index+")'>删除</a>"
    }
    /* function staffCaozuomima(value,row,index){
    	return "<a href='javascript:chongzhimima("+index+")'>重置密码</a>";
    } */
    function staffCaozuoyonghu(value,row,index){
    	return "<a href='javascript:jiesuoStaff("+index+")'>解锁用户</a> <a href='javascript:suodingStaff("+index+")'>锁定用户</a>"
    }
   function insertStaff(){
	   $("#win").window("open");
   }
   function staffSave(){
	   $.post("selectStaffNamrYang",{
		   Staff_Name:$("#staff_Name1").val()
	   },function(res){
		   if(res>0){
			   $.messager.alert('提示', '用户名已存在');
		   }
		   else{
			   $.post("insertStaffYang",{
				   staff_Name:$("#staff_Name1").val(),
				   staff_Password:$("#staff_Password1").val()
			   },function(res){
				   if(res>0){
					   $("#tab").datagrid("reload");
					   $("#win").window("close");
					   $.messager.alert('提示', '添加成功');
				   }
			   },"json");
		   }
	   },"json");
   }
   function deleteStaff(index){
	   $.messager.confirm('确认','您确认想要删除记录吗？',function(
	r) {
			var data = $("#tab").datagrid("getData");
			var row = data.rows[index];
			if (r) {
				$.ajax({
					type : "post",//提交方式
					url : "",//提交路径
					datatype : "json",//格式
					data : {//传递的参数
						Staff_ID : row.staff_ID
					},
					success : function(res) {//回调
						if (res > 0) {//判断回调的，受影响的行数是否大于零
							$("#tab").datagrid("reload");//刷新表格
							$.messager.alert('提示', '删除成功');//提示信息
						}
					}
				})
			}
		});
	}
	/* 修改 */
	function updateStaff(index) {
		var data = $("#tab").datagrid("getData");
		var row = data.rows[index];
		$("#updateRolesForm").form("load", row);
		$("#updateRoles-window").window("open");
	}
	/* 修改提交操作 */
	function submitJsFrom() {
		var flag = $("#updateRolesForm").form("validate");
		var name = $("#update-staff_Name").val();
		var id = $("#update-staff_ID").val();
		if (flag) {
			$.post('updateStaffYang', {
				Staff_ID : id,
				Staff_Name : name
			}, function(res) {
				if (res > 0) {
					$.messager.alert('提示', '修改成功');
					$("#updateRoles-window").window("close");
					$("#tab").datagrid("reload");
				}
			}, "json");
		}
	}

	/* 解锁用户 */
	function jiesuoStaff(index) {
		var data = $("#tab").datagrid("getData");
		var row = data.rows[index];
		if (row.staff_IsLockout != 0) {
			$.messager.confirm('确认', '您确认想要解锁此用户吗？', function(r) {
				if (r) {
					$.ajax({
						type : "post",//提交方式
						url : "updateStaffJieYang",//提交路径
						datatype : "json",//格式
						data : {//传递的参数
							staffId : row.staff_ID
						},
						success : function(res) {//回调
							if (res > 0) {//判断回调的，受影响的行数是否大于零
								$("#tab").datagrid("reload");//刷新表格
								$.messager.alert('提示', '解锁成功');//提示信息
							}
						}
					})
				}
			});
		} else {
			$.messager.alert('提示', '此用户为被锁定');
		}
	}
	/* 锁定用户 */
	function suodingStaff(index) {
		var data = $("#tab").datagrid("getData");
		var row = data.rows[index];
		if (row.staff_IsLockout != 1) {
			$.messager.confirm('确认', '您确认想要锁定此用户吗？', function(r) {
				if (r) {
					$.ajax({
						type : "post",//提交方式
						url : "updateStaffSuoYang",//提交路径
						datatype : "json",//格式
						data : {//传递的参数
							staffId : row.staff_ID
						},
						success : function(res) {//回调
							if (res > 0) {//判断回调的，受影响的行数是否大于零
								$("#tab").datagrid("reload");//刷新表格
								$.messager.alert('提示', '锁定成功');//提示信息
							}
						}
					})
				}
			});
		} else {
			$.messager.alert('提示', '此用户已被锁定');
		}
	}
	/* 设置权限 */
	function shezhiStaff(index) {
		var data = $("#tab").datagrid("getData");
		var row = data.rows[index];
		/* $("#she-staff_ID").value(row.staff_ID); */
		document.getElementById("she-staff_ID").value = row.staff_ID;
		$("#roles-window").window({
			closed : false,
			title : "您正在设置" + row.staff_Name
		});
		$("#roles-window").window("open");
		$("#syyh").datagrid({
			url : 'selectStaffRolesYang'
		});
		$("#dqyh").datagrid({
			url : 'selectStaffRolesIdYang',
			queryParams : {
				StaffId : row.staff_ID
			}
		});
	}
	function tianjia() {
		var row = $("#syyh").datagrid("getSelected");
		$.post('insertStaffRolesAddYang', {
			SR_StaffID : $("#she-staff_ID").val(),
			SR_RolesID : row.rolesId
		}, function(res) {
			if (res > 0) {
				$("#syyh").datagrid("load");
				$("#dqyh").datagrid("load");
			}
		}, "json");
	}
	function yichu() {
		var row = $("#dqyh").datagrid("getSelected");
		$.post('deleteStaffRolesDelYang', {
			SR_StaffID : $("#she-staff_ID").val(),
			SR_RolesID : row.rolesId
		}, function(res) {
			if (res > 0) {
				$("#dqyh").datagrid("load");
				$("#syyh").datagrid("load");
			}
		}, "json");
	}
</script>
</head>
<body>
	<table class="easyui-datagrid" id="tab"
		data-options="fitColumns:true,singleSelect:true,toolbar:'#r'">
		<thead>
			<tr>
				<th data-options="field:'staff_ID'">编号</th>
				<th data-options="field:'staff_Name'">姓名</th>
				<th data-options="field:'staff_IsLockout',formatter:staff_IsLockout">是否锁定</th>
				<th data-options="field:'staff_Time'">最后一次登录时间</th>
				<th data-options="field:'staff_CreatTime'">账户创建时间</th>
				<th data-options="field:'staff_PsdWrong'">密码错误次数</th>
				<th data-options="field:'staff_LockTime'">被锁定的时间</th>
				<th data-options="field:'staff_ProtectEmail'">密保邮箱</th>
				<th data-options="field:'staff_ProtecMtel'">密保手机号</th>
				<th data-options="field:'staffjuese',formatter:staffjuese">角色</th>
				<th data-options="field:'staffCaozuo',formatter:staffCaozuo">操作</th>
				<!-- <th data-options="field:'staffCaozuomima',formatter:staffCaozuomima">操作</th>   -->
				<th
					data-options="field:'staffCaozuoyonghu',formatter:staffCaozuoyonghu">操作用户</th>
			</tr>
		</thead>
	</table>
	<div id="r">
		姓名：<input class="easyui-textbox" id="staff_Name" style="width: 150px">
		账户创建时间: <input id="sstaff_CreatTime" type="text"
			class="easyui-datebox" style="width: 150px"> ~ <input
			id="estaff_CreatTime" type="text" class="easyui-datebox"
			style="width: 150px"> 是否锁定:<select id="staff_IsLockout"
			class="easyui-combobox" style="width: 150px;">
			<option value="">--请选择--</option>
			<option value="1">是</option>
			<option value="0">否</option>
		</select> <a onclick="init()" href="#" class="easyui-linkbutton"
			data-options="iconCls:'icon-search'">搜索</a> <a
			onclick="insertStaff()" href="#" class="easyui-linkbutton"
			data-options="iconCls:'icon-add'">添加</a>
	</div>
	<div id="win" class="easyui-window" title="添加员工"
		style="width: 400px; height: 300px"
		data-options="modal:true,closed:true">
		<table cellpadding=7>
			<tr>
				<td>姓名：</td>
				<td><input class="easyui-textbox" id="staff_Name1"
					style="width: 150px"></td>
			</tr>
			<tr>
				<td>登录密码：</td>
				<td><input class="easyui-textbox" type="password"
					id="staff_Password1" style="width: 150px"></td>
			</tr>
			<tr>
				<td></td>
				<td><a onclick="staffSave()" href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'">提交</a> <a onclick="staffNo()"
					href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-add'">取消</a></td>
			</tr>
		</table>

	</div>

	<div id="updateRoles-window" class="easyui-window"
		data-options="modal:true,closed:true,title:'修改角色'"
		style="width: 500px; height: 300px; padding: 20px;">
		<form id="updateRolesForm" style="padding: 20px;">
			<input type="hidden" name="staff_ID" id="update-staff_ID" /> 用户名:<input
				type="text" class="easyui-textbox" name="staff_Name"
				id="update-staff_Name" value="" required="required" />
		</form>
		<div style="text-align: center; padding: 20px">
			<a href="javascript:void(0)" class="easyui-linkbutton" type="button"
				onclick="submitJsFrom()">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="javascript:void(0)" class="easyui-linkbutton"
				onclick="clearJsFrom()">取消</a>
		</div>
	</div>

	<div id="congzhimima-window" class="easyui-window"
		data-options="modal:true,closed:true,title:'修改角色'"
		style="width: 500px; height: 300px; padding: 20px;">
		<form id="congzhimima" style="padding: 20px;">
			<input type="hidden" name="staff_ID" id="chong-staff_ID" /> 旧密码:<input
				type="text" class="easyui-textbox" id="chong-password" value=""
				required="required" /> 新密码:<input type="text" class="easyui-textbox"
				id="chong-password" value="" required="required" />
		</form>
		<div style="text-align: center; padding: 20px">
			<a href="javascript:void(0)" class="easyui-linkbutton" type="button"
				onclick="submitchongFrom()">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="javascript:void(0)" class="easyui-linkbutton"
				onclick="clearJsFrom()">取消</a>
		</div>
	</div>

	<!-- 设置权限 -->
	<input type="hidden" name="" id="she-staff_ID" value='' />
	<div id="roles-window" class="easyui-window"
		data-options="modal:true,closed:true,iconCls:'icon-save'"
		style="width: 700px; height: 500px">
		<table>
			<tr>
				<td>
					<table class="easyui-datagrid" id="syyh" title="用户列表"
						data-options="singleSelect:true,method:'post'"
						style="width: 250px;">
						<thead>
							<tr>
								<th data-options="field:'rolesId',width:70"></th>
								<th data-options="field:'rolesName',width:100">名称</th>
							</tr>
						</thead>
					</table>
				</td>
				<td><a href="javascript:void(0)" class="easyui-linkbutton"
					type="button" onclick="tianjia()">>></a><br />
				<br /> <a href="javascript:void(0)" class="easyui-linkbutton"
					onclick="yichu()"> <<</a></td>
				<td>
					<table class="easyui-datagrid" id="dqyh" title="用户列表"
						data-options="singleSelect:true,method:'post'"
						style="width: 250px; height: 250px;">
						<thead>
							<tr>
								<th data-options="field:'rolesId',width:70"></th>
								<th data-options="field:'rolesName',width:100">名称</th>
							</tr>
						</thead>
					</table>
				</td>
			</tr>
		</table>
	</div>

</body>
</html>