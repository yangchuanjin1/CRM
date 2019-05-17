<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
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
</head>
<script type="text/javascript">
$(function(){
	intal();
})
	function intal(){
		$("#asker-datagrid").datagrid({
			   url:'selectAskerAllCountYang',
			   method:"post",
			   toolbar:"#r",
			   pagination:true,
			   singleSelect:true,
			   queryParams:{
				   staff_Name:$("#staff_Name").val(),
				   zixunshiName:$("#signln_status").combobox("getValue")
			   }
			   });
	}
	function staff(value,row,index){
    	return row.staff.staff_Name;
    }
	function tianjia(){
		$('#asker-tianjia-combobox').combobox({    
		    url:'selectStaffAndAsker', 
		    method:"post",
		    valueField:'staff_ID',    
		    textField:'staff_Name'   
		});
		$("#asker-add").dialog("open");
	}
	function askeradd(){
		var book=$("#asker-tianjia-combobox").combobox("getValue");//获取select下拉框的值
		if(book=="--请选择--"){//判断一下下拉框的值是否等于请选择
			alert("姓名不能为空");
		}
		$.ajax({
			type:"post",//提交方式
			url:"insertAskerYang",//提交路径
			datatype:"json",//格式
			data:{//传递的参数
				"Asker_Name":$("#asker_Name").val(),
				"Asker_Weight":$("#asker_Weight").val(),
				"Asker_Staff_ID":book
			},
			success:function(res){//回调
				if(res>0){//判断回调的，受影响的行数是否大于零
					$("#asker-datagrid").datagrid("reload");//刷新表格
					$.messager.alert('提示','添加成功');//提示信息
					$("#asker-add").dialog("close");//关闭窗口
				}
			}
		})
	}
	function staffCaozuo(value,row,index){
    	return "<a href='javascript:updateAsker("+index+")'>编辑</a> <a href='javascript:deleteAsker("+index+")'>删除</a>"
    }
</script>
<body>
<table id="asker-datagrid" class="easyui-datagrid">
	<thead>   
        <tr>   
            <th data-options="field:'asker_ID'">编号</th>   
            <th data-options="field:'staff',formatter:staff">姓名</th>   
            <th data-options="field:'asker_Name'">级别</th>
            <th data-options="field:'asker_Weight'">权重</th>
            <th data-options="field:'staffCaozuo',formatter:staffCaozuo">操作</th>
        </tr>   
    </thead>
</table>
<div id="r">
   姓名：<input class="easyui-textbox" id="staff_Name" style="width:150px">
   级别：<select id="signln_status" class="easyui-combobox"  style="width:150px;">   
   	<option value="">--请选择--</option>   
    <option value="金牌咨询师">金牌咨询师</option>   
    <option value="高级咨询师">高级咨询师</option>
    <option value="中级咨询师">中级咨询师</option>
    <option value="咨询师">咨询师</option> 
   </select>
    <a onclick="intal()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>
    <a onclick="tianjia()" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>  
  </div>
  <div id="asker-add" class="easyui-dialog" title="咨询师添加"
		style="width: 400px; height: 200px;"
		data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">
		<form id="" class="easyui-form">
			<table>
				<div>
					<label for="name">姓名：</label>
					<select id="asker-tianjia-combobox" class="easyui-combobox" style="width: 100px">
						<option>--请选择--</option>
					</select> 
				</div>
				<div>
					<label for="name">级别：</label>
					<select id="asker_Name" class="easyui-combobox" name="dept" style="width:200px;">   
					    <option value="咨询师">咨询师</option>   
					    <option value="金牌咨询师">金牌咨询师</option>   
					    <option value="高级咨询师">高级咨询师</option>   
					    <option value="中级咨询师">中级咨询师</option>
					</select>
				</div>
				<div>
					<label for="name">权重：</label>
					<input class="easyui-textbox" id="asker_Weight" style="width:150px" required="required">
				</div>
				<div>
					<a id="btn" href="javascript:askeradd()"
						class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
				</div>
			</table>
		</form>
	</div>
  
  
</body>
</html>