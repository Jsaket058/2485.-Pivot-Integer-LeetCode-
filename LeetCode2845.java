class Solution {
    public int pivotInteger(int n) {
        int arr[]=new int[n];
        int p=1;
        for(int i=1;i<=n;i++){
            arr[i-1]=p;
            p+=i+1;
        }
        int x=0;
        for(int i=n-1;i>=0;i--){
            x+=i+1;
            if(arr[i]==x)return i+1;
        }
        return -1;
    }
}

class LeetCode2845{
	public static void main(String[] args){
		Solution s=new Solution();
		System.out.println(s.pivotInteger(8));
		System.out.println(s.pivotInteger(10));
		System.out.println(s.pivotInteger(17));
	}
}