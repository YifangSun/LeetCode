class Solution {
    public int minimumSwap(String s1, String s2) {
        int numx=0;
        int numy=0;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            String key=s1.charAt(i)+""+s2.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
            if(s1.charAt(i)!=s2.charAt(i)){
                if(s1.charAt(i)=='x'){
                    numx++;
                }else{
                    numy++;
                }
                if(s2.charAt(i)=='x'){
                    numx++;
                }else{
                    numy++;
                }
            }
            
        }
        if(numx%2==1||numy%2==1){
            return -1;
        }
        int xy=map.getOrDefault("xy",0);
        int yx=map.getOrDefault("yx",0);
        int res=0;
        res=xy/2+yx/2+(xy%2+yx%2);
        return res;
    }
}
