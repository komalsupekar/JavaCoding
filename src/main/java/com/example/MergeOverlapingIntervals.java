package com.example;

public class MergeOverlapingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6},{5,8}, {7, 10}, {15, 18}};
        int start = intervals[0][0];
        int end = intervals[0][1];
        int[][] mergedIntervals = new int[intervals.length][2];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                intervals[i - 1][1] = Math.max(intervals[i][1], end);
                end = intervals[i - 1][1];
                if(intervals[i+1][0]>end){
                    mergedIntervals[i - 1][0] = start;
                    mergedIntervals[i - 1][1] = end;
                }
            }else{
                start = intervals[i][0];
                end = intervals[i][1];
                mergedIntervals[i - 1][0] = start;
                mergedIntervals[i - 1][1] = end;
            }
            System.out.println("Merged Interval: [" + start + ", " + end + "]");
        }
        System.out.println("Final Merged Intervals: ");
        for (int i = 0; i < mergedIntervals.length; i++) {
            if (mergedIntervals[i][0] != 0 || mergedIntervals[i][1] != 0) {
                System.out.println("[" + mergedIntervals[i][0] + ", " + mergedIntervals[i][1] + "]");
            }
        }
    }
}
