class Solution {
    public static String reverseString(String s) {
        // code here
        char [] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String str1 = new String(ch);
        return str1;
    }
}