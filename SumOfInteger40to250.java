package com.LabNo4;

public class SumOfInteger40to250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
        for(i=40;i<=250;i++);
        {
            if(i%5==0);
            {
                sum=sum+i;
            }
        }
        System.out.println("The Sum of all Integers Greater than 40 and Less than 250 is = "+sum);
	}

}
