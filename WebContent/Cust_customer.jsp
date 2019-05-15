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
		return "<a onclick='updateCustomer("+index+")'>跟踪</a><a onclick='chakanCustomer("+index+")'>查看</a>";
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
		    	
		    	Cust_Pay:$("#Cust_Pay").combobox("getValue"),
		    	Cust_youxiao:$("#Cust_youxiao").combobox("getValue"),
		    	Cust_Revisit:$("#Cust_Revisit").combobox("getValue"),
		    	
		    	minCust_Creationtime:$("#minCust_Creationtime").datebox("getValue"),
		    	maxCust_Creationtime:$("#maxCust_Creationtime").datebox("getValue"),
		    	minCust_Doortime:$("#minCust_Doortime").datebox("getValue"),
		    	maxCust_Doortime:$("#maxCust_Doortime").datebox("getValue"),
		    	minCust_RevisitDays:$("#minCust_RevisitDays").datebox("getValue"),
		    	maxCust_RevisitDays:$("#maxCust_RevisitDays").datebox("getValue"),
		    	minCust_Paytime:$("#minCust_Paytime").datebox("getValue"),
		    	maxCust_Paytime:$("#maxCust_Paytime").datebox("getValue"),
		    	minCust_entrytime:$("#minCust_entrytime").datebox("getValue"),
		    	maxCust_entrytime:$("#maxCust_entrytime").datebox("getValue")
		    }
		});  $("#clear").form("reset");
	}
	//添加
	function addCustomer(){
		$("#win").window("open");
	}
	function tianjia(){
		$.post('insertCust_customer',{
			Cust_Name:$("#Cust_Name1").val(),
			Cust_Gender:$("#Cust_Gender1").val(),
			Cust_Age:$("#Cust_Age1").val(),
			Cust_QQ:$("#Cust_QQ1").val(),
			Cust_WeChat:$("#Cust_WeChat1").val(),
			Cust_Telephone:$("#Cust_Telephone1").val(),
			Cust_Education:$("#Cust_Education1").val(),
			Cust_state:$("#Cust_state1").val(),
			Cust_channel:$("#Cust_channel1").val(),
			Cust_website:$("#Cust_website1").val(),
			Cust_laiyuanguanjianzi:$("#Cust_laiyuanguanjianzi1").val(),
			Cust_preparation:$("#Cust_preparation1").val(),
			Cust_zaixianbeizhu:$("#Cust_zaixianbeizhu1").val()
		},function(res){
			if(res){
				alert("添加成功");
				$("#tab").datagrid("reload");
				$("#win").window("close");
			}else{
				alert("添加失败");
			}
		},"json")
	}
	function updateCustomer(index){
		var data=$("#tab").datagrid("getData");
		var row=data.rows[index];
		alert(row.cust_ID)
		$("#ff1").form("load",row);
		$("#wingenzhong").window("open");
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
	<form id="clear">
		客户名称:<input class="easyui-textbox"  style="width:150px" id="Cust_Name" > 
		客户QQ:<input class="easyui-textbox"  style="width:150px" id="Cust_QQ"> 
		电话:<input class="easyui-textbox"  style="width:150px" id="Cust_Telephone"> 
		咨询师:<input class="easyui-textbox"  style="width:150px" id="Staff_Name"> 
		是否缴费:<select id="Cust_Pay" class="easyui-combobox"  style="width:150px;">   
		   <option value="">--请选择--</option>   
		    <option value="1">是</option>   
		    <option value="0">否</option>   
		   <select> 
		是否有效:<select id="Cust_youxiao" class="easyui-combobox"  style="width:150px;">   
		   <option value="">--请选择--</option>   
		    <option value="1">是</option>   
		    <option value="0">否</option>   
		   <select> 
		是否回访:<select id="Cust_Revisit" class="easyui-combobox"  style="width:150px;">   
		   <option value="">--请选择--</option>   
		    <option value="1">是</option>   
		    <option value="0">否</option>   
		   <select>
		<a onclick="addCustomer()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a> <br/>
		客户创建的时间:<input class="easyui-datebox"  style="width:100px" id="minCust_Creationtime"> 
		~:<input class="easyui-datebox"  style="width:100px" id="maxCust_Creationtime"> 
		上门时间:<input class="easyui-datebox"  style="width:100px" id="minCust_Doortime"> 
		~:<input class="easyui-datebox"  style="width:100px" id="maxCust_Doortime"> 
		回访时间:<input class="easyui-datebox"  style="width:100px" id="minCust_RevisitDays"> 
		~:<input class="easyui-datebox"  style="width:100px" id="maxCust_RevisitDays"> 
		缴费时间:<input class="easyui-datebox"  style="width:100px" id="minCust_Paytime"> 
		~:<input class="easyui-datebox"  style="width:100px" id="maxCust_Paytime"> 
		进班时间:<input class="easyui-datebox"  style="width:100px" id="minCust_entrytime"> 
		~:<input class="easyui-datebox"  style="width:105px" id="maxCust_entrytime"> &nbsp;
		<a onclick="init()"  class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a> 
	</form>
</div>
<div id="win" class="easyui-window" title="添加" style="width:300px;height:400px"   
        data-options="iconCls:'icon-save',modal:true,closed:true">   
       <div id="ff" style="margin-left:20px" >
				客户名称:<input class="easyui-textbox" style="width:150px" prompt="121" id="Cust_Name1"> <br/>
				客户性别:<input class="easyui-textbox"  style="width:150px" id="Cust_Gender1"><br/> 
				客户年龄:<input class="easyui-textbox"  style="width:150px" id="Cust_Age1"> <br/>
				客户QQ:<input class="easyui-textbox"  style="width:150px" id="Cust_QQ1"> <br/>
				客户微信:<input class="easyui-textbox"  style="width:150px" id="Cust_WeChat1"> <br/>
				客户电话:<input class="easyui-textbox"  style="width:150px" id="Cust_Telephone1"> <br/>
				客户学历:<input class="easyui-textbox"  style="width:150px" id="Cust_Education1"> <br/>
				客户状态:<input class="easyui-textbox"  style="width:150px" id="Cust_state1"> <br/>
				来源渠道:<input class="easyui-textbox"  style="width:150px" id="Cust_channel1"> <br/>
				来源网站:<input class="easyui-textbox"  style="width:150px" id="Cust_website1"> <br/>
				来源关键词:<input class="easyui-textbox"  style="width:150px" id="Cust_laiyuanguanjianzi1"><br/> 
				是否报备:<input class="easyui-textbox"  style="width:150px" id="Cust_preparation1"> <br/>
				在线备注:<input class="easyui-textbox"  style="width:150px" id="Cust_zaixianbeizhu1"> <br/>
				<a onclick="tianjia()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a> 
				<a onclick="closeTianjia()"  class="easyui-linkbutton" data-options="iconCls:'icon-search'">关闭</a> 
	</div>
</div> 

<div id="wingenzhong" class="easyui-window" title="跟踪" style="width:300px;height:400px"   
        data-options="iconCls:'icon-save',modal:true,closed:true">   
       <div id="ff1" style="margin-left:20px" >
				来源渠道:<input class="easyui-textbox"  style="width:150px" id="Cust_channel2" name="Cust_channel"> <br/>
				来源网站:<input class="easyui-textbox"  style="width:150px" id="Cust_website2" name="Cust_website"> <br/>
				来源关键词:<input class="easyui-textbox"  style="width:150px" id="Cust_laiyuanguanjianzi2" name="Cust_laiyuanguanjianzi"><br/> 
				是否报备:<input class="easyui-textbox"  style="width:150px" id="Cust_preparation2" name="Cust_preparation"> <br/>
				在线备注:<input class="easyui-textbox"  style="width:150px" id="Cust_zaixianbeizhu2" naem="Cust_zaixianbeizhu"> <br/>
				<a onclick="genzhong()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">跟踪</a> 
				<a onclick="closegenzhong()"  class="easyui-linkbutton" data-options="iconCls:'icon-search'">关闭</a> 
	</div>
</div> 
</body>
</html>