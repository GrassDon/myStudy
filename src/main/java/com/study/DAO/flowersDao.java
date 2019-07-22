package com.study.DAO;

import com.study.model.flowers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 如果想自定义一个接口，可以参照这篇文章：https://www.cnblogs.com/soul-wonder/p/9051649.html
 * @NoRepositoryBean
 * DAO层会出现一些问题，除非用@Query注解自定义某个sql方法，否则无法写jpa没有预定义的方法，即使符合语法。
 * 不符合语法，会在项目加载时报错。
 */

public interface flowersDao extends JpaRepository<flowers,Integer> {

    List<flowers> findAllByPriceIs(Float price);

    //以下语句不符合jpa预定义的语法
    /*List<flowers> findflowersByOwnerStartingWith(String owner);
    List<flowers> findflowersByPriceGreaterThan(Float price);*/

    //自定义数据库查询语言，有时jpa预制的语句并不能完成所有业务需求，所以需要手写一些sql语句。
    @Query(value = "select * from flowers where id=(select max(id) from flowers)",nativeQuery = true)
    flowers getMaxIdBook();
}