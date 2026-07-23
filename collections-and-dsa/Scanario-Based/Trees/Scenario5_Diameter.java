class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario5{
int diameter;
int longestCommunicationPath(Node root){
diameter=0;
dfs(root);
return diameter;
}
int dfs(Node node){
if(node==null)return -1;
int l=dfs(node.left);
int r=dfs(node.right);
diameter=Math.max(diameter,l+r+2);
return Math.max(l,r)+1;
}
}
