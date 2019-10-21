package com.study.controller;

import com.study.model.flowers;
import com.study.service.flowersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class flowerController {
    @Autowired
    flowersService flowersService;

    @GetMapping("/findAllFlowers")
    public void findAll(){
        System.out.println("finding!!!");
        //页数2页，每页三条数据。
        PageRequest pageRequest = PageRequest.of(2,3);
        Page<flowers> page = flowersService.getFlowerByPage(pageRequest);
        System.out.println("总页数:"+page.getTotalPages());
        System.out.println("总记录数："+page.getTotalElements());
        System.out.println("查询结果："+page.getContent());
        System.out.println("当前页数："+page.getNumber()+1);
        System.out.println("当前页记录数："+page.getNumberOfElements());
        System.out.println("每页记录数："+page.getSize());
    }
    @PostMapping("/saveFlower")
    public void saveFlower(@Valid @RequestBody flowers flower){
        flowers flowers = new flowers();
        System.out.println("start!!!");
        flowers.setId(flower.getId());
        flowers.setName(flower.getName());
        flowers.setNum(flower.getNum());
        flowers.setOwner(flower.getOwner());
        flowers.setPrice(flower.getPrice());
        System.out.println(flowers.toString());
        this.flowersService.addFlower(flowers);
    }
    @GetMapping("/test")
    public List<flowers> test(){
        System.out.println("testWay");
        return flowersService.getAllFlowers();
    }
}
