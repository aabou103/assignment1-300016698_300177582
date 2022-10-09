package design5;

public class CartesianPoint extends Point{

	private double x,y;

	public CartesianPoint(char type, double x, double y) {
		super(type, x, y);
	    this.x = x;
	    this.y = y;
	}

	@Override
	double getX() {
		return x;
	}

	@Override
	double getY() {
		return y;
	}

	@Override
	double getRho() {
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
	}

	@Override
	double getTheta() {
		return Math.toDegrees(Math.atan2(y, x));
	}
	
}