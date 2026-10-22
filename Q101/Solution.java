package Q101;

import java.util.*;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty())
        {
            TreeNode le=q.poll();
            TreeNode ri=q.poll();

            if(le==null && ri==null)
            {
                continue;
            }
            if(le==null || ri==null)
            {
                return false;
            }
            if(le.val!=ri.val)
            {
                return false;
            }
            q.add(le.left);
            q.add(ri.right);
            q.add(le.right);
            q.add(ri.left);
        }
        return true;
    }
}