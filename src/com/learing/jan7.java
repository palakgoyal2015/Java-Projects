package com.learing;
 
public class jan7 {
    public void func(){
    int i=20;
    int j=30;
    System.out.println(i+j);
 }  
 public void myModule(){
    int i=2;
    int j=14;
    System.out.println(i%j);
 } 
 public void myMethod(){
    int i=10;
    int j=20;
    j++;
    System.out.println(j); 
    System.out.println(--i);
 } 

public void myMethod2(){
    int i=10;
    int j=20;
    j+=i;
    System.out.println(j);
} 
public void studentResult(int marks){
    if(marks>50){
        System.out.println("pass");
    } 
    else{
        System.out.println(false);
    }
}
public void studentResult2(int marks){
    if(marks>=70 || marks<=100){
        System.out.println("grade A");
    }else{
        System.out.println("Good");
    }
}
public int myTernary(){
    int i=10;
    int j=5;
    // if(i>j){
    //     return 1;
    // } 
    // else{
    //     return -1;
    // } 
    return i>j?1:-1;
} 
public boolean ternary2(){
    int i=20;
    int j=25;
    return i>j?true:false;
}
public void evenOdd(int num){
    if(num%2==0){
        System.out.println(num + " is even");
    } 
    else if(num%2!=0){
        System.out.println(num +" is odd");
    }else{
        System.out.println("invalid number");
    }

}
 public static void main(String[] args){ 
    jan7 o1=new jan7();
     o1.func(); 
     o1.myModule(); 
     o1.myMethod();
     o1.myMethod2(); 
     int i=9;
     int j=9;
     System.out.println(i==j);
     o1.studentResult(78);
     o1.studentResult2(200); 
   System.out.println(o1.myTernary());
   System.out.println(o1.ternary2()); 
   o1.evenOdd(111);
 }
}
