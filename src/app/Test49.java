package app;

import java.util.Scanner;

public class Test49 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int max=0,sum=0;
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            sum=nums[i]+nums[i+1];
            if (sum>0){
                max=max>sum?max:sum;
            }else {
                sum -= nums[i];
            }
        }
        System.out.println(max);
    }
}
