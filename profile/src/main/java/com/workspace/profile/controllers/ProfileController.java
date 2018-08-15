package com.workspace.profile.controllers;

import com.workspace.profile.Domain.Employee;
import com.workspace.profile.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProfileController {

    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping(value="/v1/user-management/user/{profileId}", method = RequestMethod.GET)
    public Employee getProfileDetails(@PathVariable String profileId) {
        Optional<Employee> employeeBO = employeeMapper.findById(profileId);
        if (employeeBO.isPresent()) {
            return employeeBO.get();
        }
            return employeeBO.get();
    }

    @RequestMapping(value="/v1/user-management/user", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String insertUserProfile(@RequestBody Employee employee){
        Optional<Employee> employeeBO = employeeMapper.findById(employee.getId());
        if (!employeeBO.isPresent()) {
            employeeMapper.save(employee);
            return employee.getId() + " has been interted in User Managament System";
        }else{
            return employee.getId() + " already exist in User Managament System";
        }
    }

    @RequestMapping(value="/v1/user-management/user", method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateUserProfile(@RequestBody Employee employee){
        employeeMapper.save(employee);
        return employee.getId() + " is updated in User Managament System";
    }

    @RequestMapping(value="/v1/user-management/user/{profileId}", method = RequestMethod.DELETE)
    public String deleteUserProfile(@PathVariable String profileId) {
        employeeMapper.delete(profileId);
        return profileId + " is removed in User Managament System";

    }
}
