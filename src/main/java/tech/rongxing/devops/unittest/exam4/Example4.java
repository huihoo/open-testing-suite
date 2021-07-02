package tech.rongxing.devops.unittest.exam4;

public class Example4 {
    private A1 a1 = new A1();
    private A2 a2 = new A2();
    private A3 a3 = new A3();

    public int fun(int[] list){
        int ans = a1.sum1(list) + a2.sum2(list) + a3.sum3(list);
        return ans;
    }
}