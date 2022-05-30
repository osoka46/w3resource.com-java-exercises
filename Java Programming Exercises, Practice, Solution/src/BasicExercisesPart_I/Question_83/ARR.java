package Question83;

import java.util.Arrays;

public class ARR {
    private int[]arr;
    private int[]arr2;
    private int[]multyArr;

    ARR(int[]arr,int []arr2,int[]multyArr)
    {
        this.arr=arr;
        this.arr2=arr2;
        this.multyArr=multyArr;
    }
    public void run()
    {
        System.out.println(Arrays.toString(creatArr(this.arr,this.arr2,this.multyArr)));

    }

    public int[] creatArr(int []arr1,int[]arr2,int []multyArr)
    {
        for (int x=0;x< arr.length;x++)
        {
            multyArr[x]=arr1[x]*arr2[x];
        }
        return multyArr;
    }


}
