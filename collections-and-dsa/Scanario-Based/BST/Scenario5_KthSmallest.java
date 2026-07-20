import java.util.*;
class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario5{
int kthSmallest(Node root,int k){
Deque<Node> st=new ArrayDeque<>();
Node cur=root;
int c=0;
while(cur!=null||!st.isEmpty()){
while(cur!=null){
st.push(cur);
cur=cur.left;
}
cur=st.pop();
if(++c==k)return cur.val;
cur=cur.right;
}
throw new IllegalArgumentException();
}
}
