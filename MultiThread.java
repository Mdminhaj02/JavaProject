class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i=i+2){
            System.out.println("Inside threads"+i);
        }
        System.out.println("Exit A.");
    }
}
class Thread2 extends Thread{
    public void run(){
    for(int i=1;i<=5;i=i+2){
            System.out.println("Inside threads"+i);
        }
        System.out.println("Exit A.");
    }
}

class MultiThread{
    public static void main(String [] ar){
        Thread1 ob1=new Thread1();

        Thread2 ob2=new Thread2();

        System.out.println("Stating thread A.");
        ob1.start();

        System.out.println("Stating thread B.");
        ob2.start();

       System.out.println("Exit Main thread."); 
    }

}