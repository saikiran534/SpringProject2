package com.example.SpringProject2.controller;

import com.example.SpringProject2.model.CompanyConfig;
import com.example.SpringProject2.model.Employee;
import com.example.SpringProject2.model.PublicHolidays;
import com.example.SpringProject2.model.employeeHolidays;
import com.example.SpringProject2.service.EServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private EServices employeeServices;

    ///****************** ADD Employee Details *******/////
    @PostMapping("/add-employee")
    public String postEmployee(@RequestBody Employee employerDetails)
    {
        return employeeServices.addEmployee(employerDetails);
    }

    ///****************** All Employee Details *******/////
    @GetMapping("/get-all-employee")
    public List<Employee> getEmployee(){
        return employeeServices.getAllEmployees();
    }




    ///****************** Add Public Holidays *******/////
    @PostMapping("/add-publicholiday")
    public String postPublicHoliday(@RequestBody PublicHolidays publicHolidays)
    {
        return employeeServices.addPublicHoliday(publicHolidays);
    }

    ///****************** All Public Holidays *******/////
    @GetMapping("/get-publicholidays")
    public List<PublicHolidays> getPublicHolidays()
    {
        return employeeServices.getAllPublicHolidayList();
    }

    ///****************** Add Company Config *******/////
    @PostMapping("/add-companyconfig")
    public String postCompanyConfig(@RequestBody CompanyConfig companyConfig)
    {
        return employeeServices.addCompanyConfig(companyConfig);
    }

    ///****************** Get All Company Configurations *******/////




    @GetMapping("/get-companyconfig")
    public List<CompanyConfig> getcompanyConfig()
    {
        return employeeServices.getAllCompanyConfigList();
    }





    ///****************** Get Holidays of Specific Employee *******/////
    @GetMapping("/get-holidaysofspecific-emploiyee/{id}")
    public Employee getHoidaysById(@PathVariable int id)
    {
        return employeeServices.getHoidaysById(id);
    }




    ///************* Pending Holidays  ********///////


    @GetMapping("/get-pendingleaves/{id}")
    public String getPendingHolidays(@PathVariable int id)
    {
        return employeeServices.PendingLeaves(id);
    }



    ///************* Holidays of an employee for a Specific Time period   ********///////


    @GetMapping("/get-empholidays/{id}/{fromDate}/{toDate}")
    public List<employeeHolidays> getEmployeHolidays(@PathVariable int id, String fromDate, String toDate)
    {
        return employeeServices.EmployeeHolidays(id,fromDate,toDate);
    }



}
