class Scenario2{
void buildHeap(int[] a){
for(int i=a.length/2-1;i>=0;i--)siftDown(a,i,a.length);
}
void siftDown(int[] a,int i,int n){
int s=i,l=2*i+1,r=2*i+2;
if(l<n&&a[l]<a[s])s=l;
if(r<n&&a[r]<a[s])s=r;
if(s!=i){
int t=a[i];a[i]=a[s];a[s]=t;
siftDown(a,s,n);
}
}
}
