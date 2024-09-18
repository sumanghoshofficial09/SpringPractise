package module1.pack3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import module1.pack2.UserClass;

@Configuration
@ComponentScan({"module1.pack2","module1.pack1"})
public class Runner {
	
	
	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.register(Runner.class);
		context.refresh();
		UserClass obj=context.getBean(UserClass.class);
		
		obj.performTask();
	}

}
