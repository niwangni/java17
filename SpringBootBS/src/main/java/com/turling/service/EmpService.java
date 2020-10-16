package com.turling.service;

import com.turling.entity.EasyUIDataGrid;
import com.turling.entity.Emp;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmpService {
    public EasyUIDataGrid showEmp(Integer curPage,Integer pageSize);

    public void addEmp(Emp emp);

    public void updateEmp(Emp emp);

    public void delEmpById(Integer empno);

}
