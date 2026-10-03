package com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        //Input  : arr[] = [5, 2, -1, 0, 3], k = 3
        //Output : 6
        //[1, 4, 2, 10, 23, 3, 1, 0, 20], k=4
        int arr[]={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int Fmax=0;
        int sum =0;
        int k=4;
        /*for(int i=0;i<arr.length-k;i++){
        sum =0;
        for(int j=i;j<k+i;j++){
            sum = sum +arr[j];
        }
        Fmax=Math.max(sum,Fmax);
        }
        System.out.println(Fmax);*/
        for(int i=0;i<k;i++){
            Fmax = Fmax +arr[i];
        }
        sum=Fmax;
        for(int i=k;i<arr.length-k;i++){
            sum=sum+arr[i]-arr[i-k];
            Fmax=Math.max(sum,Fmax);
        }
        System.out.println(Fmax);//o(n) complexity
    }
}