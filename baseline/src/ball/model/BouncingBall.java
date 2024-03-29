package ball.model;

import ball.ui.BallWorld;

public class BouncingBall extends BallImpl {
    public static final int SPEED = 12;

    static final int DOWN = 1;
    static final int UP = -1;

    private int direction;

    BouncingBall(int x, int y, int direction) {
        super(x, y);
        this.direction = direction;
    }

    @Override
    public void update() {
        direction = switchDirectionsIfNecessary();
        y = move();
    }

    /***********************************************************************************
     *
     * DO NOT CHANGE Bouncing algorithm below.
     *
     ***********************************************************************************/

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
