class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return dfs(postorder,0,postorder.length - 1);
    }

    public boolean dfs(int[] postorder, int left, int right){
        if (left >= right) return true;

        int temp = left;

        while (postorder[temp] < postorder[right]) temp++;
        int m = temp;
        while (postorder[temp] > postorder[right]) temp++;

        return temp == right && dfs(postorder,left,m - 1) && dfs(postorder,m,right - 1);
    }
}