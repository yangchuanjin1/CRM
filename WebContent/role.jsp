<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>角色管理</title>
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<script type="text/javascript">
	$(function(){
		sousuo();
	});
	//搜索
	function sousuo(){
		$('#role-datagrid').datagrid({
			url:'selectRolesAll',
			method:'post',
			pagination:true,
			singleSelect:true,
			toolbar:"#Roles-Toolbar",
			queryParams:{
				rolesName:$("#rolesName").val()
			}
		})
	}
	
	function formatterquanxian(value,row,index){
		return "<a href='javascript:quanxian("+index+")'>设置</a>"
	}
	
	//格式化操作列
	function formattercaozuo(value,row,index){
		return "<a href='javascript:chakan("+index+")'>查看</a>  <a href='javascript:updateRoles("+index+")'>修改</a>  <a href='javascript:deleteRoles("+index+")'>删除</a>";
	}
	//添加
	function Rolesadd(){
		$("#Roles-add").dialog("open");
	}
	//添加提交按钮
	function RolesInsetadd(){
		$.ajax({
			type:"post",//提交方式
			url:"insertRolesYang",//提交路径
			datatype:"json",//格式
			data:{//传递的参数
				"RolesName":$("#inset-rolesNmae").val()
			},
			success:function(res){//回调
				if(res>0){//判断回调的，受影响的行数是否大于零
					$("#role-datagrid").datagrid("reload");//刷新表格
					$.messager.alert('提示','添加成功');//提示信息
					$("#Roles-add").dialog("close");//关闭窗口
				}
			}
		})
	}
	//删除
	function deleteRoles(index){
		$.messager.confirm('确认','您确认想要删除记录吗？',function(r){
			var data=$("#role-datagrid").datagrid("getData");
        	var row=data.rows[index];
		    if (r){    
		    	$.ajax({
					type:"post",//提交方式
					url:"deletectRolesYang",//提交路径
					datatype:"json",//格式
					data:{//传递的参数
						RolesId:row.rolesId
					},
					success:function(res){//回调
						if(res>0){//判断回调的，受影响的行数是否大于零
							$("#role-datagrid").datagrid("reload");//刷新表格
							$.messager.alert('提示','删除成功');//提示信息
						}
					}
				})    
		    }    
		});
	}
	/* 修改 */
	function updateRoles(index){
		var data=$("#role-datagrid").datagrid("getData");
		var row=data.rows[index];
		$("#updateRolesForm").form("load",row);
		$("#updateRoles-window").window("open");
	}
	/* 修改提交操作 */
	function submitJsFrom(){
       var flag=$("#updateRolesForm").form("validate")
       var name=$("#update-RolesName").val();
       var id=$("#update-RolesId").val();
       if(flag){
            $.post('updateRolesYang',{
            	RolesId:id,
            	RolesName:name
            	},function(res){
            		if(res>0){
            			$.messager.alert('提示','修改成功');
            			$("#updateRoles-window").window("close");
            			$("#role-datagrid").datagrid("reload");
            		}
            	},"json"
            );
          } 
        }
	
	function quanxian(index){
		
	}
</script>
<body>
 <table id="role-datagrid" class="easyui-datagrid">
 	<thead>   
        <tr>   
            <th data-options="field:'rolesId'">编号</th>   
            <th data-options="field:'rolesName'">角色名称</th>   
            <th data-options="field:'caozuo',formatter:formattercaozuo">操作</th>
            <th data-options="field:'quanxian',formatter:formatterquanxian">权限</th>     
        </tr>   
    </thead> 
 </table>
 <!-- 工具条 -->
 <div id="Roles-Toolbar">
 	<form class="easyui-form" id="Roles-form">
 		<label for="name">角色名称：</label>   
        <input class="easyui-textbox" type="text" id="rolesName" name="name" />
        <a id="btn" href="javascript:sousuo()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> 
        <a id="btn" href="javascript:Rolesadd()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a> 
 	</form>
 </div>
 <!--添加 弹出框 -->
 
 <div id="Roles-add" class="easyui-dialog" title="角色添加" style="width:400px;height:200px;"   
        data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
		<form id="" class="easyui-form">
			<table>
				<div>  
			        <label for="name">角色名称：</label>   
			        <input class="easyui-textbox" type="text" id="inset-rolesNmae" name="name" data-options="required:true" />   
			    </div>
			    <div>  
			        <a id="btn" href="javascript:RolesInsetadd()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a> 
			    </div>
			</table>
		</form>
</div>
 <!--  修改-->
 <div id="updateRoles-window" class="easyui-window" data-options="modal:true,closed:true,title:'修改角色'" style="width: 500px;height: 300px;padding: 20px;">
	<form id="updateRolesForm" style="padding: 20px;">
		<input type="hidden" name="rolesId" id="update-RolesId" />
		角色名称:<input type="text" class="easyui-textbox" name="rolesName" id="update-RolesName" value="" required="required"/>
	</form>
	<div style="text-align:center;padding:20px">
         <a href="javascript:void(0)" class="easyui-linkbutton" type="button" onclick="submitJsFrom()">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearJsFrom()">取消</a>        
     </div>
 </div>
</body>
</html>