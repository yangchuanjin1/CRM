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
$(function (){
	init();
});
function init(){
	$("#tab").datagrid({
		   url:'selectCommunicate_record',
		   method:"post",
		   pagination:true,
		   singleSelect:true,
		   queryParams:{
			   cust_Name:$("#cust_Name").val(),
			   staff_Name:$("#staff_Name").val(),
			   sComm_date:$("#scomm_date").datebox("getValue"),
			   eComm_date:$("#ecomm_date").datebox("getValue"),
			   scomm_endData:$("#scomm_endData").datebox("getValue"),
			   ecomm_endData:$("#ecomm_endData").datebox("getValue"),
			   comm_huifang:$("#comm_huifang").combobox("getValue"),
			   comm_way:$("#comm_way").combobox("getValue")
		   }
	});
}
 function comm_cust_ID(value,row,index){
	 return row.cust_customer.cust_Name;
 }
 function comm_Staff_ID(value,row,index){
	 return row.staff.staff_Name;
 }
 function caozuo(value,row,index){
	 return "<a onclick='ChaKan("+index+")'>查看</a>";
 }
 function comm_way(value,row,index){
	 return row.comm_way==0?"上门访问":"电话访问";
 }
 function comm_huifang(value,row,index){
	 return row.comm_huifang==0?"未访问":"已访问";
 }
 function ChaKan(index){
	  var data=$("#tab").datagrid("getData");
	  var row=data.rows[index];
	  $("#f").form("load",row);
	  $("#win").window("open");
 }
</script>
</head>
<body>
  <table class="easyui-datagrid" id="tab" data-options="fitColumns:true,singleSelect:true,toolbar:'#r'">   
    <thead>   
        <tr>   
            <th data-options="field:'comm_ID',width:100">编号</th>   
            <th data-options="field:'comm_cust_ID',width:100,formatter:comm_cust_ID">学生姓名</th>   
            <th data-options="field:'comm_Staff_ID',width:100,formatter:comm_Staff_ID">咨询师姓名</th>   
            <th data-options="field:'comm_date',width:100">交往开始时间</th>
            <th data-options="field:'comm_endData',width:100">交往结束时间</th>
            <th data-options="field:'comm_huifang',width:100,formatter:comm_huifang">回访情况</th> 
            <th data-options="field:'comm_way',width:100,formatter:comm_way">交往的方式</th>
            <th data-options="field:'comm_title',width:100">交往的概要</th>   
            <th data-options="field:'comm_detail',width:100">交往详细信息</th>   
            <th data-options="field:'caozuo',width:100,formatter:caozuo,align:'center'">操作</th>   
        </tr>   
    </thead>   
</table> 
<div id="r">
    学生姓名：<input class="easyui-textbox" id="cust_Name"  style="width:100px">
    咨询师姓名：<input class="easyui-textbox" id="staff_Name"  style="width:100px">  
    交往开始时间: <input  id="scomm_date"  type= "text" class= "easyui-datebox" style="width:130px"> ~
    <input  id="ecomm_date"  type= "text" class= "easyui-datebox" style="width:150px"> 
     交往结束时间: <input  id="scomm_endData"  type= "text" class= "easyui-datebox" style="width:130px"> ~
    <input  id="ecomm_endData"  type= "text" class= "easyui-datebox" style="width:130px"> 
    
    回访情况:<select id="comm_huifang" class="easyui-combobox"  style="width:130px;">   
    <option value="">--请选择--</option>   
    <option value="1">已访问</option>   
    <option value="0">未访问</option>   
   </select>
  交往的方式:<select id="comm_way" class="easyui-combobox"  style="width:130px;">   
    <option value="">--请选择--</option>   
    <option value="0">上门访问</option>   
    <option value="1">电话访问</option>   
   </select> 
   <a onclick="init()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>  
</div>
<div id="win" class="easyui-window" title="查看" style="width:600px;height:400px"   
        data-options="modal:true,closed:true">  
        <form id="f">
        <table cellpadding=7>
          <tr>
             <td>交往详细信息：</td>
             <td><textarea style="width:450px;height:300px" name="comm_detail" class="textarea easyui-validatebox"></textarea></td>
          </tr>
        </table>
        </form> 
</div> 
</body>
</html>