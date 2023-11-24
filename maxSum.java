package com.dsa.cp;
import java.util.*;
public class maxSum {
    public static void main(String[] args) {
        int[] banned={1,6,5};
        int n=5;
        int maxSum=6;
        List arr=Arrays.asList(banned);
        for(int j=0;j<banned.length;j++){
            arr.add(banned[j]);
        }
        int c=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            if(sum<=maxSum && !arr.contains(i)){
                sum=sum+i;
                c++;
            }
        }
       System.out.print(c);
    }
}
