package ProjectIS216;

public class PT1E {private int a; private int b;
	public PT1E(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public String compute() {
		String kq = "0";
		if(this.a == 0)
		{
			if(this.b == 0)
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
			double ng = 0;
			ng = (double) -this.b / this.a;
			kq = "Phương trình có nghiệm x = " + ng;
		}
		return kq;	
	}
}

