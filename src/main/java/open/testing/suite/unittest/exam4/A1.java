package open.testing.suite.unittest.exam4;

public class A1 {
    int sum=0;

    public int sum1(int[] myList){
        for(int i=0; i<myList.length; i++){
            if(myList[i]%5 == 0 && myList[i]%2 == 0){
                sum+=myList[i];
            }
        }
        return sum;
    }
}
