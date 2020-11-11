import java.awt.Graphics;

//Comment

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	public Ball() {
		setWidth(Settings.BALL_WIDTH);
		setHeight(Settings.BALL_HEIGHT);
		resetPosition();
	}
	
	public void resetPosition() {
		x = Settings.INITIAL_BALL_X;
		y = Settings.INITIAL_BALL_Y;
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
		
		// Bounce off sides of screen
		if(x <= 0) {
			setX(0);
			setXVelocity(1);
		}
		
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			setX(Settings.WINDOW_WIDTH - Settings.BALL_WIDTH);
			setXVelocity(-1);
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			setYVelocity(1);
		}
		
	}
	
	public void setXVelocity(int x) { xVelocity = x; }
	public void setYVelocity(int y) { yVelocity = y; }
	
	public int getXVelocity() { return xVelocity; }
	public int getYVelocity() { return yVelocity; }
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
