package ball;

import ball.model.BouncingBall;
import ball.model.ElasticBall;

import static org.junit.Assert.assertEquals;

public class BallTestHarness {
    public static void assertCenterYCoordinateIs(int expectedCenterY, Ball ball) {
        assertEquals("Ball is at the wrong y-coordinate!", expectedCenterY, ball.center().y);
    }

    public static int oneStepDownFrom(int centerY) {
        return centerY + BouncingBall.SPEED;
    }

    public static int oneStepUpFrom(int centerY) {
        return centerY - BouncingBall.SPEED;
    }


    public static void assertRadiusIs(int expectedRadius, Ball ball) {
        assertEquals("Ball does not have the correct radius", expectedRadius, ball.radius());
    }

    public static int oneStepInwardsFrom(int radius) {
        return radius - ElasticBall.SPEED;
    }

    public static int oneStepOutwardsFrom(int radius) {
        return radius + ElasticBall.SPEED;
    }
}
