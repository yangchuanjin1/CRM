package com.ycj.Util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ycj.entity.Modules;
@Component
public class TreeNode {
		/**
	     * <pre>
	     * 构造树流程
	     * 1.根节点--往下找到其子节点，构造第一层树
	     * 2.根节点下的父节点--往下找到其子节点，构造第n层树
	     * @param list 构造树所需要的数据  以ArrayList格式传入
	     * @return 完整的树
	     * </pre>
	     */
    public static ArrayList<TreeModel> getTree(List<TreeModel> list) {
    	System.out.println(1);
    	//首先，我们创建一个链表，用于存放第一层，也就是最高层节点
        ArrayList<TreeModel> tree = new ArrayList<>();
        // 循环遍历父节点
        for (TreeModel treeNode : list) {
        	 // 如果是根节点或者父节点，就构造树，我们这里Parent_id=0代表最高层级，没有父节点的意思。
            if (treeNode.getM_parentid() == 0 || treeNode.getM_parentid() == treeNode.getId()) {
            	 //如果寻找到最高层了，然后我们就往下找它的子节点，把它的ID和之前表中所有数据构成的链表一同传到getChildrenNode方法中，去寻找自己的孩子
                treeNode.setChildren(getChildrenNode(treeNode.getId(),list));
              //把我们的父节点放进链表中
                tree.add(treeNode);
            }
        }
        System.out.println("for循环遍历输出"+tree);
      //返回我们装好的树
        return tree;
    }
    /**
     * <pre>
     * 找到父节点的子节点
     * @param pid
     * @param list
     * @return 子节点
     * </pre>
     */
  //获取子节点
    public static ArrayList<TreeModel> getChildrenNode(int pid, List<TreeModel> list) {
    	System.out.println(2);
    	//我们拿到了父节点的ID，和所有数据的链表之后，来到了这里，首先，申明一个链表，用于存放二级的节点。

    	//等会会调用递归，要注意，调用的递归ArrayList<TreeModel>所代表的意义不是一样的，所以，调用n次就代表这里的链表存放的是n+2次的层级节点。
        ArrayList<TreeModel> childrenNode = new ArrayList<>();
        // 循环遍历子节点
        for (TreeModel treeNode : list) {
        	//如果节点是父节点，继续往下找到其子节点
            if (pid == treeNode.getM_parentid()){
                treeNode.setChildren(getChildrenNode(treeNode.getId(), list));//继续调用自身方法，去寻找接下来pid的子节点的子节点。。。。，以此不断下去，就能把所有的遍历完了
              //这里可能会有好几个节点是pid的子节点，所以用链表childrenNode装起来。
                childrenNode.add(treeNode);
            }
        }
        return childrenNode;
    }
    
    
    /**
	 * 灏唗ree鍙樻垚閫変腑鐘舵��
	 * @param totalList
	 * @param list
	 * @return
	 */
	public static  List<Modules> checkTree(List<Modules> totalList,List<Modules> Roleslist){
		for (int i = 0; i < Roleslist.size(); i++) {
			 for (int j = 0; j < totalList.size(); j++) {
				if(totalList.get(j).getModules_ID()==Roleslist.get(i).getModules_ID()) {
					if(totalList.get(j).getModules_ParentId()!=0) {
					/*Roleslist.get(i).getM_parentid()!=0*/
						totalList.get(j).setChecked(true);;					  					
				}
			}
		}
	}
		return totalList;
		}
	public static  ArrayList<TreeModel> checkTree1(List<Modules> totalList){
		ArrayList<TreeModel> root = new ArrayList<>();
		ArrayList<TreeModel> tree = new ArrayList<>();
		   for (Modules mod1:totalList) {
			   TreeModel node = new TreeModel();
			   node.setId(mod1.getModules_ID());
               node.setText(mod1.getModules_Name());             
               node.setM_parentid(mod1.getModules_ParentId());
               node.setM_path(mod1.getModules_Path());
               node.setChecked(mod1.getChecked());
               tree.add(node);
		   }
		   return root = TreeNode.getTree(tree); 
	}
}

