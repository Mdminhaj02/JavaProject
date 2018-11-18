  import java.util.Scanner;
  class MethodOverLoding {
      double largeNum(double a,double b){
          double max;
          if(a>b) {
          max=a;
          }
          else{
          max=b;
          }
      return max;
      }
      int largeNum(int x,int y,int z){
          int max;
          if((x>y) && (x>z)){
          max=x;
          }
          else if(y>z){
          max=y;
          }
          else{
          max=z;
          }  
      return max;
      }
      int lirgeNum(int p,int q){
          int max;
          if(p>q){
          max=p;
          }
          else{
          max=q;
          }
      return max;
      }
  }
  class Result{
  public static void main(String [] args){
  Scanner input=new Scanner(System.in);
  int a,b,c,d,e;
  double x,y,z;
  System.out.println("value of a(i): ");
  a=input.nextInt();
  System.out.println("value of b(i): ");
  b=input.nextInt();
  System.out.println("value of c(i): ");
  c=input.nextInt();

  System.out.println("value of x(d): ");
  x=input.nextDouble();
  System.out.println("value of y(d): ");
  y=input.nextDouble();

  MethodOverLoding ob=new MethodOverLoding();

  z=ob.largeNum(x, y);
  d=ob.largeNum(a, b, c);
  e=ob.lirgeNum(a, b);
      System.out.println("Max for Double :"+z);
      System.out.println("Max for three parametar int :"+d);
      System.out.println("Max for two parametar int :"+e);

      }
  }
