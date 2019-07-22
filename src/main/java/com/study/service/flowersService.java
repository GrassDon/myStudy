package com.study.service;

import com.study.DAO.flowersDao;
import com.study.model.flowers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.crypto.interfaces.PBEKey;
import java.util.List;

@Service
public class flowersService {
    @Autowired
    flowersDao flowersDao;

    //JpaRespository接口和其父类提供的save方法，可以看JpaRespository和其父类的方法，找到一些预定义的方法。
    public void addFlower(flowers flowers){
        flowersDao.save(flowers);
    }

    //分页查询，返回值为page<E>,其中包含分页数据，比如总记录数，总页数，每页记录数，当前页记录数等等。
    public Page<flowers> getFlowerByPage(Pageable pageable)
    {
        return  flowersDao.findAll(pageable);
    }

    public List<flowers> getAllFlowers()
    {
        return flowersDao.findAll();
    }

    /*public List<flowers> getBookByAuthorStartingWith(String owner)
    {
        return flowersDao.getflowersByOwnerStartingWith(owner);
    }*/
}
