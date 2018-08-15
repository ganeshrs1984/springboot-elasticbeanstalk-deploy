package com.workspace.profile;

import com.workspace.profile.Domain.Employee;
import com.workspace.profile.mapper.EmployeeMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProfileApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ProfileApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeMapper repository) {
		return (args) -> {
			repository.save(new Employee("1","Selva","TCS","2","JAVA"));
			repository.save(new Employee("2","Ganesh","Modis","2","HADOOP"));
			repository.save(new Employee("3","Dinesh","Infosys","2","GRAILS"));
			repository.save(new Employee("4","Rekha","Wipro","2","JAVA"));
			repository.save(new Employee("5","Vidya","TCS","2","QA"));
			repository.save(new Employee("6","Ishaan","CTS","2","SCALA"));
			repository.save(new Employee("7","Yalini","Wipro","2","GROOVY"));
			repository.save(new Employee("8","Suresh","Capgemni","2","QA"));
			repository.save(new Employee("9","Barani","Tech","2","SAP"));

		};

	}
}
