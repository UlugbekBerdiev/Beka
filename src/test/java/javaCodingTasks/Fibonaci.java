package javaCodingTasks;

public class Fibonaci {


    public static void main(String[] args) {
        int a =0;
        int b =1;
        int temp =0;


         for(int i= 0; i<10;i++){
             temp=a+b;                       //0+1  =  1
             System.out.print(" "+temp);     // 1
             a=b;      //1
             b=temp;   //1

         }






    }
}
