package ProjectIS216;

public class HePT_1 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public HePT_1(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public String compute() {
    	String kq = "0";
        double D, Dx, Dy;
        D = (double) this.a * e - d * b;
        Dx = c * e - f * b;
        Dy = a * f - d * c;
        if (D == 0) {
            if (Dx + Dy == 0)
              kq = "Hệ phương trình có vô số nghiệm";
            else
              kq = "Hệ phương trình vô nghiệm";
            } else {
            double x = (double) Dx / D;
            double y = (double) Dy / D;
            kq = "x = " + x;
            kq += "  \ny = " + y;
        }
        return kq;
    }  
}