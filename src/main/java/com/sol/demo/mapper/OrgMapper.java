package com.sol.demo.mapper;

import com.sol.demo.entity.Org.Org;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrgMapper {
    @Select("select id,name from k_org limit 10")
    List<Org> findAll();
    @Update("update k_org set name = #{name} where id = #{id}")
    void updateByid(@Param("id") int id,@Param("name") String name);
}
