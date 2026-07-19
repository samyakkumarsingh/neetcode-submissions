class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            encoded.append(strs.get(i).length());
            encoded.append('#');
            encoded.append(strs.get(i));
        }
        
        return encoded.toString();
        
    }

    public List<String> decode(String encoded) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<encoded.length()){
            String length = "";
            while(encoded.charAt(i)!='#'){
                length += encoded.charAt(i);
                i++;
            }
            int len=Integer.parseInt(length);
            i++;
            res.add(encoded.substring(i,i+len));
            i=i+len;
    
        }
        return res;
    }
}
