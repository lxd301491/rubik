package com.example.rubik.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthMapper {
    public String selectPassword(@Param("account")String account);
}
