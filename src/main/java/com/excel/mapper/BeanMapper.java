package com.excel.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface BeanMapper {
    void createTable(@Param("Map") Map<String, List<String>> Map);

    void dropTable(@Param("TableName") String TableName);

    List<String> selectTable();

    int insertToTable(@Param("Table") String TableName, @Param("Columns") String Columns, @Param("Values") List<String> Values);

    int deleteFromTable(@Param("Table") String TableName, @Param("Ids") List<Integer> Ids);
}
