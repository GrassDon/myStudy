package com.study.service;

import com.study.DAO.bookMapper;
import com.study.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//处理book数据库资源的业务层，处理book数据库的增删改查
@Service
public class bookService {
    @Autowired
    bookMapper mapper;
    public List<Books> selectAll()
    {
       return this.mapper.selectAll();
    }
}
