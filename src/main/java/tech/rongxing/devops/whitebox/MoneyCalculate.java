package tech.rongxing.devops.whitebox;
/**
 * 题目四
 */
public class MoneyCalculate {
    /**
     * 题目四——计算利润的提成
     * @param money 利润金额
     * @return 返回double类型的提成
     */
    public double getMoney(double money){
        double sum = 0;
        if(money<=100000)
        {
            sum = 0.1 * money;
        }
        if(money>100000 && money<=200000)
        {
            sum = 10000 + (money - 100000) * 0.075;
        }
        if(money>200000 && money<=400000)
        {
            sum = 10000 + 100000 * 0.075 + (money - 200000)*0.05;
        }
        if(money>400000 && money<=600000)
        {
            sum = 10000 + 100000 * 0.075 + 200000 * 0.05 + (money - 400000) * 0.03;
        }
        if(money>600000 && money<=1000000)
        {
            sum = 10000 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + (money - 600000) * 0.015;
        }
        if(money>1000000)
        {
            sum = 10000 + 100000 * 0.075 + 200000 * 0.05 + 200000 * 0.03 + 400000 * 0.015 + (money - 1000000) * 0.01;
        }
        return sum;
    }
}