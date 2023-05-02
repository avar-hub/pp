
class anon {
	void show()
	{
		System.out.println("Hello");
	}
}
 class anonymous
{
	public static void main(String[] args) {
		anon obj=new anon()
				{
					public void show()
					{
						System.out.println("i am n anonymous class");
					}
				};
		obj.show();
		
	}
}