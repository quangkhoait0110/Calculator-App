package ProjectIS216;

public class PT2E {private int a; private int b;private int c;
	public PT2E(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public String compute() {
		String kq = "0";
		if(this.a == 0)
		{
			if(this.b == 0)
			{
				if(this.c == 0)
				{
					kq = "Phương trình có vô số nghiệm";
				}
				else
				{
					kq = "Phương trình vô nghiệm";
				}
			}
			else
			{
				kq = "Phương trình có 1 nghiệm x = " + (-this.c / this.b);
			}	
		}
		else
		{
			double delta = this.b * this.b - 4 * this.a * this.c;
			if(delta < 0)
				kq = "Phương trình vô nghiệm";
			else if(delta == 0)
				kq = "Phương trình có nghiệm kép x1 = x2 = " + (-this.b / (2 * this.a));
			else
			{
				kq = "x1 = " + ((-this.b - Math.sqrt(delta)) / (2 * this.a));
				kq += "  \nx2 = " + ((-this.b + Math.sqrt(delta)) / (2*this.a));
			}
		}
		return kq;
	}
}