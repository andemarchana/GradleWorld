package hello;

public class Greeter {

	private String name = "";

	public String getName()

	{

		return name;

	}

	public void setName(String name)

	{

		this.name = name;

	}

	public String sayHello()

	{

		if (name == "")

		{

			return "Hello! ";

		}

		else

		{

			return "Hello " + name + "!";

		}

	}
	
	public String sayHelloQALeads()

	{

		if (name == "")

		{

			return "Hello! To QA Leads";

		}

		else

		{

			return "Hello To QA Leads " + name + "!";

		}

	}

}