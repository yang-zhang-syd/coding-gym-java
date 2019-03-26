package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class MeetingRoomsII {

    public static void main(String[] args) {

        Interval[] intervals = new Interval[] {new Interval(13, 15), new Interval(1, 13)};

        MeetingRoomsII solution = new MeetingRoomsII();
        int result = solution.minMeetingRooms(intervals);
    }

    public int minMeetingRooms(Interval[] intervals) {

        Arrays.sort(intervals, Comparator.comparing(i -> i.start));

        int result = 0;
        HashSet<Integer> assignedSet = new HashSet<>();
        ArrayList<Integer> rooms = new ArrayList<>();

        while(intervals.length != 0) {

            ArrayList<Interval> newIntervals = new ArrayList<>();
            int endTime = intervals[0].end;

            for(int i = 1; i < intervals.length; ++i) {
                if(intervals[i].start <= endTime) {
                    newIntervals.add(intervals[i]);
                }
                else {
                    endTime = intervals[i].end;
                }
            }

            result++;
            intervals = newIntervals.toArray(new Interval[0]);
        }

        return result;
    }

}

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}