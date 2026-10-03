package com.example;

public class SwapZero {

    public static void main(String[] args){
        int arr[]={0,1,0,2,0,3,0,4};
        int n=arr.length;
/*
        int temp=0;
        int index=n-1;
            for(int i=n-1;i>0;i--){
            if(arr[i]!=0) {
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index--;
            }
        }
        System.out.println("After Swapping Zeros at the start: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }


        //swap zeros at end
        int arr2[]={1,0,2,0,3,0,4};
        int n2=arr.length;

        int temp2=0;
        int ind=0;
        for(int i=0;i<n2;i++){
            if(arr2[i]!=0) { //if not 0 then swap (arr[ind], arr[i]) and increment ind
                temp2 = arr[ind];
                arr[index] = arr[i];
                arr[i] = temp2;
                index++;
            }
        }
        System.out.println("After Swapping Zeros at the end: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }*/

        int arr2[]={0,1,0,2,0,3,0,4};
        int n2=arr.length-1;
        int j=0;
        for(int i=0;i<=n2;i++){
            if(arr2[i]==0){
                int t=arr2[i];
                arr2[i]=arr2[j];
                arr2[j]=t;
                j++;
            }
        }

        System.out.println("After Swapping Zeros at the end: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
