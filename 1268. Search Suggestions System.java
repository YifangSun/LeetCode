class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res=new ArrayList<>();
        String temp="";
        // Map<String,Integer> map=new HashMap<>();
        // for(int i=0;i<products.length;i++){
        //     map.put(products[i],i);
        // }
        for(char c:searchWord.toCharArray()){
            temp+=c;
            // System.out.println(temp);
            int index=-1;
            for(int i=0;i<products.length;i++){
                if(products[i].startsWith(temp)){
                    index=i;
                    break;
                }
            }
            List<String> list=new ArrayList<>();
            if(index==-1){
                res.add(list);
                continue;
            }
            for(int i=index;i<products.length&&i<index+3;i++){
                if(products[i].startsWith(temp)){
                    list.add(products[i]);
                }
            }
            res.add(list);
        }
        return res;
    }
}
