package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext contex=new ClassPathXmlApplicationContext("autowire/auto.xml");
        Emp emp=contex.getBean("emp1",Emp.class);// . class is type cast method
        System.out.println(emp);
    
    
    }
}
