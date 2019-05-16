<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>模块管理</title>
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
</head>
<script type="text/javascript">
	$(function(){
		$("#t").tree({url:"selectMenuTreesYangAll",
           	lines:true,
           	onContextMenu: function(e, node){
					e.preventDefault();
					// 查找节点
					$('#t').tree('select', node.target);
					// 显示快捷菜单
					$('#mm').menu('show', {
						left: e.pageX,
						top: e.pageY
					});
				}
           });
	});
	function append(){
		var node=$("#t").tree("getSelected");
		   if(node!=""&&node!=null){
		      $("#parentModalName").text(node.text);
		      $("#addModalWindow").window("open");
		   }
		   else{
		      $.messager.alert('提示','请选择父节点');
		   }
	}
	/* 添加 */
	function submitModal(){
		  var flag=$("#addModalForm").form("validate");
		  var node=$("#t").tree("getSelected"); 
		  var ModalWeight=$("#ModalWeight").val();
		  if(/^[-]\d+$/i.test(ModalWeight)){
		  	$.messager.alert('提示','权重不能为负');
		  	return false;
		  }
		  var ModalURL=$("#ModalURL").val();
		  var ModalName=$("#ModalName").val();
		  if(flag){
				  $.post('insertModulesYang',
				   {
					  Modules_Name:ModalName,
				      Modules_ParentId:node.id,
				      Modules_Path:ModalURL,
				      Modules_Weight:ModalWeight
				   },function(res){
				      $("#addModalWindow").window("close");
				      $("#t").tree("reload");
				       $.messager.alert('提示','新增成功');
				   },"json"
				  );
		         }
		}
	/* 删除 */
	function deleteTree(){
		$.messager.confirm("确定","确定要删除吗？",function(r){
			if(r){
				var row=$("#t").tree("getSelected");
				if(row!=""&&row!=null){
				var id=row.id;
				if(row.text==""){
					 $.messager.alert('提示','请选择节点');
				   }
				else{
					$.post('deleteModulesYang',{
						Modules_ID:id
						},function(res){
							if(res>0){
								 $("#t").tree("reload");
								 $.messager.alert('提示','删除成功');
							}
						},"json"
					);
				}
			}else{
		    $.messager.alert('提示','请选择要删除的节点');
		   }
		   }});
	}
	/*  修改*/
	function updateTree(){
	     var node=$("#t").tree("getSelected");
	     alert(node.modules_Path);
	     document.getElementById("modules_Id").value=node.id;
	     document.getElementById("modules_weight").value=node.modules_Weight;
	     document.getElementById("modules_Name").value = node.text;
	     document.getElementById("modules_Path").value=node.modules_Path;
	     alert($("#modules_Path").val());
	     $("#updateModalWindow").window("open");
	  }
	function submitModalFrom(){
		$.post('updateModulesYang',
				   {
					  Modules_Name:$("#modules_Name").val(),
					  Modules_ID:$("#modules_Id").val(),
				      Modules_Path:$("#modules_Path").val(),
				      Modules_Weight:$("#modules_weight").val()
				   },function(res){
					   if(res>0){
						   $("#updateModalWindow").window("close");
						      $("#t").tree("reload");
						       $.messager.alert('提示','修改成功');
					   }
				      
				   },"json"
				  );
		         }
</script>
<body>
	<div class="" data-options="title:'模块管理'" style="width:500px;height: 700px;">
		<ul id="t"></ul>
	</div>
		<div id="mm" class="easyui-menu" style="width:120px;">
		<div onclick="append()" data-options="iconCls:'icon-add'">追加</div>
		<div onclick="updateTree()" data-options="iconCls:'icon-add'">修改</div>
		<div onclick="deleteTree()" data-options="iconCls:'icon-remove'">移除</div>
	</div>
	
	<!-- 新增模块 -->
	<div id="addModalWindow" class="easyui-window" style="width: 500px;height: 300px;padding: 10px;" data-options="modal:true,closed:true,title:'新增模块信息'"> 
		      <form id="addModalForm">
		            <table cellpadding="5">
		               <tr>
		                 <td>父节点名称：</td>
		                 <td><div id="parentModalName"></div></td>
		               </tr>
		               <tr>
		                 <td>权重：</td>
		                 <td><input type="text" class="easyui-textbox" name="ModalWeight" id="ModalWeight" value="" required="required"/></td>
		               </tr>
		               <tr>
		                 <td>URL：</td>
		                 <td><input type="text" class="easyui-textbox" name="ModalURL" id="ModalURL" value="" required="required"/></td>
		               </tr>
		               <tr>
		                 <td>模块名称：</td>
		                 <td><input type="text" class="easyui-textbox" name="ModalName" id="ModalName" value="" required="required"/></td>
		               </tr>
		            </table>
		      </form>
		      <div style="text-align:center;padding:20px">
                <a href="javascript:void(0)" class="easyui-linkbutton" type="button" onclick="submitModal()">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearModal()">取消</a>        
              </div>
		</div>
	<!--修改  -->
	<div id="updateModalWindow" class="easyui-window" style="width: 500px;height: 300px;padding: 10px;" data-options="modal:true,closed:true,title:'修改模块信息'"> 
		      <form id="updateModalForm">
		            <table cellpadding="5">
		               <input type="hidden" id="modules_Id"/>
		               <tr>
		                 <td>权重：</td>
		                 <td><input type="text" id="modules_weight" value="" required="required"/></td>
		               </tr>
		               <tr>
		                 <td>URL：</td>
		                 <td><input type="text" id="modules_Path" value="" required="required"/></td>
		               </tr>
		               <tr>
		                 <td>模块名称：</td>
		                 <td><input type="text" id="modules_Name" value="" required="required"/></td>
		               </tr>
		            </table>
		      </form>
		      <div style="text-align:center;padding:20px">
                <a href="javascript:void(0)" class="easyui-linkbutton" type="button" onclick="submitModalFrom()">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearModalFrom()">取消</a>        
              </div>
		</div>
	
</body>
</html>