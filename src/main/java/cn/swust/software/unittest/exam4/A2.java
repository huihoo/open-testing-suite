package cn.swust.software.unittest.exam4;
public class A2 {
    int sum=0;

    public int sum2(int[] myList){
        for(int i=0;i<myList.length;i++){
            if(myList[i]%5==2){
                sum++;
            }
        }
        return sum;
    }
}