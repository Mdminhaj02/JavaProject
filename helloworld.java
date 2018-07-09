class A{
	public static void main(String[] ar){
		int sum=0;
		for(int i=0;i<ar.length;i++){
			
			sum+=Integer.parseInt(ar[i]);
		}
		//int a=Integer.parseInt(ar[0]);
		//int b=Integer.parseInt(ar[1]);
		
		System.out.println("Total is : "+sum);
		
	}
	
}
