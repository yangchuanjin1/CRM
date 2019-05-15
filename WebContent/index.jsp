<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>龙行天下集团</title>
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/icon.css">
<link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.3/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>
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
//树状结构的节点是否已在中部显示，参数re是标题，html 是路径
 /* function navTab(re, html) {
	var flag = $("#tt").tabs('exists', re);
	$('#treeUlId').tree({ //和前边加载数据的代码中的"treeUIId"参数,保持一致即可
	onSelect:function(node){
	var isLeaf = $('#treeUlId').tree('isLeaf',node.target); //是否是叶子节点
	if (isLeaf) {//只有叶子节点才会在选项卡中创建选项页（每个选项页对应1个功能）
		if(!flag) {
			$('#tt').tabs('add', { //在选项卡中，创建1个选项页
				title: re,   //选项卡中，选项页的标题（在同一个选项卡中，选项页需要保持一致）。
				closable: true,
				content: "<iframe style='width:100%;height:600px;' src='"+html+"'/>"    //此处做了调整，推荐使用iframe的方式实现
			});
		 } else {
		 	$("#tt").tabs('select', re); //直接选中title对应的选项卡
		  }
	}
	}
});
}  */ 
</script>
</head>
<body>
		
    <div class="easyui-layout" style="width:100%;height:700px;">
        <div data-options="region:'north'" style="height:50px">
        	CRM系统&nbsp;&nbsp;&nbsp;  欢迎您:&nbsp;&nbsp;<span id="spUName">
        	</span>
        	<a href="javascript:tuichu()">&nbsp;安全退出</a>
        </div>
        <div data-options="region:'south',split:true" style="height:50px;"></div>
        <!--<div data-options="region:'east',split:true" title="East" style="width:100px;"></div>-->
        <div data-options="region:'west',split:true" title="导航应用" style="width:150px;">
           <div><!--这个地方显示树状结构-->
             	<ul id="menuTree" class="easyui-tree"></ul>
           </div>
        </div>
        <div id="centerTabs" data-options="region:'center',iconCls:'icon-ok'" style="width: 530px;">
            <div id="tt" class="easyui-tabs"> <!--这个地方采用tabs控件进行布局-->
            
            </div>
        </div>
    </div>
	</body>
</html>