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
		      alert("请选择父节点");
		   }
	}
	function submitModal(){
		  var flag=$("#addModalForm").form("validate");
		  var node=$("#t").tree("getSelected"); 
		  var ModalWeight=$("#ModalWeight").val();
		  if(/^[-]\d+$/i.test(ModalWeight)){
		  	alert("权重不能为负");
		  	return false;
		  }
		  var ModalURL=$("#ModalURL").val();
		  var ModalName=$("#ModalName").val();
		  if(flag){
				  $.post('',
				   {
				        name:ModalName,
						parentId:node.id,
						path:ModalURL,
						weight:ModalWeight,
						token:token
				   },function(res){
				      $("#addModalWindow").window("close");
				      $("#t").tree("reload");
				       alert("新增成功");
				   },"json"
				  );
		         }
		}
</script>
<body>
	<div class="" data-options="title:'模块管理'" style="width:500px;height: 700px;">
		<ul id="t"></ul>
	</div>
		<div id="mm" class="easyui-menu" style="width:120px;">
		<div onclick="append()" data-options="iconCls:'icon-add'">追加</div>
		<div onclick="remove()" data-options="iconCls:'icon-remove'">移除</div>
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
	
</body>
</html>