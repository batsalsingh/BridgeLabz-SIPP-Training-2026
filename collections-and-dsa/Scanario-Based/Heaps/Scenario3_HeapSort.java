class Scenario3{
void heapSort(int[] a){
int n=a.length;
for(int i=n/2-1;i>=0;i--)down(a,i,n);
for(int end=n-1;end>0;end--){
int t=a[0];a[0]=a[end];a[end]=t;
down(a,0,end);
}
}
void down(int[] a,int i,int n){
int m=i,l=2*i+1,r=2*i+2;
if(l<n&&a[l]>a[m])m=l;
if(r<n&&a[r]>a[m])m=r;
if(m!=i){
int t=a[i];a[i]=a[m];a[m]=t;
down(a,m,n);
}
}
}
