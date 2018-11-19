class Implem implements Student {
    public float mark;
    
    @Override
    public void disPlay(){
    System.out.println("Student Name: "+name);
    System.out.println("Student Name: "+roll);
}
public void getMark(){
    mark=190.9f;
}
public void disPlayMark(){
    System.out.println("The student find number : " +mark);
}
}

public class InterfaceImpliment {
    public static void main(String [] ar){
    Implem ob=new Implem();
    ob.getMark();
    
    ob.disPlay();
    
    ob.disPlayMark();
    
    }
}
