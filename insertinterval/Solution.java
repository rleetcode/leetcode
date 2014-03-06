/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        
        for(Interval in:intervals){
            if(in.end < newInterval.start){
                result.add(in);
            }else if(newInterval.end < in.start){
                result.add(newInterval);
                newInterval = in;
            }else if(newInterval.start >= in.start || newInterval.end <= in.end){
                newInterval.start = Math.min(in.start, newInterval.start);
                newInterval.end = Math.max(in.end,newInterval.end);
            }
        }
        result.add(newInterval);

        return result;
    }
}