package src.com.shpp.p2p.cs.vzablotskyi;

import acm.graphics.GOval;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part6 extends WindowProgram {
    private static final int DELAY = 30; // Частота кадрів
    private double trajectoryRadius = 30; // Початковий радіус траєкторії
    private static double CIRCLE_RADIUS;
    private double angle = 0.0; // Початковий кут
    long startTime = System.currentTimeMillis();
    long duration = 5000; // 5 секунд (в мілісекундах)

    @Override
    public void run() {
        CIRCLE_RADIUS = getWidth() / 7;
        while (System.currentTimeMillis() - startTime < duration) {
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

            pause(DELAY);
            angle += 3.0;
        }
    }
}
