package ball.model;

import ball.Ball;

public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingBall(75, 50, BouncingBall.DOWN),
                elasticBall(250, 100, Ball.DEFAULT_RADIUS, ElasticBall.SHRINK),
                // bouncingElasticBall() --> Let's make a new ball!
        };
    }

    public static Ball bouncingBall(int centerX, int centerY, int direction) {
        return new BouncingBall(centerX, centerY, direction);
    }

    public static Ball elasticBall(int centerX, int centerY, int radius, int direction) {
        return new ElasticBall(centerX, centerY, radius, direction);
    }

    public static BouncingElasticBall bouncingElasticBall(int centerX, int centerY, int direction) {
        return new BouncingElasticBall(new BouncingBehavior(centerX,centerY,direction));
    }

//    public static Ball bouncingElasticBall(int centerX, int centerY, int radius, int direction) {
//        return new ElasticBall(centerX,centerY,radius,direction);
//    }
}
