package com.shpp.p2p.cs.vzablotskyi.assignment3;

import java.util.*;

public class Assignment3Part1 {
    private static final int NORM_DAYS_FOR_CARDIOVASCULAR_HEALTH = 5;
    private static final int NORM_OF_DAYS_FOR_BLOOD_PRESSURE = 3;
    private static Integer minutes; // training duration in minutes per day
    private static List<Integer> weekOfAerobics = new ArrayList<>(); // list of workouts by day
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        trainingByDayOfTheWeek();
        trainingReportForTheWeek();
    }

    /* we ask the user how much time in minutes he or she spent exercising every day, and give the user
    the opportunity to enter the number of minutes. Write the result to the list. If the user has entered incorrect
    data, we inform them about it and offer to try again.*/
    public static void trainingByDayOfTheWeek() {
        try {
            for (int i = 1; i <= 7; i++) {
                System.out.println("How many minutes did you do on day " + i + "?");
                weekOfAerobics.add(minutes = scanner.nextInt());
            }
        } catch (InputMismatchException e) {
            System.out.println("You entered the wrong number of minutes, try again");
        }
    }
    /* go through the list and sum up the days with workouts of 30 minutes or more, and the days with workouts
     of 40 minutes or more. Display the report on the screen*/
    public static void trainingReportForTheWeek() {
        int daysOfTrainingFor30MinutesLeft = 0; // number of days with training for more than 30 minutes
        int daysOfTrainingFor40MinutesLeft = 0; // number of days with training for more than 40 minutes
        for (int i = 0; i < weekOfAerobics.size(); i++) {
            if (weekOfAerobics.get(i) >= 30) {
                daysOfTrainingFor30MinutesLeft++;
            }
            if (weekOfAerobics.get(i) >= 40) {
                daysOfTrainingFor40MinutesLeft++;
            }
        }
        System.out.println("Cardiovascular health:");
        if (daysOfTrainingFor30MinutesLeft >= 5) {
            System.out.println("    Great job! You've done enough exercise for cardiovascular health.");
        } else {
            System.out.println("    You needed to train hard for at least " +
                    (NORM_DAYS_FOR_CARDIOVASCULAR_HEALTH - daysOfTrainingFor30MinutesLeft) +
                    " more day(s) a week!");
        }
        System.out.println("Blood pressure:");
        if (daysOfTrainingFor40MinutesLeft >= 3) {
            System.out.println("    Great job! You've done enough exercise to keep a low blood pressure.");
        } else {
            System.out.println("    You needed to train hard for at least " +
                    (NORM_OF_DAYS_FOR_BLOOD_PRESSURE - daysOfTrainingFor40MinutesLeft) +
                    " more day(s) a week!");
        }
        // close the thread of reading data from the keyboard
        scanner.close();
    }
}