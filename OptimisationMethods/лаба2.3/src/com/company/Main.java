package com.company;

public class Main {

    public static void main(String[] args)
    {
        int n = 15;
	    int[] arr = Fibonachi(n);
	    double a = 1;
	    double b = 3;
	    double[] x = new double[n];
	    double[] fs = new double[n];
	    for(int i = 1; i < n-1; i++){
	        x[i] = a + (arr[i - 1]/arr[i + 1]) * (b - a);

	        fs[i] = F(x[i]);
        }

	    double extremum = 0;

	    for(int i = 0; i < n; i++){
	        System.out.println(fs[i]);
	        if(extremum < fs[i]){
	            extremum = fs[i];
            }
        }

	    System.out.println("extremum " + extremum);
    }


    public static int[] Fibonachi(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i =2; i < n; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }

    public static double F(double x){
        return Math.pow(3 * x * x - x * x * x, 1./3);
    }
}
