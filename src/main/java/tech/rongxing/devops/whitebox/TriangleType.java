package tech.rongxing.devops.whitebox;

public class TriangleType {
	 public double getTriangleType(int a,int b,int c) {
			/*
			判断能否构成三角形。
			条件：1三条边都要大于0的实数
			2任意两边的和大于第三边
			3任意两边的差小于第三边
			*/
			if(a > 0 && b > 0 && c > 0) {
				if(a + b > c && a + c >b && b + c > a ) 
				{
					if(Math.abs(a-b) < c &&Math.abs(a-c) <b &&Math.abs(b-c)<a) 
					{
						// 计算周长
						double perimeter = a + b + c;
						
						if(a==b||a==c||b==c) {
							if(a==b&&b==c) {
								System.out.println("等边三角形");
							}
							else {
								System.out.println("等腰三角形");
							}
						}
						return perimeter;
						
					} else return 0;
						
				}else return 0;
			}else return 0;

		}

	public static void main(String[] args) {
		TriangleType TT = new TriangleType();
		double tt = TT.getTriangleType(10,20,20);
		System.out.print(tt);
	}
}
