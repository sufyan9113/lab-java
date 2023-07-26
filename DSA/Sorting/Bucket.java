package DSA.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Bucket 
{
    public static void main(String[] args) 
    {
        float[] a={0.5f,0.4f,0.3f,0.2f,0.1f};
        bucketSort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void bucketSort (float[]a)
    {
        int n=a.length;

        ArrayList<Float>[] bucket=new ArrayList[n];

        for(int i=0; i<n; i++)
        {
            bucket[i]=new ArrayList<Float>();
        }

        for(int i=0; i<n; i++)
        {
            int ind= (int) a[i]*n;
            bucket[ind].add(a[i]);
            
        }
      

        for(int i=0; i<n; i++)
        {
            Collections.sort(bucket[i]);
        }

        int ind=0;
        for(int i=0; i<bucket.length; i++)
        {
            ArrayList<Float> currentBucket=bucket[i];
            for(int j=0; j<currentBucket.size(); j++)
            {   
                a[ind++]=currentBucket.get(j);
            }
        }
        


    }
}
