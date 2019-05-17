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
		$("#Staff_Name").combobox({
			   url:'selectAskers',
			   method:'post',
			   valueField: 'id',
			   textField: 'text'
		   });
		init();
	});
	function Staff_Name(value,row,index){
		return row.staff.staff_Name;
	}
	function Cust_Asker_ID(value,row,index){
		return row.asker.asker_Name;
	}
	function caozuo(value,row,index){
		return "<a href='#' onclick='insertCustomer("+index+")'>跟踪</a>  <a href='#' onclick='chakanCustomer("+index+")'>查看</a>  <a href='#' onclick='updateCustomer("+index+")'>编辑</a> <a href='#' onclick='deleteCustomer("+index+")'>删除</a>";
	}
	function deleteCustomer(index){
		var data=$("#tab").datagrid("getData");
		var row=data.rows[index];
		$.messager.confirm("提示","确定删除吗？",function(r){
			if(r){
				$.post("deleteCust_customer",{
					cust_ID:row.cust_ID
				},function(res){
					if(res>0){
						$("#tab").datagrid("reload");
						alert("删除成功");
					}else{
						alert("删除失败");
					}
				},"json");
			}
		});
	}
	function updateCustomer(index){
		var data=$("#tab").datagrid("getData");
		var row=data.rows[index];
		$("#f3").form("load",row);
		$("#f4").form("load",row);
		$("#win2").window("open");
	}
	function updateSave(){
		$.post("updateCust_customer",{
			Cust_ID:$("#cust_ID3").val(),
			Cust_Name:$("#Cust_Name3").val(),
			Cust_Gender:$("#Cust_Gender3").combobox("getValue"),
			Cust_Age:$("#Cust_Age3").val(),
			Cust_Telephone:$("#Cust_Telephone3").val(),
			Cust_Education:$("#Cust_Education3").val(),
			Cust_state:$("#Cust_state3").val(),
			Cust_channel:$("#Cust_channel3").val(),
			Cust_website:$("#Cust_website3").val(),
			Cust_laiyuanguanjianzi:$("#Cust_laiyuanguanjianzi3").val(),
			Cust_quyu:$("#Cust_quyu3").val(),
			Cust_guanzhu:$("#Cust_guanzhu3").val(),
			Cust_laiyuanbumen:$("#Cust_laiyuanbumen3").val(),
			Cust_QQ:$("#Cust_QQ3").val(),
			Cust_WeChat:$("#Cust_WeChat3").val(),
			Cust_preparation:$("#Cust_preparation3").combobox("getValue"),
			Cust_Asker_ID:$("#Cust_Asker_ID3").val(),
			Cust_Course:$("#Cust_Course3").val(),
			Cust_Scoring:$("#Cust_Scoring3").val(),
			Cust_youxiao:$("#Cust_youxiao3").combobox("getValue"),
			Cust_wuxiaoyuanyin:$("#Cust_wuxiaoyuanyin3").val(),
			Cust_Revisit:$("#Cust_Revisit3").combobox("getValue"),
			Cust_RevisitDays:$("#Cust_RevisitDays3").val(),
			Cust_Door:$("#Cust_Door3").combobox("getValue"),
			Cust_Doortime:$("#Cust_Doortime3").val(),
			Cust_dingjin:$("#Cust_dingjin3").val(),
			Cust_dingjinDay:$("#Cust_dingjinDay3").val(),
			Cust_Pay:$("#Cust_Pay3").combobox("getValue"),
			Cust_Paytime:$("#Cust_Paytime3").val(),
			Cust_money:$("#Cust_money3").val(),
			Cust_Refund:$("#Cust_Refund3").combobox("getValue"),
			Cust_Refundreason:$("#Cust_Refundreason3").val(),
			Cust_entry:$("#Cust_entry3").combobox("getValue"),
			Cust_entrytime:$("#Cust_entrytime3").val(),
			Cust_notes:$("#Cust_notes3").val(),
			Cust_askerbeizhu:$("#Cust_askerbeizhu3").val()
		},function(res){
			if(res>0){
				alert("修改成功");
				$("#tab").datagrid("reload");
				$("#win2").window("close");
			}else{
				alert("修改失败");
			}
		},"json");
	}
	function chakanCustomer(index){
		var data=$("#tab").datagrid("getData");
		var row=data.rows[index];
		$("#f1").form("load",row);
		$("#f2").form("load",row);
		$("#win1").window("open");
		
	}
	function huifang(value,row,index){
		 return row.cust_Revisit==0?"是":"否";
	}
	function youxiao(value,row,index){
		 return row.cust_youxiao==0?"是":"否";
	}
	function jiaofei(value,row,index){
		 return row.cust_Pay==0?"是":"否";
	}
	function cust_Gender(value,row,index){
		 return row.cust_Gender==1?"男":"女";
	}
	
	function init(){
		var asker_ID=$("#Staff_Name").combobox("getValue");
	     if(asker_ID=="--请选择--"){
	    	 asker_ID='';
	     }  
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
		    	cust_Pay:$("#Cust_Pay").combobox("getValue"),
		    	cust_youxiao:$("#Cust_youxiao").combobox("getValue"),
		    	cust_Revisit:$("#Cust_Revisit").combobox("getValue"),
		    	asker_ID:asker_ID,
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
		$("#cust_Asker_ID").combobox({
			   url:'selectAskers',
			   method:'post',
			   valueField: 'id',
			   textField: 'text'
		   });
		$("#win").window("open");
	}
	function tianjia(){
		alert($("#cust_Asker_ID").combobox("getValue"));
		$.post('insertCust_customer',{
			Cust_Name:$("#Cust_Name1").val(),
			Cust_Gender:$("#Cust_Gender1").combobox("getValue"),
			Cust_Age:$("#Cust_Age1").val(),
			Cust_QQ:$("#Cust_QQ1").val(),
			Cust_WeChat:$("#Cust_WeChat1").val(),
			Cust_Telephone:$("#Cust_Telephone1").val(),
			Cust_Education:$("#Cust_Education1").val(),
			Cust_state:$("#Cust_state1").combobox("getValue"),
			Cust_channel:$("#Cust_channel1").val(),
			Cust_website:$("#Cust_website1").val(),
			Cust_laiyuanguanjianzi:$("#Cust_laiyuanguanjianzi1").val(),
			Cust_preparation:$("#Cust_preparation1").combobox("getValue"),
			Cust_zaixianbeizhu:$("#Cust_zaixianbeizhu1").val(),
			cust_Asker_ID:$("#cust_Asker_ID").combobox("getValue")
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
	function insertCustomer(index){
		var data=$("#tab").datagrid("getData");
		var row=data.rows[index];
		alert(row.cust_ID)
		$("#ff1").form("load",row);
		$("#wingenzhong").window("open");
	}
	
	//设置隐藏列
	 function selectColumn() {
			$("#hiddenColumn_dialog").dialog("open");
		}
		function saveColumn() {
			var cbx = $("#hiddenColumn_form input[type='checkbox']"); //获取Form里面是checkbox的Object
			
		    var checkedValue = "";
		    var unCheckValue = "";
		    for (var i = 0; i < cbx.length; i++) {
		        if (cbx[i].checked) {//获取已经checked的Object
		            if (checkedValue.length > 0) {
		                checkedValue += "," + cbx[i].value; //获取已经checked的value
		            }
		            else {
		                checkedValue = cbx[i].value;
		            }
		        }
		        if (!cbx[i].checked) {//获取没有checked的Object
		            if (unCheckValue.length > 0) {
		                unCheckValue += "," + cbx[i].value; //获取没有checked的value
		            }
		            else {
		                unCheckValue = cbx[i].value;
		            }
		        }
		    }
		    
		    var checkeds = new Array();
		    if (checkedValue != null && checkedValue != "") {
		        checkeds = checkedValue.split(',');
		        for (var i = 0; i < checkeds.length; i++) {
		            $('#tab').datagrid('showColumn', checkeds[i]); //显示相应的列
		        }
		    }
		    var unChecks = new Array();
		    if (unCheckValue != null && unCheckValue != "") {
		        unChecks = unCheckValue.split(',');
		        for (var i = 0; i < unChecks.length; i++) {
		            $('#tab').datagrid('hideColumn', unChecks[i]); //隐藏相应的列
		        }
		    }
		  
		    
		}
		//关闭设置隐藏列弹框
		function closed_hiddenColumn() {
			$('#hiddenColumn_dialog').dialog('close');
		}
		//全选按钮
		function ChooseAll() {
		   
		    var a=$("#isQuanXuan").text();//获取按钮的值
		    if("全选"==a.trim()){
		    	 $("#hiddenColumn_form input[type='checkbox']").prop("checked", true);//全选
		    	$('#isQuanXuan').linkbutton({ text:'全不选' });
		    }else{    	
		    	 $("#hiddenColumn_form input[type='checkbox']").removeAttr("checked", "checked");//取消全选
		    	 $('#isQuanXuan').linkbutton({ text:'全选' });
		    }
		    
		}
		
		/*导出Excel表格*/
        function ExportForm() {
				var header = $('#tab').datagrid('options').columns[0];//获取数据的第一行表头
				var fields="";
				for (var i = 1; i < header.length-1; i++) {
				var field = header[i].field;
				var hiddenFlag = header[i].hidden;//获取表头的隐藏列
				if (!hiddenFlag) {//如果字段不是隐藏列的话
				var dh = i == (header.length - 1) ? "" : ",";//将表头的字段进行分割
				fields = fields + field + dh;
				}
				
				}
				var row = $("#tab").datagrid("getSelections"); // 获取所有选中的行
				var stulist='';
				if(row==null || row==''){
					var data=$('#tab').datagrid('getData');
					stulist=JSON.stringify(data.rows);
					 
				}else{
					stulist=JSON.stringify(row);
				}
				 alert(stulist);
				//window.location.href="/CRM/exportForm?stulist="+stulist+"&fields="+fields;
				var form=$("<form>");
				form.attr("style",'display:none');
				form.attr('target','');
				form.attr('method','post');
				form.attr('action','/CRM/exportForm');
				
				var input=$('<input>');
				input.attr('type','hidden');
				input.attr('name','fields');
				input.attr('value',fields);
				var input2=$('<input>');
				input2.attr('type','hidden');
				input2.attr('name','stulist');
				input2.attr('value',stulist);
				
				$('body').append(form);
				form.append(input);
				form.append(input2);
				form.submit();
				}

</script>
</head>
<body>
<table class="easyui-datagrid" id="tab">   
    <thead>   
        <tr>   
            <th data-options="field:'ck',checkbox:true">
            <th data-options="field:'cust_ID',width:100">客户编码</th>   
            <th data-options="field:'cust_Name',width:100">客户名称</th>   
            <th data-options="field:'cust_Age',width:100">客户年龄</th>   
            <th data-options="field:'cust_Gender',width:100,formatter:cust_Gender">客户性别</th>   
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
            <th data-options="field:'cust_zaixianbeizhu',width:100">在线备注</th>
            <th data-options="field:'caozuo',width:100,formatter:caozuo">操作</th>  
        </tr>   
    </thead>   
</table>  
<div id="f">
	<form id="clear">
		客户名称:<input class="easyui-textbox"  style="width:150px" id="Cust_Name" > 
		客户QQ:<input class="easyui-textbox"  style="width:150px" id="Cust_QQ"> 
		电话:<input class="easyui-textbox"  style="width:150px" id="Cust_Telephone"> 
		咨询师:
		 <select id="Staff_Name" class="easyui-combobox" style="width:150px;">   
				    <option >--请选择--</option>  
				</select>
		是否缴费:<select id="Cust_Pay" class="easyui-combobox"  style="width:150px;">   
		   <option value="">--请选择--</option>   
		   <option value="1">否</option>   
		    <option value="0">是</option> 
		   </select> 
		是否有效:<select id="Cust_youxiao" class="easyui-combobox"  style="width:150px;">   
		   <option value="">--请选择--</option>   
		    <option value="1">否</option>   
		    <option value="0">是</option>   
		   </select> 
		是否回访:<select id="Cust_Revisit" class="easyui-combobox"  style="width:150px;">   
		   <option value="">--请选择--</option>   
		    <option value="1">否</option>   
		    <option value="0">是</option>  
		   </select>
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
		<a onclick="addCustomer()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="selectColumn()">设置隐藏列</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="ExportForm()">导出Excel</a>
	</form>
</div>

 <div id="hiddenColumn_dialog" class="easyui-dialog" data-options="title:'设置隐藏列',modal:true,closed:'true',
			buttons:[{
				text:'保存',
				handler:function(){
				saveColumn();<!-- 保存 -->
				init();<!-- 刷新 -->
				closed_hiddenColumn();<!-- 关闭弹窗 -->
				}
			},{
				text:'关闭',
				handler:function(){
				closed_hiddenColumn();
				}
			}]">
	<form id="hiddenColumn_form" class="easyui-form">
	<a href="javascript:void()"  class="easyui-linkbutton" id="isQuanXuan" onclick="ChooseAll()" data-options="iconCls:'icon-edit'">全选</a> 
		<table>
		     <tr>
				<td><input type="checkbox" value="cust_ID"/>客户编号</td>
				<td><input type="checkbox" value="cust_Asker_ID"/>咨询师编号</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Name"/>客户名称</td>
				
				<td><input type="checkbox" value="cust_Age"/>客户年龄</td>
			</tr>
			 <tr>
			    <td><input type="checkbox" value="cust_Gender"/>客户性别</td>
			    
				<td><input type="checkbox" value="cust_Telephone"/>客户电话</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Education"/>客户学历</td>
				
				<td><input type="checkbox" value="cust_Creationtime"/>客户创建时间</td>
			</tr>
			
			<tr>
				<td><input type="checkbox" value="cust_QQ"/>学员QQ</td>
		
				<td><input type="checkbox" value="cust_WeChat"/>微信</td>
			</tr>
			
			<tr>
                <td><input type="checkbox" value="cust_Revisit"/>是否回访（0.未回访1.回访）</td>
			
				<td><input type="checkbox" value="cust_RevisitDays"/>回访时间</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_entrytime"/>进班时间</td>
			
				<td><input type="checkbox" value="cust_Doortime"/>上门时间</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Pay"/>是否缴费（0.缴费1.未交费）</td>
			
				<td><input type="checkbox" value="cust_Paytime"/>缴费时间</td>
			</tr>
			<tr>
			    <td><input type="checkbox" value="cust_zaixianbeizhu"/>在线备注</td>
				<td><input type="checkbox" value="cust_youxiao"/>是否有效（0.是1.否）</td>
			</tr>
		</table>
	</form>
</div>
 

<div id="win" class="easyui-window" title="添加" style="width:300px;height:400px"   
        data-options="iconCls:'icon-save',modal:true,closed:true">   
       <div id="ff" style="margin-left:20px" >
				客户名称:<input class="easyui-textbox" style="width:150px" prompt="121" id="Cust_Name1"> <br/>
				客户性别:<select id="Cust_Gender1" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
		                    <option value="0">是</option>   
						  </select><br/>
				客户年龄:<input class="easyui-textbox"  style="width:150px" id="Cust_Age1"> <br/>
				客户QQ:<input class="easyui-textbox"  style="width:150px" id="Cust_QQ1"> <br/>
				客户微信:<input class="easyui-textbox"  style="width:150px" id="Cust_WeChat1"> <br/>
				客户电话:<input class="easyui-textbox"  style="width:150px" id="Cust_Telephone1"> <br/>
				客户学历:<input class="easyui-textbox"  style="width:150px" id="Cust_Education1"> <br/>
				客户状态:
				    <select id="Cust_state1" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">上学</option>   
						    <option value="0">下学</option>   
						   </select><br/>
				来源渠道:<input class="easyui-textbox"  style="width:150px" id="Cust_channel1"> <br/>
				来源网站:<input class="easyui-textbox"  style="width:150px" id="Cust_website1"> <br/>
				来源关键词:<input class="easyui-textbox"  style="width:150px" id="Cust_laiyuanguanjianzi1"><br/> 
				是否报备:<select id="Cust_preparation1" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">是</option>   
						    <option value="0">否</option>   
						   </select><br/>
				在线备注:<input class="easyui-textbox"  style="width:150px" id="Cust_zaixianbeizhu1"> <br/>
				咨询师：
				<select id="cust_Asker_ID" class="easyui-combobox" style="width:150px;">   
				    <option >--请选择--</option>  
				</select><br/>
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

<div id="win1" class="easyui-window" title="查看" style="width:600px;height:800px"   
        data-options="modal:true,closed:true,resizable:true">   
    <div class="easyui-layout" data-options="fit:true">   
        <div data-options="region:'north',split:true,title:'在线录入'" style="height:400px">   
               <form id="f1">
                 <table cellpadding=7>
                    <tr>
                      <td>姓名</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Name2" name="cust_Name"></td>
                    </tr>
                    <tr>
                      <td>性别</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Gender2" name="cust_Gender"></td>
                    </tr>
                    <tr>
                      <td>年龄</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Age2" name="cust_Age"></td>
                    </tr>
                    <tr>
                      <td>电话</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Telephone2" name="cust_Telephone"></td>
                    </tr>
                    <tr>
                      <td>学历</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Education2" name="cust_Education"></td>
                    </tr>
                    <tr>
                      <td>状态</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_state2" name="cust_state"></td>
                    </tr>
                    <tr>
                      <td>来源渠道</td>
                      <td><input class="easyui-textbox" readonly="readonly"  style="width:150px" id="Cust_channel2" name="cust_channel"></td>
                    </tr>
                    <tr>
                      <td>来源网站</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_website2" name="cust_website"></td>
                    </tr>
                     <tr>
                      <td>来源关键词</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_laiyuanguanjianzi2" name="cust_laiyuanguanjianzi"></td>
                    </tr>
                     <tr>
                      <td>所在区域</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_quyu2" name="cust_quyu"></td>
                    </tr>
                     <tr>
                      <td>学员关注</td>
                      <td><input class="easyui-textbox" readonly="readonly"  style="width:150px" id="Cust_guanzhu2" name="cust_guanzhu"></td>
                    </tr>
                     <tr>
                      <td>来源部门</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_laiyuanbumen2" name="cust_laiyuanbumen"></td>
                    </tr>
                     <tr>
                      <td>学员QQ</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_QQ2" name="cust_QQ"></td>
                    </tr>
                     <tr>
                      <td>微信号</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_WeChat2" name="cust_WeChat"></td>
                    </tr>
                     <tr>
                      <td>是否报备</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_preparation2" name="cust_preparation"></td>
                    </tr>
                     <tr>
                      <td>咨询师</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Asker_ID2" name="cust_Asker_ID"></td>
                    </tr>
                 </table>
               </form>
        </div>   
        <div data-options="region:'center',split:true,title:'咨询师录入'" style="height:500px" >   
               <form id="f2">
                 <table cellpadding=7>
                    <tr>
                      <td>咨询师姓名</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Asker_ID2" name="cust_Asker_ID"></td>
                    </tr>
                    <tr>
                      <td>课程方向</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Course2" name="cust_Course"></td>
                    </tr>
                    <tr>
                      <td>打分</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Scoring2" name="cust_Scoring"></td>
                    </tr>
                    <tr>
                      <td>是否有效</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_youxiao2" name="cust_youxiao"></td>
                    </tr>
                    <tr>
                      <td>无效原因</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_wuxiaoyuanyin2" name="cust_wuxiaoyuanyin"></td>
                    </tr>
                    <tr>
                      <td>是否回访</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Revisit2" name="cust_Revisit"></td>
                    </tr>
                    <tr>
                      <td>首访时间</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_RevisitDays2" name="cust_RevisitDays"></td>
                    </tr>
                    <tr>
                      <td>是否上门</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Door2" name="cust_Door"></td>
                    </tr>
                     <tr>
                      <td>上门时间</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Doortime2" name="cust_Doortime"></td>
                    </tr>
                     <tr>
                      <td>定金金额</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_dingjin2" name="cust_dingjin"></td>
                    </tr>
                     <tr>
                      <td>定金时间</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_dingjinDay2" name="cust_dingjinDay"></td>
                    </tr>
                     <tr>
                      <td>是否缴费</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Pay2" name="cust_Pay"></td>
                    </tr>
                     <tr>
                      <td>缴费时间</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Paytime2" name="cust_Paytime"></td>
                    </tr>
                     <tr>
                      <td>缴费金额</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_money2" name="cust_money"></td>
                    </tr>
                     <tr>
                      <td>是否退费</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Refund2" name="cust_Refund"></td>
                    </tr>
                     <tr>
                      <td>退费原因</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_Refundreason2" name="cust_Refundreason"></td>
                    </tr>
                     <tr>
                      <td>是否进班</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_entry2" name="cust_entry"></td>
                    </tr>
                     <tr>
                      <td>进班时间</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_entrytime2" name="cust_entrytime"></td>
                    </tr>
                     <tr>
                      <td>进班备注</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_notes2" name="cust_notes"></td>
                    </tr>
                     <tr>
                      <td>咨询师备注</td>
                      <td><input class="easyui-textbox" readonly="readonly" style="width:150px" id="Cust_askerbeizhu2" name="cust_askerbeizhu"></td>
                    </tr>
                 </table>
               </form>
        </div>
    </div>   
</div>
<div id="win2" class="easyui-window" title="查看" style="width:600px;height:800px"   
        data-options="modal:true,closed:true,resizable:true">   
    <div class="easyui-layout" data-options="fit:true">   
        <div data-options="region:'north',split:true,title:'在线录入'" style="height:400px">   
               <form id="f3">
                 <table cellpadding=7>
                 <input type="hidden"  id="cust_ID3" name="cust_ID"/>
                    <tr>
                      <td>姓名</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Name3" name="cust_Name"></td>
                    </tr>
                    <tr>
                      <td>性别</td>
                      <td>
                       <select id="Cust_Gender3" name="cust_Gender" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                    <tr>
                      <td>年龄</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Age3" name="cust_Age"></td>
                    </tr>
                    <tr>
                      <td>电话</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Telephone3" name="cust_Telephone"></td>
                    </tr>
                    <tr>
                      <td>学历</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Education3" name="cust_Education"></td>
                    </tr>
                    <tr>
                      <td>状态</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_state3" name="cust_state"></td>
                    </tr>
                    <tr>
                      <td>来源渠道</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_channel3" name="cust_channel"></td>
                    </tr>
                    <tr>
                      <td>来源网站</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_website3" name="cust_website"></td>
                    </tr>
                     <tr>
                      <td>来源关键词</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_laiyuanguanjianzi3" name="cust_laiyuanguanjianzi"></td>
                    </tr>
                     <tr>
                      <td>所在区域</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_quyu3" name="cust_quyu"></td>
                    </tr>
                     <tr>
                      <td>学员关注</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_guanzhu3" name="cust_guanzhu"></td>
                    </tr>
                     <tr>
                      <td>来源部门</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_laiyuanbumen3" name="cust_laiyuanbumen"></td>
                    </tr>
                     <tr>
                      <td>学员QQ</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_QQ3" name="cust_QQ"></td>
                    </tr>
                     <tr>
                      <td>微信号</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_WeChat3" name="cust_WeChat"></td>
                    </tr>
                     <tr>
                      <td>是否报备</td>
                      <td>
                       <select id="Cust_preparation3" name="cust_preparation" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                     <tr>
                      <td>咨询师</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Asker_ID3" name="cust_Asker_ID"></td>
                    </tr>
                 </table>
               </form>
        </div>   
        <div data-options="region:'center',split:true,title:'咨询师录入'" style="height:550px" >   
               <form id="f4">
                 <table cellpadding=7>
                    <tr>
                      <td>课程方向</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Course3" name="cust_Course"></td>
                    </tr>
                    <tr>
                      <td>打分</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Scoring3" name="cust_Scoring"></td>
                    </tr>
                    <tr>
                      <td>是否有效</td>
                      <td>
                      <select id="Cust_youxiao3" name="cust_youxiao" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                    <tr>
                      <td>无效原因</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_wuxiaoyuanyin3" name="cust_wuxiaoyuanyin"></td>
                    </tr>
                    <tr>
                      <td>是否回访</td>
                      <td>
                      <select id="Cust_Revisit3" name="cust_Revisit" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                    <tr>
                      <td>首访时间</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_RevisitDays3" name="cust_RevisitDays"></td>
                    </tr>
                    <tr>
                      <td>是否上门</td>
                      <td>
                      <select id="Cust_Door3" name="cust_Door" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                     <tr>
                      <td>上门时间</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Doortime3" name="cust_Doortime"></td>
                    </tr>
                     <tr>
                      <td>定金金额</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_dingjin3" name="cust_dingjin"></td>
                    </tr>
                     <tr>
                      <td>定金时间</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_dingjinDay3" name="cust_dingjinDay"></td>
                    </tr>
                     <tr>
                      <td>是否缴费</td>
                      <td>
                       <select id="Cust_Pay3" name="cust_Pay" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                     <tr>
                      <td>缴费时间</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Paytime3" name="cust_Paytime"></td>
                    </tr>
                     <tr>
                      <td>缴费金额</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_money3" name="cust_money"></td>
                    </tr>
                     <tr>
                      <td>是否退费</td>
                      <td>
                      <select id="Cust_Refund3" name="cust_Refund" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                     <tr>
                      <td>退费原因</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_Refundreason3" name="cust_Refundreason"></td>
                    </tr>
                     <tr>
                      <td>是否进班</td>
                      <td>
                        <select id="Cust_entry3" name="cust_entry" class="easyui-combobox"  style="width:150px;">   
						   <option value="">--请选择--</option>   
						    <option value="1">否</option>   
						    <option value="0">是</option>  
						   </select>
                      </td>
                    </tr>
                     <tr>
                      <td>进班时间</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_entrytime3" name="cust_entrytime"></td>
                    </tr>
                     <tr>
                      <td>进班备注</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_notes3" name="cust_notes"></td>
                    </tr>
                     <tr>
                      <td>咨询师备注</td>
                      <td><input class="easyui-textbox"  style="width:150px" id="Cust_askerbeizhu3" name="cust_askerbeizhu"></td>
                    </tr>
                 </table>
               </form>
        </div>
    
   <div data-options="region:'south',split:true" style="height:50px" >
    <a onclick="updateSave()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">保存</a>  
    <a onclick="updateNo()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-no'">取消</a>   
   </div>
   </div>
</div>
</body>
</html>