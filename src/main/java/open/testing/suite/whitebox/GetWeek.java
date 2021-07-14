package open.testing.suite.whitebox;

public class GetWeek {
	public  String getWeek(int year,int month,int day) {
		// 平年的2月有28天；闰年的2月有29天。
		// 通常每4年里有三个平年，一个闰年。
		// 十二个月每月天数
		int a[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int sum = 0;
		for(i=1; i<year; i++)
		{
			// 用年份除以4，没有余数就是闰年，有余数就是平年。
			// 判断是否是闰年
			if((i%4==0 && i%100!=0)||(i%400==0))
			{
				sum++;
			}
		}
			// 计算年份天数
		    sum = sum + 365 * (year-1);
		    // 计算是这年的第几天
			if((year%4 == 0 && year%400!=0)||(year % 100 == 0))
			{
			  a[1] = 29;
			}
			for(i=0; i<month-1; i++)
			{
				sum = sum + a[i];
			}
			sum = sum + day;
		  switch(sum % 7)
	      {   case 0 :return "Sunday";
	          case 1 :return "Monday";
	          case 2 :return "Tuesday";
	          case 3 :return "Wednesday";
	          case 4 :return "Thursday";
	          case 5 :return "Friday";
	          case 6 :return "Saturday"; 
	      }
		return "错误";
	}
	public static void main(String[] args) {
		GetWeek exp1 = new GetWeek();
		String x = exp1.getWeek(2021, 6, 30);
		System.out.print(x);
	}
}