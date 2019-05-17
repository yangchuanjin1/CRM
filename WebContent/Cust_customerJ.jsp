<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>网络咨询师学生信息</title>
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<script type="text/javascript">

$(function(){
	init();
	
}) 
/*查询数据*/
function init(){
	$('#dg').datagrid({    
	    url:'selectCust_customer',    
	    method:'post',
	    pagination:true,
	    toolbar:"#r",
	   queryParams:{
	    	Cust_Name:$("#Cust_Name").val(),
	    	Cust_Telephone:$("#Cust_Telephone").val(),
	    	Cust_QQ:$("#Cust_QQ").val(),
	    	minCust_Doortime:$("#minCust_Doortime").val(),
	    	maxCust_Doortime:$("#maxCust_Doortime").val()
	    } 
	}); 
} 

  /*操作列*/
  function caozuo(value,row,index){
	
	
	  return "<a href='javascript:void(0)' onclick='chakanCust_customer("+index+")'>查看</a>  <a href='javascript:void(0)' onclick='updateCust_customer("+index+")'>修改</a>  <a href='javascript:void(0)' onclick='deleteCust_customer("+index+")'>删除</a>";
}  
  


//添加

function insert(){
	$("#tpd-tianjia-dialog").dialog("open");
}

function insertSubmission(){
	$.ajax({
		type:"post",
		url:"insertCust_customerJiang",
		datatype:"json",
		data:{
			"Cust_Name":$("#insert-Cust_Name").val(),
			"Cust_Age":$("#insert-Cust_Age").val(),
			"Cust_Gender":$("#insert-Cust_Gender").val(),
			"Cust_Telephone":$("#insert-Cust_Telephone").val(),
			"Cust_Education":$("#insert-Cust_Education").val(),
			"Cust_state":$("#insert-Cust_state").val(),
			"Cust_channel":$("#insert-Cust_channel").val(),
			"Cust_website":$("#insert-Cust_website").val(),
			"Cust_QQ":$("#insert-Cust_QQ").val(),
			"Cust_WeChat":$("#insert-Cust_WeChat").val(),
			"Cust_preparation":$("#insert-Cust_preparation").val(),
			"Cust_zaixianbeizhu":$("#insert-Cust_zaixianbeizhu").val()
		},
		success:function(res){
			if(res>0){
				$("#dg").datagrid("reload");
				$.messager.alert('提示','添加成功');
				$("#tpd-tianjia-form").form("clear"); 
			}
		}
	})
}
/*添加的取消方法*/
	function insertReset(){
		$("#tpd-tianjia-form").form("reset")
	}
	/*查看*/
	/* function chakanCust_customer(index){
		var arr=$("#tpd_datagrid").datagrid("getData");//获取数据表格加载完成时返回的数据
		var row=arr.rows[index];//根据我们所选中的行的下标获取选中行的数据
		
		$("#tpd-chakan-form").form("load",row);//把我们获取的行中的数据填充但form表单中去
		$("#tpd-chakan-dialog").dialog("open");//打开我们的窗口
	} */
	
	/*打开设置隐藏列对话框*/
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
	            $('#dg').datagrid('showColumn', checkeds[i]); //显示相应的列
	        }
	    }
	    
	    var unChecks = new Array();
	    if (unCheckValue != null && unCheckValue != "") {
	        unChecks = unCheckValue.split(',');
	        for (var i = 0; i < unChecks.length; i++) {
	            $('#dg').datagrid('hideColumn', unChecks[i]); //隐藏相应的列
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
				var header = $('#dg').datagrid('options').columns[0];//获取数据的第一行表头
				var fields="";
				for (var i = 1; i < header.length-1; i++) {
				var field = header[i].field;
				var hiddenFlag = header[i].hidden;//获取表头的隐藏列
				if (!hiddenFlag) {//如果字段不是隐藏列的话
				var dh = i == (header.length - 1) ? "" : ",";//将表头的字段进行分割
				fields = fields + field + dh;
				}
				
				}
				var row = $("#dg").datagrid("getSelections"); // 获取所有选中的行
				var stulist='';
				if(row==null || row==''){
					var data=$('#dg').datagrid('getData');
					stulist=JSON.stringify(data.rows);
					
				}else{
					stulist=JSON.stringify(row);
				}
				/* alert(stulist); */
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
	       /*查看*/
		   function chakanCust_customer(index){
			 var data=$("#dg").datagrid("getData");
			 var row=data.rows[index];
			 $("#tpd-chakan-form").form("load",row);
			 $("#tpd-chakan-dialog").dialog("open");
			 
			}  
</script>

<body>
<table class="easyui-datagrid"  id="dg">   
    <thead>   
        <tr>   
            <th data-options="field:'ck',checkbox:true">
            <th data-options="field:'cust_ID',width:100">客户编号</th>   
            <th data-options="field:'cust_Name',width:100">客户名称</th>   
            <th data-options="field:'cust_Age',width:100,align:'right'">客户年龄</th> 
            <th data-options="field:'cust_Gender',width:100">客户性别</th>  
            <th data-options="field:'cust_Telephone',width:150">客户电话</th>  
            <th data-options="field:'cust_Education',width:100">客户学历</th> 
            <th data-options="field:'cust_state',width:100">客户状态</th> 
            <th data-options="field:'cust_channel',width:100">客户来源渠道</th> 
            <th data-options="field:'cust_website',width:100">客户来源网站</th> 
            <th data-options="field:'cust_QQ',width:100">客户QQ</th> 
            <th data-options="field:'cust_WeChat',width:100">客户微信</th> 
            <th data-options="field:'cust_mailbox',width:100">客户邮箱</th> 
            <th data-options="field:'cust_Creationtime',width:100">客户创建的时间</th> 
            <th data-options="field:'cust_Course',width:100">课程方向</th> 
            <th data-options="field:'cust_Scoring',width:100">客户的质量</th> 
            <th data-options="field:'cust_Revisit',width:100">是否回访）</th> 
            <th data-options="field:'cust_RevisitDays',width:100">回访时间</th> 
            <th data-options="field:'cust_Door',width:100">是否上门</th> 
            <th data-options="field:'cust_Doortime',width:100">上门时间</th> 
            <th data-options="field:'cust_Pay',width:100">是否缴费</th> 
            <th data-options="field:'cust_Paytime',width:100">缴费时间</th> 
            <th data-options="field:'cust_money',width:100">缴费金额</th> 
            <th data-options="field:'cust_Refund',width:100">是否退费</th> 
            <th data-options="field:'cust_Refundreason',width:100">退费原因</th> 
            <th data-options="field:'cust_entry',width:100">是否进班</th> 
            <th data-options="field:'cust_entrytime',width:100">进班时间</th> 
            <th data-options="field:'cust_notes',width:100">进班备注</th> 
            <th data-options="field:'cust_Region',width:100">客户所在地区</th> 
            <th data-options="field:'cust_preparation',width:100">是否报备</th> 
            <th data-options="field:'cust_Asker_ID',width:100">咨询师编号</th> 
            <th data-options="field:'cust_zaixianbeizhu',width:100">在线备注</th> 
            <th data-options="field:'caozuo',formatter:caozuo">操作</th>    
        </tr>   
    </thead>   
</table>  

<!--  模糊搜索  -->
<div id="r">
客户姓名<input class="easyui-textbox" style="width:300px" id="Cust_Name"> 
客户电话<input class="easyui-textbox" style="width:300px" id="Cust_Telephone"> 
QQ<input class="easyui-textbox" style="width:300px" id="Cust_QQ"> 
开始上门时间：<input class="easyui-textbox" style="width:300px" id="minCust_Doortime"> ~
结束上门时间：<input class="easyui-textbox" style="width:300px" id="maxCust_Doortime"> 
<a onclick="init()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>  
<a href="javascript:insert()" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
<!-- <a href="javascript:shezhi()" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">设置</a> -->
<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="selectColumn()">动态显示列</a>
<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="ExportForm()">导出Excel</a>
</div> 




<!-- 添加 -->
 <div id="tpd-tianjia-dialog" class="easyui-dialog" data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:[{
				text:'提交',
				handler:function(){insertSubmission()}
			},{
				text:'重置',
				handler:function(){insertReset()}
			}]">



<!-- <body class="easyui-layout">   
    <div data-options="region:'north',title:'网络咨询师模块',split:true" style="height:100px;"></div>      
    <div data-options="region:'west',title:'网络咨询师管理',split:true" style="width:300px;"></div>   
    <div data-options="region:'center',title:'网络咨询师添加学生信息'" style="padding:5px;background:#eee;"> </div>
    -->
  <!--   <div class="eayui-window" align="center">  </div> -->
    <form id="tpd-tianjia-form" class="easyui-form" >
			<table class="eayui-dialog">
				<tr>
					<td>客户名称：</td>
					<td><input type="text" name="Cust_Name" id="insert-Cust_Name" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户年龄：</td>
					<td><input type="text" name="Cust_Age" id="insert-Cust_Age" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户性别：</td>
					<td><input type="text" name="Cust_Gender" id="insert-Cust_Gender" class="easyui-textbox"></td>
				</tr>
					<tr>	
					<td>客户电话：</td>
					<td><input type="text" name="Cust_Telephone" id="insert-Cust_Telephone" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户学历：</td>
					<td><input type="text" name="Cust_Education" id="insert-Cust_Education" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户状态：</td>
					<td><input type="text" name="Cust_state" id="insert-Cust_state" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户来源渠道：</td>
					<td><input type="text" name="Cust_channel" id="insert-Cust_channel" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户来源网站：</td>
					<td><input type="text" name="Cust_website" id="insert-Cust_website" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户QQ：</td>
					<td><input type="text" name="Cust_QQ" id="insert-Cust_QQ" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户微信：</td>
					<td><input type="text" name="Cust_WeChat" id="insert-Cust_WeChat" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>是否报备：</td>
					<td><input type="text" name="Cust_preparation" id="insert-Cust_preparation" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>在线备注：</td>
					<td><input type="text" name="Cust_zaixianbeizhu" id="insert-Cust_zaixianbeizhu" class="easyui-textbox"></td>
				</tr>
			</table>
<!-- 				<a href="javascript:insert()" class="easyui-linkbutton" data-options="iconCls:'icon-add'" onclick="insertCust_customerJ()">添加</a> -->
		</form>
		</div>
		
      

	
	<!-- 设置隐藏列 -->
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
				
				<td><input type="checkbox" value="cust_state"/>客户状态</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_channel"/>来源渠道</td>
				
				<td><input type="checkbox" value="cust_website"/>来源网址</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_QQ"/>学员QQ</td>
		
				<td><input type="checkbox" value="cust_WeChat"/>微信</td>
			</tr>
			<tr>
			    <td><input type="checkbox" value="cust_mailbox"/>客户邮箱</td>
			
				<td><input type="checkbox" value="cust_Creationtime"/>客户创建时间</td>
			</tr>
			<tr>
			    <td><input type="checkbox" value="cust_Course"/>课程方向</td> 
			
				<td><input type="checkbox" value="cust_Scoring"/>客户的质量</td>
			</tr>
		
			<tr>
                <td><input type="checkbox" value="cust_Revisit"/>是否回访</td>
			
				<td><input type="checkbox" value="cust_RevisitDays"/>回访时间</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Door"/>是否上门</td>
			
				<td><input type="checkbox" value="cust_Doortime"/>上门时间</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Pay"/>是否缴费</td>
			
				<td><input type="checkbox" value="cust_Paytime"/>缴费时间</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_money"/>缴费金额</td>
			
				<td><input type="checkbox" value="cust_Refund"/>是否退费</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Refundreason"/>退费原因</td>
			
				<td><input type="checkbox" value="cust_entry"/>是否进班</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_entrytime"/>进班时间</td>
			
		         <td><input type="checkbox" value="cust_notes"/>进班备注</td> 
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Region"/>客户所在地区</td>
			
				<td><input type="checkbox" value="cust_preparation"/>是否报备</td>
			</tr>
			<tr>
				<td><input type="checkbox" value="cust_Asker_ID"/>咨询师编号</td>
			
				<td><input type="checkbox" value="cust_zaixianbeizhu"/>在线备注</td>
			</tr>  
		</table>
	</form>
</div>

<!--  查看-->
 <div id="tpd-chakan-dialog" class="easyui-dialog" data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
 <form id="tpd-chakan-form" class="easyui-form" >
			<table class="eayui-dialog">
				<tr>
					<td>客户名称：</td>
					<td><input type="text" name="Cust_Name" id="insert-Cust_Name" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户年龄：</td>
					<td><input type="text" name="Cust_Age" id="insert-Cust_Age" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户性别：</td>
					<td><input type="text" name="Cust_Gender" id="insert-Cust_Gender" class="easyui-textbox"></td>
				</tr>
					<tr>	
					<td>客户电话：</td>
					<td><input type="text" name="Cust_Telephone" id="insert-Cust_Telephone" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户学历：</td>
					<td><input type="text" name="Cust_Education" id="insert-Cust_Education" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户状态：</td>
					<td><input type="text" name="Cust_state" id="insert-Cust_state" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户来源渠道：</td>
					<td><input type="text" name="Cust_channel" id="insert-Cust_channel" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户来源网站：</td>
					<td><input type="text" name="Cust_website" id="insert-Cust_website" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户QQ：</td>
					<td><input type="text" name="Cust_QQ" id="insert-Cust_QQ" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>客户微信：</td>
					<td><input type="text" name="Cust_WeChat" id="insert-Cust_WeChat" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>是否报备：</td>
					<td><input type="text" name="Cust_preparation" id="insert-Cust_preparation" class="easyui-textbox"></td>
				</tr>
				<tr>
					<td>在线备注：</td>
					<td><input type="text" name="Cust_zaixianbeizhu" id="insert-Cust_zaixianbeizhu" class="easyui-textbox"></td>
				</tr>
			</table>

		</form>
</div>
  
</body>
</html>