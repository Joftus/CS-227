package mini2;

import java.awt.Point;
import java.io.File;
import java.util.Scanner;

import api.Converter;
import plotter.Polyline;

//)0

/**
 * Converts a string into a <code>Polyline</code> object.  The given 
 * string must conform to the format specified for one valid line of the file 
 * as described in Lab 8, checkpoint 2.  See
 * <pre>
 * http://web.cs.iastate.edu/~cs227/labs/lab8/page12.html
 * </pre>
 */
public class PolylineConverter implements Converter<Polyline>
	{
	public Polyline convert(String s) 
		{
		Polyline p;
		Scanner sc1 = new Scanner(s);
		
		if (sc1.hasNextInt()) 
			{
			int width = sc1.nextInt();
			String color = sc1.next();
			p = new Polyline(color, width);
			}
		else 
			{
			String color = sc1.next();
			p = new Polyline(color);
			}
		while (sc1.hasNextInt()) 
			{
			int x = sc1.nextInt();
			int y = sc1.nextInt();
			Point pt = new Point(x, y);
			p.addPoint(pt);
			}
		return p;
		}
}
