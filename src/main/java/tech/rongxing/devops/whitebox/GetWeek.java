package tech.rongxing.devops.whitebox;

public class GetWeek {
	public  String getWeek(int year,int month,int day) {
		//十二个月每月天数
		int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
		int i;
		int sum=0;
		for(i=1;i<year;i++)
		{
			//判断是否是润年
			if((i%4==0&&i%100!=0)||(i%400==0))
			{
				sum++;
			}
		}
			//计算年份天数
		    sum=sum+365*(year-1);
		    //计算是这年的第几天
			if((year%4==0&&year%400!=0)||(year%100==0))
			{
			  a[1]=29;
			}
			for(i=0;i<month-1;i++)
			{
				sum=sum+a[i];
			}
			sum=sum+day;
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
} 