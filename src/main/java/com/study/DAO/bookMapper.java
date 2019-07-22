package com.study.DAO;

import com.study.model.Books;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/*
* 映射与book相关的sql语句的xml配置文件*/
@Mapper
public interface bookMapper {
    List<Books> selectAll();
}
