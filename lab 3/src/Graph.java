import static java.lang.Math.*;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Graph implements Shape {
	
	double a;
	
	public Graph (double a) {
		this.a = a;
	}
	
	class ShapeIterator implements PathIterator {
		
		AffineTransform transform;
		boolean done = false;
		double ang = 0;

		public ShapeIterator(AffineTransform transform) {
			this.transform = transform;
		}


		public int getWindingRule() {
			return WIND_NON_ZERO;
		}


		public int currentSegment (float[] coords) {
			double[] doubleCoords = new double[2];
			int result = currentSegment(doubleCoords);
			coords[0] = (float) doubleCoords[0];
			coords[1] = (float) doubleCoords[1];
			return result;
		}


		public int currentSegment (double[] coords)
		{
			coords[0] = 2*a * pow(cos(toRadians(ang)),2) * sin(toRadians(ang));
			coords[1] =2*a * pow(sin(toRadians(ang)),2) * cos(toRadians(ang));
			if (ang > 360)
				done = true;			
			if (transform != null)
				transform.transform(coords, 0, coords, 0, 1);			
			if (ang < 1e-5)
				return SEG_MOVETO;
			return SEG_LINETO;
		}


		public boolean isDone () {
			return done;
		}


		public void next() {
			if (done)
				return;
			ang++;
		}
	}

	

	public PathIterator getPathIterator(AffineTransform at) {
		return new ShapeIterator(at);
	}
	
	public PathIterator getPathIterator(AffineTransform at, double flatness) {
		return new ShapeIterator(at);
	}
	
	
	public boolean contains(Point2D p) {
		return false;
	}

	
	public boolean contains(Rectangle2D r) {
		return false;
	}

	
	public boolean contains(double x, double y) {
		return false;
	}

	
	public boolean contains(double x, double y, double w, double h) {
		return false;
	}

	
	public Rectangle getBounds() {
		return new Rectangle();
	}

	
	public Rectangle2D getBounds2D() {
		return new Rectangle();
	}	

	
	public boolean intersects(Rectangle2D r) {
		return false;
	}

	
	public boolean intersects(double x, double y, double w, double h) {
		return false;
	}

}

//coords[0] = a * pow(2,cos(toRadians(angle))) * sin(toRadians(angle));
//coords[1] = a * pow(2,sin(toRadians(angle))) * cos(toRadians(angle));