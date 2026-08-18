class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
          List<int[]> merged = new ArrayList<>();
          int s1=newInterval[0];
          int e1=newInterval[1];
          int i=0;
          while(i < intervals.length && intervals[i][1] < s1)
          {
              merged.add(intervals[i]);
              i++;
          }
          while(i < intervals.length && intervals[i][0] <= e1)
          {
              s1=Math.min(s1,intervals[i][0]);
              e1=Math.max(e1,intervals[i][1]);
              i++;
          }
          merged.add(new int[]{s1,e1});
          while(i<intervals.length)
          {
            merged.add(intervals[i]);
            i+=1;
          }

          return merged.toArray(new int[merged.size()][]);
    }
}