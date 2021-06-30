package tech.rongxing.devops.whitebox;
/**
 * 白盒测试案例
 * @author huizhuoli
 *
 */
public class Example1 {
	/**
	 * 方法1
	 * @param a 参数a
	 * @param b 参数b
	 * @param x 参数x
	 * @return x
	 */
	public int Func1(int a, int b, int x) {
		if((a>1)&&(b==0))
		       x=x/a; 
		 if ((a==2) || (x>1))
		       x=x+1;
		 return x;
	}

	/**
	 * 管理员判断
	 * @param name 角色名
	 * @return
	 */
	public boolean Func2(String name) {
		if(name.equals("admin"))
		    return true; 
		else
			return false;
	}
	
	/**
	 * 方法31
	 * @param a 参数a
	 * @param b 参数b
	 * @param x 参数x
	 * @return x
	 */
	public double Func3(int a, int b, double x) {
		if((a>1)&&(b==0))
		       x=x/a; 
		 if ((a==2) || (x>1))
		       x=x+1;
		 return x;
	}
	 

	public static void main(String[] args) {
		Example1 exp1 = new Example1();
		int x = exp1.Func1(2,0, 3);
		System.out.print(x); 
	}

}
