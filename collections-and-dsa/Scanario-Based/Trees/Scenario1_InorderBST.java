import java.util.*;
class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario1{
void inorder(Node node,List<Integer> ans){
if(node==null)return;
inorder(node.left,ans);
ans.add(node.val);
inorder(node.right,ans);
}
List<Integer> getSortedLeaderboard(Node root){
List<Integer> ans=new ArrayList<>();
inorder(root,ans);
return ans;
}
}
