class Solution {
    public int sumNumbers(TreeNode root) {
        return sumOfNumber(root,0);

    }
    public int sumOfNumber(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            return sum;
        }
        return sumOfNumber(root.left,sum)+sumOfNumber(root.right,sum);
    }
}
