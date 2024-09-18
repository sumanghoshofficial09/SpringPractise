package module1.pack2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import module1.pack1.MyDependency;

@Component
public class UserClass {
	
	@Autowired
	MyDependency  mydependency;
	
	
	
	public UserClass(MyDependency mydependency) {
		super();
		this.mydependency = mydependency;
	}



	public void performTask()
	{
		
		
		mydependency.performDependentTask();
	}

}
