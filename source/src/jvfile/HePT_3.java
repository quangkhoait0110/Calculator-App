package ProjectIS216;

public class HePT_3 {
    private double a1;
    private double b1;
    private double c1;
    private double d1;
    private double a2;
    private double b2;
    private double c2;
    private double d2;
    private double a3;
    private double b3;
    private double c3;
    private double d3;

    public HePT_3(double a1, double b1, double c1, double d1, double a2, double b2, double c2, double d2, double a3, double b3, double c3, double d3) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
        this.a2 = a2;
        this.b2 = b2;
        this.c2 = c2;
        this.d2 = d2;
        this.a3 = a3;
        this.b3 = b3;
        this.c3 = c3;
        this.d3 = d3;
    }

    

 
public String compute() {
	double[][] arr = {{a1, b1, c1, d1},
            {a2, b2, c2, d2},
            {a3, b3, c3, d3}};
	String kq = "0";
    int d1 = arr.length;
    int d2 = arr[0].length;
    if (d2 > d1 + 1)
        kq ="Hệ có vô số nghiệm!";
    else {
        double[] d = new double[d1];
        for (int i = 0; i < d1; i++)
            d[i] = arr[i][d2 - 1];
        double[][] matrix = copy(arr, d2 - 1);
        double res = det(matrix);
        double[] dt = new double[d1];
        for (int k = 0; k < d1; k++) {
            double [][] matrix1 = copy(arr, d2 - 1);
            for (int i = 0; i < d1; i++)
                matrix1[i][k] = d[i];
            dt[k] = det(matrix1);
        }
        boolean b = false;
        for (int i = 0; i < d1; i++) {
            if (dt[i] != 0) {
                b = true;
                break;
            }
        }
        if (b && res == 0)
            kq="Hệ phương trình vô nghiệm!";
        else if (!b && res == 0)
            kq="Hệ phương trình vô nghiệm hoặc vô số nghiệm!";
        else {
                 double x = (dt[0] / (double)res);
                 if (x == -0.0) x=0;
                 double y = (dt[1] / (double)res);
                 if (y == -0.0) y=0;
                 double z = (dt[2] / (double)res);
                 if (z == -0.0) z=0;
                 kq ="x = " + x;
                 kq += "  \ny = " + y;
                 kq += "  \nz = " + z;
            }
        }
    return kq;

    
}

static double [][] copy( double [][] arr, int col) {
    double[][] a = new double[arr.length][col];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < col; j++) {
            a[i][j] = arr[i][j];
        }
    }
    return a;
}

static double det(double[][] arr) {
    if ((arr.length) == 1)
        return arr[0][0];
    if ((arr.length) == 2)
        return arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
    else {

        int res = 0;
        for (int k = 0; k < arr.length; k++) {
            double[][] smaller = new double[arr.length - 1][arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (i < k)
                        smaller[i][j - 1] = arr[i][j];
                    else if (i > k)
                        smaller[i - 1][j- 1] = arr[i][j];
                }
            }
            int s = -1;
            if (k % 2 == 0)
                s = 1;
            res += arr[k][0] * s * det(smaller);
        }
        return res;
    }
}
}


