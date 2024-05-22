package setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import constructorinjection.Student;
import listandmap.employee;
import listandmap.student;

public class mainclass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		Employee emp =context.getBean(Employee.class);
		System.out.println(emp);

		Student st = context.getBean(Student.class);
		System.out.println(st);

		employee em = context.getBean(employee.class);
		em.display();
		
		student stu=context.getBean(student.class);
		System.out.println(stu);
	}
}
