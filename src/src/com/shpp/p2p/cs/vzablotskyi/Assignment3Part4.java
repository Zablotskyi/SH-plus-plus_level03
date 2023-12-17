package src.com.shpp.p2p.cs.vzablotskyi;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part4 extends WindowProgram {
    private static final double BRICK_WIDTH = 50;
    private static final double BRICK_HEIGHT = 13;
    private static final double BRICKS_IN_BASE = 10;
    private static final Color BRICK_COLOR = Color.GRAY;
    private static final Color BRICK_BORDER_COLOR = Color.RED;
    private static double coordinateOfTheWedgeX;
    private static double coordinateOfTheWedgeY;

    @Override
    public void run() {
        coordinateOfTheWedgeX = getWidth() / 2 - BRICKS_IN_BASE * BRICK_WIDTH / 2;
        coordinateOfTheWedgeY = getHeight() - BRICK_HEIGHT;
        GRect brick = new GRect(coordinateOfTheWedgeX, coordinateOfTheWedgeY, BRICK_WIDTH, BRICK_HEIGHT );
        brick.setFilled(true);
        brick.setColor(BRICK_COLOR);
        brick.setFillColor(BRICK_BORDER_COLOR);
        add(brick);
    }
}
