class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<Integer>set=new HashSet<>();

        int i=0;
        while(i<arr.length){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            i++;
        }
        for(Integer value : map.values()){
            if(!set.add(value)){
                return false;
            }
        }
        return true;

    }
}