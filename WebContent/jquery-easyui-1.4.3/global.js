var globalData={
		setUserInfo:function(UsersID,LoginName,RolesName){
			sessionStorage.setItem("UsersID",UsersID);
			sessionStorage.setItem("LoginName",LoginName);
			sessionStorage.setItem("RolesName",RolesName);
		},
		getCurUsersID:function(){
			return sessionStorage.getItem("UsersID");
		},
		getCurLoginName:function(){
			return sessionStorage.getItem("LoginName");
		},
		/*getCurLoginName:function(){
			return sessionStorage.getItem("LoginName");
		},*/
}
document.write('<link id="myTheme" rel="stylesheet" href="jquery-easyui-1.4.3/themes/icon.css" type="text/css"/>');
document.write('<link rel="stylesheet" href="jquery-easyui-1.4.3/themes/default/easyui.css" type="text/css"/>');
document.write('<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.min.js" ></script>');
document.write('<script type="text/javascript" src="jquery-easyui-1.4.3/jquery.easyui.min.js" ></script>');
document.write('<script src="jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>');