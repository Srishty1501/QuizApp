/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineExam.pojo;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.abs;
import java.util.Iterator;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SRISHTY RANI
 */
public class PrisonersE {
   int N;
   ArrayList<Integer> adj[];
   PrisonersE(int n){
       N=n;
   adj=new ArrayList[N];
   for(int i=0;i<N;i++){
   adj[i]=new ArrayList<>();
   }
  }
   void buildTree(int[][] arr , int s){
  for(int i=0;i<s-1;i++){
  int x= arr[i][0];
  int y=arr[i][1];
  for(int j=i+1;j<s;j++){
  int x1=arr[j][0];
  int y1=arr[j][1];
  int x2=abs(x1-x);
  int y2=abs(y1-y);
  
  double dist=Math.sqrt((x2*x2)+(y2*y2));
  if(dist<=200){
  adj[i].add(j);
  adj[j].add(i);
  }
  else continue;
  
  }
  }
   
   }
   /*static void printGraph(PrisonersE pe) 
    {        
        for(int v = 0; v < pe.N; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: pe.adj[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
    } */
   int isReachable(int s, int d){
   ArrayList<Integer> queue= new ArrayList<>();
   boolean visited[]= new boolean[N];
   visited[s]=true;
   queue.add(s);
   while(queue.size()!=0){
   s=queue.remove(0);
   int v;
   Iterator<Integer> it= adj[s].iterator();
   while(it.hasNext()){
   v=it.next();
   if(v==d)
       return 1;
   
   if(!visited[v]){
   visited[v]=true;
   queue.add(v);
   
   
   }
   }
   
   
   }
   return 0;
   }
   
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    System.out.println("enter the details");
   int L;
   int W;
   int no;
   int num;
   L=sc.nextInt();
   W=sc.nextInt();
   no=sc.nextInt();
   if(L>400){
   num=no+4;
   
   
   int arr[][]=new int[num][num];
   arr[0][0]=L/2;
   arr[0][1]=0;
   arr[1][0]=L/4;
   arr[1][1]=0;
   arr[2][0]=L/6;
   arr[2][1]=0;
   
   
   arr[3][0]=L/2;
   arr[3][1]=W;
   /*arr[4][0]=L/4;
   arr[4][1]=W;
   arr[5][0]=L/6;
   arr[5][1]=W;*/        
  
    
   for(int i=4;i<num;i++){
   int x=sc.nextInt();
   int y=sc.nextInt();
   arr[i][0]=x;
   arr[i][1]=y;
   }
   PrisonersE pe=new PrisonersE(num);
   pe.buildTree(arr, num);
   //pe.printGraph(pe);
   int result1,result2,result3;
   result1=pe.isReachable(0,3);
   System.out.println(result1);
   
   result2=pe.isReachable(1,3);
   System.out.println(result2);
   
   result3=pe.isReachable(2,3);
   System.out.println(result3);
   if(result1==1||result2==1||result3==1)
   
   {System.out.println(1);}
   else
   {System.out.println(0);}
   }
   else
   {
   num=no+2;
   
   
   int arr[][]=new int[num][num];
   arr[0][0]=L/2;
   arr[0][1]=0;
   arr[1][0]=L/2;
   arr[1][1]=W;
  
    
   for(int i=2;i<num;i++){
   int x=sc.nextInt();
   int y=sc.nextInt();
   arr[i][0]=x;
   arr[i][1]=y;
   }
   PrisonersE pe=new PrisonersE(num);
   pe.buildTree(arr, num);
   //pe.printGraph(pe);
   int result;
   result=pe.isReachable(0,1);
   
   
   System.out.println(result);
   
   
   
   
   
   
   
   }
   
   
   
   
   }
    
}
 /*int size=arr.size();
   for(int k=0;k<size-2;k=k+2){
   int x=arr.get(k);
   int y=arr.get(k+1);
   for(int m=k+2;m<size;m=m+2){
   int x1=arr.get(m);
   int y1=arr.get(m+1);
   double dist=Math.sqrt((x1*x1)+(y1*y1));
   if(dist<=200){
   adj[k].add(m);
   
   }*/
/*ArrayList<Integer> arr= new ArrayList<>();
   arr.add(250);
   arr.add(0);
   arr.add(250);
   arr.add(300);
   Scanner sc = new Scanner(System.in); 
   while(sc.hasNextInt())
   {
   int x=sc.nextInt();
   int y=sc.nextInt();
   //if(!(x==250&& y==0)||!(x==250&&y==300)){
   arr.add(x);
   arr.add(y);
   
   }*/
