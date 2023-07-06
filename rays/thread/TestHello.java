package rays.thread;
@FunctionalInterface
public   interface TestHello {
	
	public void show();
	
	public default void DefaultMethod()
	{
		System.out.println("DefaultMethod");
	}
	public static void StaticMethod()
	{
		System.out.println("static method");
	}

}
