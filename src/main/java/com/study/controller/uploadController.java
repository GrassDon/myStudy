package com.study.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class uploadController {
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest req)
    {
        String fileName = file.getOriginalFilename();
        String filePath = "D:/springboot/src/main/resources/static/";
        System.out.println(fileName);
        File dest = new File(filePath+fileName);
        try {
            file.transferTo(dest);
            System.out.println("上传成功");
            return "上传成功";
        } catch (IOException e) {
            System.out.println("上传失败");
        }
        return "上传失败！";
    }
}