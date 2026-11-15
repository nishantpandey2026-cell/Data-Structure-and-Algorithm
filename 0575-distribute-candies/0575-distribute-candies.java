class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>set=new HashSet<>();
        int i=0;
        while(i<candyType.length){
            set.add(candyType[i]);
            i++;
        }
        int n=candyType.length;
        n=n/2;
        if(n>set.size()){
            return set.size();
        }
        else
        {
            return n;
        }
    }
}