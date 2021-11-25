package Test1;

  class AccessModifier1 {
	
	 protected int x=10;

	 protected void method1() {
		
		System.out.println("Default - method1");
	}
	
	
	public static void main(String[] args) {
		
		AccessModifier1 am=new AccessModifier1();
		am.method1();
		System.out.println(am.x);

	}

}
