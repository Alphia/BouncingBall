package ball.model;

import ball.Ball;
import org.junit.Test;

import static ball.BallTestHarness.*;

/**
 * Created by twer on 3/25/14.
 */
public class BouncingElasticBallTest {
    @Test
    public void shouldGoDown() throws Exception {
        BouncingElasticBall bouncingElasticBall = BallFactory.bouncingElasticBall(0, 100, BouncingBall.DOWN);

        bouncingElasticBall.update();

        assertCenterYCoordinateIs(oneStepDownFrom(100), bouncingElasticBall);
    }

    @Test
    public void shouldDecreaseRadius() {
        Ball bouncingElasticBall = BallFactory.bouncingElasticBall(0, 0, 20, ElasticBall.SHRINK);

        bouncingElasticBall.update();

        assertRadiusIs(oneStepInwardsFrom(20), bouncingElasticBall);
    }
}
