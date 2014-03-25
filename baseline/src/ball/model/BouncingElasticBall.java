package ball.model;

import ball.Ball;

import java.awt.*;

/**
 * Created by twer on 3/25/14.
 */
public class BouncingElasticBall implements Ball{

    private BallBehavior ballBehavior;

    public BouncingElasticBall(BallBehavior ballBehavior) {
        this.ballBehavior = ballBehavior;
    }

    @Override
    public int radius() {
        return 0;
    }

    @Override
    public Point center() {
        return null;
    }

    public void update() {
        ballBehavior.update();
    }

}
