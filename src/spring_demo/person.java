package spring_demo;

public class person {
      private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [name=" + name + "]";
	}
   
	public void sayhello()
	{
		System.out.println("my name is "+this.name);
	}
}
