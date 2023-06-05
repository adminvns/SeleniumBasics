package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrey {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] array={"1","2","3","4","5"};
        int sum =0;
        System.out.println("Printing Array: "+ Arrays.toString(array));
        List<String> list=new ArrayList<String>();
        for(String num:array)
        {
            list.add(num);
        }
        System.out.println("Printing List: "+list);
        for(int i=0;i<=list.size();i++)
        {
            if(i==2||i==3)
            {
                String total = list.get(i);
                int a = Integer.parseInt(total);
                sum = sum+a;

            }
        }
        System.out.println(sum);
    }
}
