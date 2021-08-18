package com.mac.java.interview.problems.wallmart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Meeting implements Comparable<Meeting> {
    int startTime;
    int endTime;

    Meeting(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public int compareTo(Meeting o) {
        if (this.endTime < o.endTime) {
            return -1;
        } else if (this.endTime > o.endTime) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}

public class MeetingScheduler {

    public int scheduler(int[] start, int[] end) {
        int count = 0;
        if (start.length > 0 && end.length > 0 && start.length == end.length) {
            List<Meeting> meetings = new ArrayList<>();
            int i = 0;
            count = 1;
            while (i < start.length) {
                meetings.add(new Meeting(start[i], end[i]));
                i++;
            }
            Collections.sort(meetings);
            System.out.println(meetings);
            i = 1;
            Meeting m1 = meetings.get(0);
            while (i < meetings.size()) {
                Meeting m2 = meetings.get(i);
                if (m1.endTime < m2.startTime) {
                    m1 = m2;
                    count++;
                }
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] start = {1, 3, 0, 5, 8, 8};
//        int[] end = {2, 4, 6, 7, 9, 9};
        int[] start = {1, 5,8,5,0,10,3};
        int[] end = {2, 7,9,9,1,11,4};

        MeetingScheduler meetingScheduler = new MeetingScheduler();
        System.out.println(meetingScheduler.scheduler(start, end));
    }
}

