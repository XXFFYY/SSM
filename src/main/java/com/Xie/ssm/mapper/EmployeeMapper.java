package com.Xie.ssm.mapper;

import com.Xie.ssm.pojo.Employee;

import java.util.List;

/**
 * @date: 2022/8/13 17:21
 * @author: XieFeiYu
 * @email: 32096231@qq.com
 * @Description:
 */
public interface EmployeeMapper {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
