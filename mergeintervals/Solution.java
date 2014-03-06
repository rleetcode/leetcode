import java.util.Collections;
import java.util.Comparator;
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
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals.size() <=1){
            return intervals;
        }    
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b){
                return (a.start - b.start);
            }   
        });
        ArrayList<Interval> result = new ArrayList<Interval>();
        for(Interval interval: intervals){
            if(result.isEmpty()){
                result.add(interval);
            }else{
                int topidx = result.size()-1;
                Interval top = result.get(topidx);
                if(top.end < interval.start){
                    result.add(interval);    
                }else if(top.end >= interval.start && top.end <= interval.end){
                    top.end = interval.end;
                    result.set(topidx,top);
                }else if(top.end > interval.end){
                    continue;
                }
            }
        }
        return result;
    }
}