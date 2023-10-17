package propert_inj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext con= new ClassPathXmlApplicationContext("config.xml");
		Address info1=(Address)con.getBean("1");
		Address info2=(Address)con.getBean("2");
		Address info3=(Address)con.getBean("3");
		Address info4=(Address)con.getBean("4");
		Address info5=(Address)con.getBean("5");
		Address info6=(Address)con.getBean("6");
		
		
	List<Address> data=new ArrayList<Address>();
	data.add(info1);
	data.add(info2);
	data.add(info3);
	data.add(info4);
	data.add(info5);
	data.add(info6);
	
	for (Address a : data) {
		System.out.println("Name :"+a.getName()+"\n"+"Village :"+a.getVillage()+
				"\n"+"Taluq :"+a.getTaluq()+"\n"+"District :"+a.getDistrict());
		System.out.println("=============================");
	}
	}

}
