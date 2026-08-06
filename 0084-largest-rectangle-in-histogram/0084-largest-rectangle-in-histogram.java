class Solution {
    public int largestRectangleArea(int[] arr) {
        int prev[]=new int[arr.length];
        int next[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        prev[0]=-1;
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
               st.pop();
            if(st.isEmpty())
               prev[i]=-1;
            else prev[i]=st.peek();
            st.push(i);
        }
        st.clear();
        next[arr.length-1]=arr.length;
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
               st.pop();
            if(st.isEmpty())
               next[i]=arr.length;
            else next[i]=st.peek();
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
           ans=Math.max(ans,arr[i]*(next[i]-prev[i]-1));
        }
        return ans;
    }
}