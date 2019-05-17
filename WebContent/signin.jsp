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
$(function(){
	init();
});
function init(){
	alert($("#signln_status").combobox("getValue"))
   $("#tab").datagrid({
	   url:'selectSigninAllandCount',
	   method:"post",
	   pagination:true,
	   singleSelect:true,
	   queryParams:{
		   staff_Name:$("#staff_Name").val(),
		   signln_status:$("#signln_status").combobox("getValue"),
		   sBack_date:$("#sBack_date").datebox("getValue"),
		   eBack_date:$("#eBack_date").datebox("getValue"),
		   sSignIn_date:$("#sSignIn_date").datebox("getValue"),
		   eSignIn_date:$("#eSignIn_date").datebox("getValue")
	   } 
	   });
    }
    function staff(value,row,index){
    	return row.staff.staff_Name;
    }
    function caozuo(value,row,index){
    	return "<a onclick='updateAsker("+index+")'>修改</a> <a onclick='deleteAsker("+index+")'>删除</a> <a onclick='ChaKan("+index+")'>查看</a>";
    }
    function formatterSignln_status(value,row,index){
    	return row.signln_status==0?"否":"是";
    } 
    function insertAsker(){
    	$("#win").window("open");
    }
    function askerSave(){
    	$.post("insertAsker",{
    		staff_ID:$("#staff_ID").val,
    		asker_Name:$("#asker_Name").val,
    		asker_Weight:$("#asker_Weight").val
    	},function(res){
    		
    	},"json");
    }
</script>
</head>
<body>
 <table class="easyui-datagrid" id="tab" data-options="fitColumns:true,singleSelect:true,toolbar:'#r'">   
    <thead>   
        <tr>   
            <th data-options="field:'signIn_ID',width:100">编号</th>   
            <th data-options="field:'staff',width:100,formatter:staff">姓名</th>   
            <th data-options="field:'signIn_date',width:100">签到时间</th> 
            <th data-options="field:'back_date',width:100">签退时间</th> 
            <th data-options="field:'Signln_status',width:100,formatter:formatterSignln_status">是否签到</th>
            <!-- <th data-options="field:'caozuo',width:100,formatter:caozuo">操作</th>    -->
        </tr>
    </thead>
 </table>
  <div id="r">
   姓名：<input class="easyui-textbox" id="staff_Name" style="width:150px">
   签到状态：<select id="signln_status" class="easyui-combobox"  style="width:150px;">   
   <option value="">--请选择--</option>   
    <option value="1">是</option>   
    <option value="0">否</option>   
   </select> 
    签到开始时间：<input  id="sSignIn_date"  type= "text" class= "easyui-datebox" style="width:150px"> ~
    <input  id="eSignIn_date"  type= "text" class= "easyui-datebox" style="width:150px">
    签到结束时间：<input  id="sBack_date"  type= "text" class= "easyui-datebox" style="width:150px"> ~
    <input  id="eBack_date"  type= "text" class= "easyui-datebox" style="width:150px">
    <a onclick="init()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> 
  </div>
</body>
</html>