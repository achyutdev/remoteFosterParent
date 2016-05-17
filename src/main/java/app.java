import java.util.List;

import mum.edu.foster.domain.Person;
import mum.edu.foster.service.ChildrenService;

import org.apache.tiles.request.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class app {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context/root-context.xml");
		
		ChildrenService childrenService = (ChildrenService)  ((BeanFactory) context).getBean("childrenService");
		List<Person> per = childrenService.findAll();
		for(Person p: per){
			System.out.println(p.getFirstName());
		}
	}

}
