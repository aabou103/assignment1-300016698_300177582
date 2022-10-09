package design5;

public class PolarPoint extends Point{
	private double Rho, Theta;
	public PolarPoint(char type, double Rho, double Theta) {
		super(type, Rho, Theta);
	    this.Rho = Rho;
	    this.Theta = Theta;
	}

	@Override
	double getX() {
		return (Math.cos(Math.toRadians(Theta)) * Rho);
	}

	@Override
	double getY() {
		return (Math.sin(Math.toRadians(Theta)) * Rho);
	}

	@Override
	double getRho() {
		return Rho;
	}

	@Override
	double getTheta() {
		return Theta;
	}
	
}