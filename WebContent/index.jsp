<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>龙行天下集团</title>
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
<script>
	function tuichu(){
		$.messager.confirm("确定","您确定要退出吗？",function(r){
			if(r){
				globalDate.tuichu();
			}
		});
	}
	 $(function(){
		var Staff_Name ='<%= session.getAttribute("Staff_Name")%>';
		$("#spUName").text(Staff_Name);
		var staffid='<%= session.getAttribute("Staff_ID")%>';
		if(staffid!=null){
			$('#menuTree').tree({    
			    url:'selectMenuTrees',
			    method:"post",
			    queryParams:{
			    	staffid:staffid
			    },
			    onClick:function(node){
					 alert(node.modules_Path);  // 在用户点击的时候提示
					var flag = $("#tt").tabs('exists', node.text);
					var isLeaf = $('#menuTree').tree('isLeaf',node.target);
					if (isLeaf) {
						if(!flag) {
							$('#tt').tabs('add', { //在选项卡中，创建1个选项页
								title: node.text,   //选项卡中，选项页的标题（在同一个选项卡中，选项页需要保持一致）。
								closable: true,
								 content: "<iframe style='width:100%;height:600px;' src='"+node.modules_Path+"'/>"    //此处做了调整，推荐使用iframe的方式实现 
							});
						 } else {
						 	$("#tt").tabs('select', node.text); //直接选中title对应的选项卡
						  }
					}
				}
			});
		} 
	});
	 function shezhimibao(){
		 $("#congzhimibao-window").window("open");
	 }
	 function Chongzhimibao(){
		 var staffid='<%= session.getAttribute("Staff_ID")%>';
		 $.ajax({
			 type:"post",//提交方式
				url:"updateStaffMiBaoYang",//提交路径
				datatype:"json",//格式
				data:{//传递的参数
					"Staff_ID":staffid,
					"Staff_ProtecMtel":$("#Staff_ProtecMtel").val(),
					"Staff_ProtectEmail":$("#Staff_ProtectEmail").val()
				},
				success:function(res){//回调
					if(res>0){//判断回调的，受影响的行数是否大于零
						$.messager.alert('提示','设置成功');//提示信息
						$("#congzhimibao-window").window("close");//关闭窗口
					}
				}
		 })
	 }
	 function shezhimima(){
		 $("#congzhimima-window").window("open");
	 }
	 function Chongzhimima(){
		 var staffid='<%= session.getAttribute("Staff_ID")%>';
		 $.ajax({
			 type:"post",//提交方式
				url:"selectStaffMiMaPassYang",//提交路径
				datatype:"json",//格式
				data:{//传递的参数
					"Staff_ID":staffid,
					"Staff_Password":$("#Staff_Password").val()
				},
				success:function(res){//回调
					if(res>0){//判断回调的，受影响的行数是否大于零
						$.ajax({
							 type:"post",//提交方式
								url:"updateStaffMiMaPassYang",//提交路径
								datatype:"json",//格式
								data:{//传递的参数
									"Staff_ID":staffid,
									"Staff_Password":$("#Staff_Passwordxin").val()
								},success:function(res){//回调
									if(res>0){
										$.messager.alert('提示','设置成功');//提示信息
										$("#congzhimima-window").window("close");//关闭窗口
									}
								}
						});
					}else{
						$.messager.alert('提示','旧密码不正确');//提示信息
					}
				}
		 })
	 }
	 /*签到*/
	 function qiandao(){
		 var staffid='<%= session.getAttribute("Staff_ID")%>';
		 $.ajax({
			 type:"post",//提交方式
				url:"insertSigninYang",//提交路径
				datatype:"json",//格式
				data:{//传递的参数
					"Staff_ID":staffid
				},success:function(res){//回调
					if(res>0){
						$.messager.alert('提示','签到成功');//提示信息
					}
				}
		});
	 }
</script>
</head>
<body>

	<div class="easyui-layout" style="width: 100%; height: 700px;">
		<div data-options="region:'north'" style="height: 50px">
			CRM系统&nbsp;&nbsp;&nbsp; 欢迎您:&nbsp;&nbsp;<span id="spUName"> </span> <a
				href="javascript:tuichu()">&nbsp;安全退出</a> <a
				href="javascript:shezhimibao()" class="easyui-linkbutton">&nbsp;设置密保</a>
			<a href="javascript:shezhimima()" class="easyui-linkbutton">&nbsp;重置密码</a>
			<a href="javascript:qiandao()" class="easyui-linkbutton">&nbsp;签到</a>
		</div>
		<div data-options="region:'south',split:true" style="height: 50px;"></div>
		<!--<div data-options="region:'east',split:true" title="East" style="width:100px;"></div>-->
		<div data-options="region:'west',split:true" title="导航应用"
			style="width: 150px;">
			<div>
				<!--这个地方显示树状结构-->
				<ul id="menuTree" class="easyui-tree"></ul>
			</div>
		</div>
		<div id="centerTabs" data-options="region:'center',iconCls:'icon-ok'"
			style="width: 530px;">
			<div id="tt" class="easyui-tabs">
				<!--这个地方采用tabs控件进行布局-->

			</div>
		</div>
	</div>
	<!-- 设置密保 -->
	<div id="congzhimibao-window" class="easyui-window"
		data-options="modal:true,closed:true,title:'重置密码'"
		style="width: 500px; height: 300px; padding: 20px;">
		<form id="congzhimibao" style="padding: 20px;">
			<input type="hidden" name="staff_ID" id="chong-staff_ID" />
			请输入密保手机号:<input type="text" class="easyui-textbox"
				id="Staff_ProtecMtel" value="" required="required" /><br>
			请输入密保邮箱:<input type="text" class="easyui-textbox"
				id="Staff_ProtectEmail" value="" required="required" />
		</form>
		<div style="text-align: center; padding: 20px">
			<a href="javascript:void(0)" class="easyui-linkbutton" type="button"
				onclick="Chongzhimibao()">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="javascript:void(0)" class="easyui-linkbutton"
				onclick="clearJsFrom()">取消</a>
		</div>
	</div>
	<!-- 重置密码 -->
	<div id="congzhimima-window" class="easyui-window"
		data-options="modal:true,closed:true,title:'重置密码'"
		style="width: 500px; height: 300px; padding: 20px;">
		<form id="congzhimima" style="padding: 20px;">
			<input type="hidden" name="staff_ID" id="chong-staff_ID" /> 请输入旧密码:<input
				type="text" class="easyui-textbox" id="Staff_Password" value=""
				required="required" /><br> 请输入新密码:<input type="text"
				class="easyui-textbox" id="Staff_Passwordxin" value=""
				required="required" />
		</form>
		<div style="text-align: center; padding: 20px">
			<a href="javascript:void(0)" class="easyui-linkbutton" type="button"
				onclick="Chongzhimima()">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="javascript:void(0)" class="easyui-linkbutton"
				onclick="clearJsFrom()">取消</a>
		</div>
	</div>

</body>
</html>