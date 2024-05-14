package ProjectIS216;

import java.lang.Math;
import static java.lang.Math.cos;
import static java.lang.Math.acos;

public class PT3E {private int a; private int b; private int c; private int d;
	public PT3E(int a,int b,int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public static double[] Cupid(double a, double b, double c, double d)
    {
		
		double pi = Math.PI;
        double[] result;
        double delta = b*b - 3*a*c;
        double k = (9*a*b*c - 2*b*b*b - 27*a*a*d) / (2*Math.sqrt(Math.pow(Math.abs(delta),3)));
        if (delta > 0)
        {
            if (Math.abs(k) <= 1)
            {
                result = new double[3];
                result[0] = (2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3)-b)/(3*a);
                result[1] = (2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3-2*pi/3)-b)/(3*a);
                result[2] = (2*Math.sqrt(delta)*Math.cos(Math.acos(k)/3+2*pi/3)-b)/(3*a);
            }
            else
            {
                result = new double[1];
                result[0] = ((Math.sqrt(delta)*Math.abs(k))/(3*a*k)) * (Math.cbrt(Math.abs(k)+Math.sqrt(Math.pow(k,2)-1)) + Math.cbrt(Math.abs(k)-Math.sqrt(Math.pow(k,2)-1))) - b/(3*a);
            }
        }
        else if (delta == 0)
        {
            result = new double[1];
            result[0] = (-b + Math.cbrt(b*b*b-27*a*a*d))/3*a;
        }
        else
        {
            result = new double[1];
            result[0] = result[0] = (Math.sqrt(Math.abs(delta))/(3*a)) * (Math.cbrt(k+Math.sqrt(Math.pow(k,2)+1)) + Math.cbrt(k-Math.sqrt(Math.pow(k,2)+1))) - b/(3*a);
        }
        return result;
    }
	public String compute() {
		String kq = "0";
		double[] result = Cupid(a, b, c, d);
		kq = ("Nghiệm của phương trình là: ");
        for (double value : result)
        {
            kq += (" " + value);
        }
		return kq;
    }
}