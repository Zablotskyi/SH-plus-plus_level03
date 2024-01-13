package com.shpp.p2p.cs.vzablotskyi.assignment3;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part6 extends WindowProgram {
    private static final int DELAY = 50; // Frame rate
    private double trajectoryRadius = 30; // Initial trajectory radius
    private static double CIRCLE_RADIUS; // The radius of a circle
    private double angle = 0.0; // Starting angle for moving circles
    long startTime = System.currentTimeMillis(); // We get the current time, from which we will calculate the program execution time
    long duration = 5000; // The cycle execution time is set so that the program fits into 5 seconds

    @Override
    public void run() {
        drawingTheLogoOfTheOlympics();
    }

    /* Draw an improvisation of the Olympics emblem. Create five circles with colors that match the emblem. We specify the
     coordinates of the initial circle, and for the subsequent circles we make an offset relative to these coordinates.
      Use the angle of inclination to move our shapes around the circle.*/
    private void drawingTheLogoOfTheOlympics() {
        CIRCLE_RADIUS = getWidth() / 7;
        while (System.currentTimeMillis() - startTime < duration) {
            // Initial X and Y coordinates for placing the first circle
            double x = (getWidth() - CIRCLE_RADIUS * 4) / 2 + trajectoryRadius * Math.cos(Math.toRadians(angle));
            double y = (getHeight() - CIRCLE_RADIUS * 1.5) / 2 + trajectoryRadius * Math.sin(Math.toRadians(angle));

            GOval blueCircle = new GOval(x, y, CIRCLE_RADIUS, CIRCLE_RADIUS);
            blueCircle.setFilled(true);
            blueCircle.setColor(Color.BLUE);
            add(blueCircle);

            GOval blackCircle = new GOval(x + CIRCLE_RADIUS * 1.6, y, CIRCLE_RADIUS, CIRCLE_RADIUS);
            blackCircle.setFilled(true);
            blackCircle.setColor(Color.BLACK);
            add(blackCircle);

            GOval redCircle = new GOval(x + CIRCLE_RADIUS * 3.2, y, CIRCLE_RADIUS, CIRCLE_RADIUS);
            redCircle.setFilled(true);
            redCircle.setColor(Color.RED);
            add(redCircle);

            GOval yellowCircle = new GOval(x + CIRCLE_RADIUS * 0.8, y + CIRCLE_RADIUS * 0.5, CIRCLE_RADIUS, CIRCLE_RADIUS);
            yellowCircle.setFilled(true);
            yellowCircle.setColor(Color.YELLOW);
            add(yellowCircle);

            GOval greenCircle = new GOval(x + CIRCLE_RADIUS * 2.4, y + CIRCLE_RADIUS * 0.5, CIRCLE_RADIUS, CIRCLE_RADIUS);
            greenCircle.setFilled(true);
            greenCircle.setColor(Color.GREEN);
            add(greenCircle);

            pause(DELAY); // Slow down our program by adding a pause
            angle += 3.0; // Change the angle for moving shapes
        }
    }
}