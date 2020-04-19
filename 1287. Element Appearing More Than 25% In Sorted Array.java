class Solution {
    public int findSpecialInteger(int[] arr) {
        int len=arr.length/4;
        int[] num=new int[arr[arr.length-1]+1];
        for(int i=0;i<arr.length;i++){
            num[arr[i]]++;
            if(num[arr[i]]>len){
                return arr[i];
            }
        }
        return 0;
    }
}
