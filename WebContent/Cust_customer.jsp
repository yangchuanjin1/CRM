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
	function Staff_Name(value,row,index){
		return row.asker.staff.staff_Name;
	}
	function Cust_Asker_ID(value,row,index){
		return row.asker.asker_Name;
	}
	function caozuo(value,row,index){
		return "<a onclick='updateCustomer("+index+")'>修改</a><a onclick='chakanCustomer("+index+")'>查看</a>";
	}
	function huifang(value,row,index){
		 return row.cust_Revisit==0?"否":"是";
	}
	function youxiao(value,row,index){
		 return row.cust_youxiao==0?"否":"是";
	}
	function jiaofei(value,row,index){
		 return row.cust_Pay==0?"否":"是";
	}
	function init(){
		$('#tab').datagrid({    
		    url:'selectCust_customers',  
		    method:"post",
		    pagination:true,
		    singleSelect:true,
		    toolbar:'#f',
		    queryParams:{
		    	Cust_Name:$("#Cust_Name").val(),
		    	Cust_QQ:$("#Cust_QQ").val(),
		    	Cust_Telephone:$("#Cust_Telephone").val(),
		    	Cust_Name:$("#Cust_Name").val(),
		    	Cust_Pay:$("#Cust_Pay").val(),
		    	Cust_youxiao:$("#Cust_youxiao").val(),
		    	Cust_Revisit:$("#Cust_Revisit").val(),
		    	
		    	minCust_Creationtime:$("#minCust_Creationtime").val(),
		    	maxCust_Creationtime:$("#maxCust_Creationtime").val(),
		    	minCust_Doortime:$("#minCust_Doortime").val(),
		    	maxCust_Doortime:$("#maxCust_Doortime").val(),
		    	minCust_RevisitDays:$("#minCust_RevisitDays").val(),
		    	maxCust_RevisitDays:$("#maxCust_RevisitDays").val(),
		    	minCust_Paytime:$("#minCust_Paytime").val(),
		    	maxCust_Paytime:$("#maxCust_Paytime").val(),
		    	minCust_entrytime:$("#minCust_entrytime").val(),
		    	maxCust_entrytime:$("#maxCust_entrytime").val()
		    }
		});  
	}
</script>
</head>
<body>
<table class="easyui-datagrid" id="tab">   
    <thead>   
        <tr>   
            <th data-options="field:'cust_ID',width:100">客户编码</th>   
            <th data-options="field:'cust_Name',width:100">客户名称</th>   
            <th data-options="field:'cust_Age',width:100">客户年龄</th>   
            <th data-options="field:'cust_Gender',width:100">客户性别</th>   
            <th data-options="field:'cust_Telephone',width:100">客户电话</th>   
            <th data-options="field:'cust_Education',width:100">客户学历</th>   
            <th data-options="field:'cust_QQ',width:100">客户QQ</th>   
            <th data-options="field:'cust_WeChat',width:100">客户微信</th>   
            <th data-options="field:'cust_Revisit',width:100,formatter:huifang">是否回访</th>   
            <th data-options="field:'cust_youxiao',width:100,formatter:youxiao">是否有效</th>   
            <th data-options="field:'cust_Pay',width:100,formatter:jiaofei">是否缴费</th>   
            <th data-options="field:'cust_Creationtime',width:100">客户创建的时间</th>   
            <th data-options="field:'cust_Doortime',width:100">上门时间</th>   
            <th data-options="field:'cust_RevisitDays',width:100">回访时间</th>   
            <th data-options="field:'cust_Paytime',width:100">缴费时间</th>   
            <th data-options="field:'cust_entrytime',width:100">进班时间</th>  
            <th data-options="field:'cust_Asker_ID',width:100,formatter:Cust_Asker_ID">咨询师头衔</th>  
            <th data-options="field:'staff_Name',width:100,formatter:Staff_Name">咨询师姓名</th>  
            <th data-options="field:'caozuo',width:100,formatter:caozuo">操作</th>  
        </tr>   
    </thead>   
</table>  
<div id="f">
	客户名称:<input class="easyui-textbox"  style="width:30px" id="Cust_Name"> 
	客户QQ:<input class="easyui-textbox"  style="width:30px" id="Cust_QQ"> 
	电话:<input class="easyui-textbox"  style="width:30px" id="Cust_Telephone"> 
	咨询师:<input class="easyui-textbox"  style="width:30px" id="Staff_Name"> 
	是否缴费:<input class="easyui-textbox"  style="width:30px" id="Cust_Pay"> 
	是否有效:<input class="easyui-textbox"  style="width:30px" id="Cust_youxiao"> 
	是否回访:<input class="easyui-textbox"  style="width:30px" id="Cust_Revisit"> 
	客户创建的时间:<input class="easyui-textbox"  style="width:30px" id="minCust_Creationtime"> 
	~:<input class="easyui-textbox"  style="width:30px" id="maxCust_Creationtime"> 
	上门时间:<input class="easyui-textbox"  style="width:30px" id="minCust_Doortime"> 
	~:<input class="easyui-textbox"  style="width:30px" id="maxCust_Doortime"> 
	回访时间:<input class="easyui-textbox"  style="width:30px" id="minCust_RevisitDays"> 
	~:<input class="easyui-textbox"  style="width:30px" id="maxCust_RevisitDays"> 
	缴费时间:<input class="easyui-textbox"  style="width:30px" id="minCust_Paytime"> 
	~:<input class="easyui-textbox"  style="width:30px" id="maxCust_Paytime"> 
	进班时间:<input class="easyui-textbox"  style="width:30px" id="minCust_entrytime"> 
	~:<input class="easyui-textbox"  style="width:30px" id="maxCust_entrytime"> 
	<a onclick="init()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> 
	<a onclick="addCustomer" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a> 
</div>
</body>
</html>