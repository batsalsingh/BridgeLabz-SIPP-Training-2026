import java.util.*;
class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario2{
List<Integer> iterativePreorder(Node root){
List<Integer> ans=new ArrayList<>();
if(root==null)return ans;
Deque<Node> st=new ArrayDeque<>();
st.push(root);
while(!st.isEmpty()){
Node cur=st.pop();
ans.add(cur.val);
if(cur.right!=null)st.push(cur.right);
if(cur.left!=null)st.push(cur.left);
}
return ans;
}
}
