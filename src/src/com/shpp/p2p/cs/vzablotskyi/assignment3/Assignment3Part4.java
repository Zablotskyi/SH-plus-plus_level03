package src.com.shpp.p2p.cs.vzablotskyi.assignment3;

import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment3Part4 extends WindowProgram {
    private static final double BRICK_WIDTH = 50; // width of the brick
    private static final double BRICK_HEIGHT = 13; // height of the brick
    private static final int BRICKS_IN_BASE = 15; // number of bricks at the base of the pyramid
    private static final Color BRICK_COLOR = Color.GRAY; // brick's color
    private static final Color BRICK_BORDER_COLOR = Color.RED; // brick's border color
    private static double coordinateOfTheWedgeX; // coordinate of first brick X
    private static double coordinateOfTheWedgeY; // coordinate of first brick Y

    @Override
    public void run() {
        // center the first brick horizontally and press it to the bottom of the window
        coordinateOfTheWedgeX = getWidth() / 2 - BRICKS_IN_BASE * BRICK_WIDTH / 2;
        coordinateOfTheWedgeY = getHeight() - BRICK_HEIGHT;

        // create a counter for each row of bricks
        int cout = BRICKS_IN_BASE - 1;

        // building a pyramid
        for (int i = BRICKS_IN_BASE; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                GRect brick = new GRect(coordinateOfTheWedgeX, coordinateOfTheWedgeY, BRICK_WIDTH, BRICK_HEIGHT );
                brick.setFilled(true);
                brick.setColor(BRICK_COLOR);
                brick.setFillColor(BRICK_BORDER_COLOR);
                add(brick);
                // will change the coordinates of the next brick in our row
                coordinateOfTheWedgeX += BRICK_WIDTH;
            }

            // changes the coordinates of the first brick of the next row
            coordinateOfTheWedgeX = getWidth() / 2 - (cout--) * BRICK_WIDTH / 2;
            coordinateOfTheWedgeY -= BRICK_HEIGHT;
        }
    }
}
