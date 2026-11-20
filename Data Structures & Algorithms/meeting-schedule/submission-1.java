/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {

        intervals.sort(Comparator.comparingInt(a -> a.start));
       
        int max = -1;

        for (Interval interval : intervals) {
            int start = interval.start;
            int end = interval.end;
            
            if (start < max) return false;

            max = Math.max(max, end);
        }

        return true;
    }
}
