package ball.model;

import ball.Ball;
import ball.ui.BallWorld;

/**
 * Created by twer on 3/25/14.
 */
public class BouncingBehavior implements BallBehavior {

    public static final int SPEED = 12;

    static final int DOWN = 1;
    static final int UP = -1;

    private final int radius = 50;
    private int direction;
    private int x;
    private int y;

    public BouncingBehavior(int x, int y,  int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }


    @Override
    public void update() {
        direction = switchDirectionsIfNecessary();
        y = move();
    }

    private int switchDirectionsIfNecessary() {
        if (movingTooHigh() || movingTooLow()) {
            return switchDirection();
        }

        return this.direction;
    }

    private boolean movingTooLow() {
        return y + radius >= BallWorld.BOX_HEIGHT && movingDown();
    }

    private boolean movingTooHigh() {
        return y - radius <= 0 && movingUp();
    }

    private int switchDirection() {
        return movingDown() ? UP : DOWN;
    }

    private int move() {
        return y + (SPEED * direction);
    }

    private boolean movingDown() {
        return direction == DOWN;
    }

    private boolean movingUp() {
        return direction == UP;
    }
}
