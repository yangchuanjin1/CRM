<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
  /*  $(function(){
	    $("#RolesId").combobox({
		   url:'selectRoles',
		   method:'post',
		   valueField: 'rolesId',
		   textField: 'rolesName'
	   });  
	   init();
   });
   function init(){
	     var rolesId=$("#RolesId").combobox("getValue");
	     if(rolesId=="--请选择--"){
		   rolesId='';
	     }   
	   $("#tab").datagrid({
		   url:'selectStaffs',
		   method:"post",
		   pagination:true,
		   singleSelect:true,
		   queryParams:{
			   staff_Name:$("#staff_Name").val(),
			   sstaff_CreatTime:$("#sstaff_CreatTime").datebox("getValue"),
			   estaff_CreatTime:$("#estaff_CreatTime").datebox("getValue"),
			   Staff_IsLockout:$("#staff_IsLockout").combobox("getValue"),
			   rolesId:rolesId 
		   }
	   });;
   }
   function caozuo(value,row,index){
	   return "<a href='#' onclick='chakanStaff("+index+")'>查看</a> "
	   +"<a href='#' onclick='updateStaff("+index+")'>修改</a> "
	   +"<a href='#' onclick='deleteStaff("+index+")'>删除</a>";
   }
   function roles(value,row,index){
	   return row.roles.rolesName;
	  /*  var a = "<select class='easyui-combobox'>"
	   if(row.roles.length==1){
		   return row.roles[0].rolesName;
	   }
	   else{
		   for(var i=0;i<row.roles.length;i++){
			   a+="<option value='"+row.roles[i].rolesId+"'>"+row.roles[i].rolesName+"</option>";
		   }
		   a+="</select>"
		   return a;
	   }  */
 /*   }
   function staff_IsLockout(value,row,index){
	   return row.staff_IsLockout==0?"否":"是";
   }
   function insertStaff(){
	   $("#rolesId1").combobox({
		   url:'selectRoles',
		   method:'post',
		   valueField: 'rolesId',
		   textField: 'rolesName'
	   });
	   $("#win").window("open");
   }
   function staffSave(){
	   var rolesId=$("#rolesId1").combobox("getValue");
	   $.post(++9
			   "insertStaff",
			   {
		   staff_Name:$("#staff_Name1").val(),
		   staff_Password:$("#staff_Password1").val(),
		   staff_ProtectEmail:$("#staff_ProtectEmail1").val(),
		   staff_ProtecMtel:$("#staff_ProtecMtel1").val (),
		   Staff_IsLockout:$("#staff_IsLockout1").combobox("getValue"),
		   rolesId:rolesId
	   },function(res){
		   if(res>0){
			   $("#tab").datagrid("reload");
			   $("#win").window("close");
			    alert("添加成功");
		   }
		   else{
			   alert("添加失败");
		   }
	   },"json");
   }  */
</script>
</head>
<body>
   <!-- <table class="easyui-datagrid" id="tab" data-options="fitColumns:true,singleSelect:true,toolbar:'#r'">   
    <thead>   
        <tr>   
            <th data-options="field:'staff_ID',width:100">编号</th>   
            <th data-options="field:'staff_Name',width:100">姓名</th>   
            <th data-options="field:'staff_IsLockout',width:100,formatter:staff_IsLockout">是否锁定</th>   
            <th data-options="field:'staff_Time',width:100">最后一次登录时间</th>   
            <th data-options="field:'staff_CreatTime',width:100">账户创建时间</th>
            <th data-options="field:'staff_PsdWrong',width:100">密码错误次数</th>   
            <th data-options="field:'staff_LockTime',width:100">被锁定的时间</th>   
            <th data-options="field:'staff_ProtectEmail',width:100">密保邮箱</th>
            <th data-options="field:'staff_ProtecMtel',width:100">密保手机号</th>   
            <th data-options="field:'roles',width:100,formatter:roles">角色名称</th>   
            <th data-options="field:'caozuo',width:100,formatter:caozuo,align:'center'">名称</th>   
        </tr>   
    </thead>   
</table> 
<div id="r">
    姓名：<input class="easyui-textbox" id="staff_Name"  style="width:150px"> 
    账户创建时间: <input  id="sstaff_CreatTime"  type= "text" class= "easyui-datebox" style="width:150px"> ~
    <input  id="estaff_CreatTime"  type= "text" class= "easyui-datebox" style="width:150px"> 
    是否锁定:<select id="staff_IsLockout" class="easyui-combobox"  style="width:150px;">   
    <option value="">--请选择--</option>   
    <option value="1">是</option>   
    <option value="0">否</option>   
   </select> 
      角色名称：<select id="RolesId" class="easyui-combobox" style="width:150px;">   
    <option >--请选择--</option>  
   </select> 
   <a onclick="init()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> 
   <a onclick="insertStaff()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a> 
</div>
<div id="win" class="easyui-window" title="添加员工" style="width:400px;height:300px"   
        data-options="modal:true,closed:true">
        <table cellpadding=7>
          <tr>
             <td>姓名：</td>
             <td><input class="easyui-textbox" id="staff_Name1"  style="width:150px"></td>
          </tr>
          <tr>
             <td> 登录密码：</td>
             <td><input class="easyui-textbox" type="password" id="staff_Password1"  style="width:150px"></td>
          </tr>
          <tr>
             <td>密保邮箱：</td>
             <td><input class="easyui-textbox" id="staff_ProtectEmail1"  style="width:150px"></td>
          </tr>
          <tr>
             <td>密保手机号：</td>
             <td><input class="easyui-textbox" id="staff_ProtecMtel1"  style="width:150px"></td>
          </tr>
          <tr>
          <td>是否锁定:</td>
          <td>
          <select id="staff_IsLockout1" class="easyui-combobox"  style="width:150px;">   
		    <option value="">--请选择--</option>   
		    <option value="1">是</option>   
		    <option value="0">否</option>   
		   </select>
           </td>
          </tr>
          <tr>
          <td>角色名称：</td>
          <td>
          <select id="rolesId1" class="easyui-combobox"  style="width:150px;">   
		    <option>--请选择--</option>   
		   </select>
           </td>
          </tr>
          <tr>
             <td></td>
             <td>
               <a onclick="staffSave()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> 
               <a onclick="staffNo()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
             </td>
          </tr>
        </table>  
    
</div> --> 
</body>
</html>