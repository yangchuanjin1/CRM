package com.ycj.Util;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.util.StringUtils;
import com.ycj.entity.Modules;

public class TreeNoteUtil {
	
	public final static List<Modules> getFatherNode(List<Modules> treesList){
        List<Modules> newTrees = new ArrayList<Modules>();
        for (Modules mt : treesList) {
           /* if (StringUtils.isEmpty(mt.getModules_ParentId())) {//���pIdΪ�գ���ýڵ�Ϊ���ڵ�
                //�ݹ��ȡ���ڵ��µ��ӽڵ�
                mt.setChildren(getChildrenNode(mt.getModules_ParentId(), treesList));
                newTrees.add(mt);
            }*/
        }
        return newTrees;
    }

	private static List<Modules> getChildrenNode(Integer modules_ParentId, List<Modules> treesList) {
		// TODO Auto-generated method stub
		return null;
	}

}
