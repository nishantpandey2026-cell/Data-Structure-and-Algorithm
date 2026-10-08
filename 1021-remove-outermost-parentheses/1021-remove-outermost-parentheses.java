class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st=new StringBuilder("");//to store the result string
        int dept=0;//check that there will be only one valid parentesis
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(dept>0){
                   st.append(s.charAt(i));
                }
                dept++;
            }
            else if(ch==')'){
                dept--;
                if(dept>0){
                    st.append(s.charAt(i));
                }
            }
        }
        String res=st.toString();
        return res;
    }
}