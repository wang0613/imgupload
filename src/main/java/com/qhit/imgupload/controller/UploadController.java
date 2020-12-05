package com.qhit.imgupload.controller;

import com.qhit.imgupload.pojo.Picture;
import com.qhit.imgupload.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;


@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping("/upload")
    public ModelAndView upload(@RequestParam("uploadFile") MultipartFile uploadFile) {
        String originalFilename = uploadFile.getOriginalFilename();
        System.out.println("originalFilename = " + originalFilename);
        //调用service完成存放用户民
        Picture picture = new Picture();
        picture.setPic_name(originalFilename);
        uploadService.add(picture);

        try {
            //转存
            uploadFile.transferTo(new File("D:\\IdeaProjects\\imguploadtest\\src\\main\\webapp\\img\\"+originalFilename));
        }catch (Exception ex){
            ex.printStackTrace();
        }

        //名称存储到
        ModelAndView mv = new ModelAndView();
        mv.addObject("pic_name",originalFilename);
        mv.setViewName("show");
        return mv;


    }
}
