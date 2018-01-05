/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanvi
 */
import java.util.*;
import java.io.*;

class MissingDrone
{
   public static void main(String args[])throws IOException
   {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        int n=1000;
        int i,c=0,j=0,x=0;
        int delivery_id[] = new int[n];
        Random randomGenerator = new Random();
        
        for (i = 0; i < n; ++i)
        {
            delivery_id[i]= randomGenerator.nextInt(1000);
        }
        
        
        for(i=0;i<n-1;i++)
        {
            delivery_id[i]= randomGenerator.nextInt(1000);
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(delivery_id[j]==delivery_id[i])
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.println("The missing drone's id is: "+delivery_id[i]);
                x++;
            }
            
        }
        if(x!=1)
            System.out.println("All drones are back and resting.");
   }
}