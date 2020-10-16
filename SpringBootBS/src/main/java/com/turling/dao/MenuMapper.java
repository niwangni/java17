package com.turling.dao;

import com.turling.entity.Menu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper {
    //先查父节点
    @Select("SELECT * FROM menu where pid=0")
    public List<Menu> findMenu();

    @Select("SELECT * FROM menu where pid=#{id}")
    public List<Menu> findMenuById(Integer id);

    //查所有子节点
    @Select("SELECT * FROM menu")
    public List<Menu> findAll2();


}
