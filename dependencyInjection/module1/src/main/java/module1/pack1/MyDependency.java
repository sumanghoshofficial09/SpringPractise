package module1.pack1;

import org.springframework.stereotype.Component;

@Component
public class MyDependency {
	
	
	public static void performDependentTask()
	{
		System.out.println("Dependent task");
	}

}
