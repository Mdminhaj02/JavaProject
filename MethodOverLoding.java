class OverLoding{
	void add(int a,int b){
	int x;
	x=a+b;
	System.out.println(x);
}
	void add(int a,int b,int c){
	int x;
	x=a+b+c;
	System.out.println(x);
}
}

class Main{
	public static void main(String [] args){
	OverLoding ob = new OverLoding();
	ob.add(5,8,12);
	ob.add(10,30);
}
}
