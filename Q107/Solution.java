package Q107;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty())
        {
            int len=q.size();
            List<Integer> currlev=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                TreeNode curr=q.poll();
                currlev.add(curr.val);
                if(curr.left!=null)
                {
                    q.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    q.offer(curr.right);
                }
            }
            result.add(0,currlev);
        }
        return result;
    }
}
