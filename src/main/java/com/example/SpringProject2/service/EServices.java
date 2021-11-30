package com.example.SpringProject2.service;

import com.example.SpringProject2.model.CompanyConfig;
import com.example.SpringProject2.model.Employee;
import com.example.SpringProject2.model.PublicHolidays;
import com.example.SpringProject2.model.employeeHolidays;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class EServices {

    ///****************** Employee Details *******/////


    private List<Employee> employeeList;
    public List<CompanyConfig> companyConfigList;
//    private List<CompanyConfig> holidays;
    public String addEmployee(Employee employee)
    {
        if(CollectionUtils.isEmpty(employeeList))

        {
            employeeList=new ArrayList<>();
        }
        employeeList.add(employee);
        return "Added SuccessFully";
    }
    public List<Employee> getAllEmployees()
    {
        return employeeList;
    }


///****************** Public Holidays *******/////

    private List<PublicHolidays> publicHolidayList;
    public String addPublicHoliday(PublicHolidays publicHolidays)
    {
        if(CollectionUtils.isEmpty(publicHolidayList))
        {
            publicHolidayList = new ArrayList<>();
        }
         publicHolidayList.add(publicHolidays);
        return "Added Successfully";
    }

    public List<PublicHolidays> getAllPublicHolidayList()
    {
        return publicHolidayList;
    }

    ///************* Add Company Config  ********///////


    public String addCompanyConfig(CompanyConfig companyConfig)
    {
        if(CollectionUtils.isEmpty(companyConfigList))
        {
            companyConfigList = new ArrayList<>();
        }
        companyConfigList.add(companyConfig);
        return "Added Successfully";
    }

    ///************* Company Config  ********///////
    public List<CompanyConfig> getAllCompanyConfigList()
    {
        return companyConfigList;
    }

    ///************* holidays of Specific Employee  ********///////



    public Employee getHoidaysById(int id)
    {
        return employeeList.stream().filter(employee -> employee.getEmployeeId()==id).findFirst().orElse(null);
    }



    ///************* Holidays of an employee for a Specific Time period   ********///////

    public List<employeeHolidays> EmployeeHolidays(int id, String fromDate, String toDate)
    {
        List<employeeHolidays> data = new ArrayList<>();
        Optional<Employee> emp = employeeList.stream().filter(details -> details.getEmployeeId()==id).findFirst();
//        emp.stream().forEach(det-> {
//            if(det.getHolidays().stream().forEach(y-> y.getFromDate())fromDate)
//            {
//
//            }
//        });
        emp.get().getHolidays().stream().forEach(y->{
            if(y.getFromDate().equals(fromDate))
            {
                if(!y.getFromDate().equals(toDate))
                {
                 data.add(y);



                }
            }
        });
    return data;

    }



    ///************* Pending Holidays  ********///////


    public String PendingLeaves(int id)
    {
        AtomicInteger res = new AtomicInteger();
        AtomicInteger day = new AtomicInteger();
        int pendingLeaves;
        CompanyConfig totalHolidays=new CompanyConfig();
        Optional<Employee> date = employeeList.stream().filter(emp -> emp.getEmployeeId()==id).findFirst();
        date.get().getHolidays().stream().forEach(x->{
            res.set(day.addAndGet( x.getNoOfDays()));
        });
        int d = res.intValue();
        int c = day.intValue();
        int totalDays =  companyConfigList.get(0).getNumberOfHolidays();
        pendingLeaves=totalDays-c;
        System.out.println(d);
        System.out.println(pendingLeaves);

        return "EmployeeNae : "+employeeList.get(0).getName()+"\nPending Leaves"+":"+pendingLeaves;
    }
}
