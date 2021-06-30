package tech.rongxing.devops.unittest.exam4;
public class A3 {
    int max=0;

    public int sum3(int[] myList){
        for(int i=0;i<myList.length;i++){
            if(myList[i]%5==4 && myList[i]>max){
                max=myList[i];
            }
        }
        return max;
    }
}