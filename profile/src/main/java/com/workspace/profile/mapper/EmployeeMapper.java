package com.workspace.profile.mapper;

import com.workspace.profile.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface EmployeeMapper extends JpaRepository<Employee, String> {

    Optional<Employee> findById(String id);

}
