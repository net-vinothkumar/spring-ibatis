package com.learnandshare.springboot.rest.example.springbootmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MobileMyBatisRepository {

    @Select("select * from mobile")
    List<Mobile> findAll();

    @Select("SELECT * FROM mobile WHERE id = #{id}")
    Mobile findById(int id);

    @Delete("DELETE FROM mobile WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO mobile(id, name, model, price) VALUES (#{id}, #{name}, #{model}, #{price})")
    int insert(Mobile mobile);

    @Update("Update mobile set name=#{name}, model=#{model}, price=#{price} where id=#{id}")
    int update(Mobile mobile);
}
