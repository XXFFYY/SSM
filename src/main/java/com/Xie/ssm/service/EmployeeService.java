package com.Xie.ssm.service;

import com.Xie.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @date: 2022/8/13 16:59
 * @author: XieFeiYu
 * @email: 32096231@qq.com
 * @Description:
 */
public interface EmployeeService {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();
    
    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
