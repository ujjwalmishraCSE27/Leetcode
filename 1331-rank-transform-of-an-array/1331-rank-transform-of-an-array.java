class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int ans[]=new int[arr.length];
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer>map=new HashMap<>();
        int j=1;
        for(int i=0;i<temp.length;i++){
            if(map.containsKey(temp[i]))
               continue;
            map.put(temp[i],j);
            j++;
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}