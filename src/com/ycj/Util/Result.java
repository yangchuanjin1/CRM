package com.ycj.Util;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.ycj.entity.Modules;

public class Result {
    public boolean success;
    public String message;
    public String remark;
    public static String toClient(boolean suc,Object msg){
        Result r = new Result();
        r.success =suc;
        r.message = msg.toString();
        r.remark="";
        Gson t = new Gson();
        return t.toJson(r);
    }
    public static String toClient(boolean suc,Object msg,String rmk){
        Result r = new Result();
        r.success =suc;
        r.message = msg.toString();
        r.remark=rmk;
        Gson t = new Gson();
        return t.toJson(r);
    }
    
    /**
	 * 将tree变成选中状态
	 * @param totalList
	 * @param list
	 * @return
	 */
	/*public static  ArrayList<Modules> checkTree(ArrayList<Modules> totalList,ArrayList<Modules> Roleslist){
		System.out.println(3);
		System.out.println(totalList+"所有");//所有
		System.out.println(Roleslist+"拥有");//角色的id查询出来的模块
		for (int i = 0; i < Roleslist.size(); i++) {
			 for (int j = 0; j < totalList.size(); j++) {
				if(totalList.get(j).getId()==Roleslist.get(i).getId()) {
					System.out.println(totalList.get(j).getM_parentid()+"父id");
					if(totalList.get(j).getM_parentid()!=0) {
						System.out.println("我进来了");
						totalList.get(j).setChecked(true);
					}					  					
				}
			}
		}
		return totalList;
	}*/
}