package ball.model;

import ball.Ball;

public class ElasticBall extends BallImpl {
    public static final int SPEED = 2;

    static final int GROW = 1;
    static final int SHRINK = -1;

    private int direction;

    ElasticBall(int x, int y, int radius, int direction) {
        super(x, y, radius);
        this.direction = direction;
    }

    @Override
    public void update() {
        direction = switchDirectionsIfNecessary();
        radius = next();
    }

    /***********************************************************************************
     *
     * DO NOT CHANGE Elastic algorithm below.
     *
     ***********************************************************************************/

    private int switchDirectionsIfNecessary() {
        if (growingTooBig() || shrinkingTooSmall()) {
            return switchDirection();
        }

        return this.direction;
    }

    private boolean shrinkingTooSmall() {
        return radius <= 0 && shrinking();
    }

    private boolean growingTooBig() {
        return radius >= Ball.DEFAULT_RADIUS && growing();
    }

    private int switchDirection() {
        return growing() ? SHRINK : GROW;
    }

    private int next() {
        return radius + (SPEED * direction);
    }

    private boolean shrinking() {
        return direction == SHRINK;
    }

    private boolean growing() {
        return direction == GROW;
    }
}
