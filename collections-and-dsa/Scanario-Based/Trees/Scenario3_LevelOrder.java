import java.util.*;
class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario3{
List<List<Integer>> broadcastByLevel(Node root){
List<List<Integer>> ans=new ArrayList<>();
if(root==null)return ans;
Queue<Node> q=new LinkedList<>();
q.offer(root);
while(!q.isEmpty()){
int size=q.size();
List<Integer> level=new ArrayList<>();
for(int i=0;i<size;i++){
Node cur=q.poll();
level.add(cur.val);
if(cur.left!=null)q.offer(cur.left);
if(cur.right!=null)q.offer(cur.right);
}
ans.add(level);
}
return ans;
}
}
