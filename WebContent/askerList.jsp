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
   $("#tab").datagrid({
	   url:'selectAsker',
	   method:"post",
	   pagination:true,
	   singleSelect:true/* ,
	   queryParams:{
		   staff_Name:$("#staff_Name").val(),
		   signln_status:$("#signln_status").combobox("getValue"),
		   sBack_date:$("#sBack_date").datebox("getValue"),
		   eBack_date:$("#eBack_date").datebox("getValue"),
		   sSignIn_date:$("#sSignIn_date").datebox("getValue"),
		   eSignIn_date:$("#eSignIn_date").datebox("getValue")
	   } */
	   });
    }
    function staff(value,row,index){
    	return row.staff.staff_Name;
    }
    function caozuo(value,row,index){
    	return "<a onclick='updateAsker("+index+")'>修改</a> <a onclick='deleteAsker("+index+")'>删除</a> <a onclick='ChaKan("+index+")'>查看</a>";
    }
    /* function SignIn_date(value,row,index){
    	return row.signin.signIn_date;
    }
    function Back_date(value,row,index){
    	return row.signin.back_date;
    }
    function Signln_status(value,row,index){
    	return row.signin.signln_status==0?"否":"是";
    }    */ 
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
            <th data-options="field:'asker_ID',width:100">编号</th>   
            <th data-options="field:'staff',width:100,formatter:staff">姓名</th>   
            <th data-options="field:'SignIn_date',width:100,formatter:SignIn_date">签到时间</th> 
            <th data-options="field:'Back_date',width:100,formatter:Back_date">签退时间</th> 
            <th data-options="field:'Signln_status',width:100,formatter:Signln_status">是否签到</th>
            <th data-options="field:'caozuo',width:100,formatter:caozuo">操作</th>   
        </tr>
    </thead>
 </table>
  <div id="r">
    <a onclick="insertAsker()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
   <!--  姓名：<input class="easyui-textbox" id="staff_Name" style="width:150px">
   签到状态：<select id="signln_status" class="easyui-combobox"  style="width:150px;">   
   <option value="">--请选择--</option>   
    <option value="1">是</option>   
    <option value="0">否</option>   
   </select> 
    签到开始时间：<input  id="sSignIn_date"  type= "text" class= "easyui-datebox" style="width:150px"> ~
    <input  id="eSignIn_date"  type= "text" class= "easyui-datebox" style="width:150px">
    签到结束时间：<input  id="sBack_date"  type= "text" class= "easyui-datebox" style="width:150px"> ~
    <input  id="eBack_date"  type= "text" class= "easyui-datebox" style="width:150px">
    <a onclick="init()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> -->  
  </div>
  <div id="win" class="easyui-window" title="添加员工" style="width:400px;height:300px"   
        data-options="modal:true,closed:true">
        <table cellpadding=7>
          <tr>
             <td>姓名：</td>
             <td><input class="easyui-textbox" id="staff_ID"  style="width:150px"></td>
          </tr>
          <tr>
             <td> 评价：</td>
             <td><input class="easyui-textbox" id="asker_Name"  style="width:150px"></td>
          </tr>
          <tr>
             <td>权重：</td>
             <td><input class="easyui-textbox" prompt="请输入1~100" id="asker_Weight"  style="width:150px"></td>
          </tr>
          <tr>
             <td></td>
             <td>
               <a onclick="askerSave()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">保存</a> 
               <a onclick="askerNo()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-no'">取消</a>
             </td>
          </tr>
        </table>  
</div>
</body>
</html>