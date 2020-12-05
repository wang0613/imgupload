package com.qhit.imgupload.service.impl;

import com.qhit.imgupload.mapper.UploadMapper;
import com.qhit.imgupload.pojo.Picture;
import com.qhit.imgupload.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadServiceImpl implements UploadService {

    @Autowired
    private UploadMapper uploadMapper;

    @Override
    public void add(Picture picture) {
        uploadMapper.add(picture);
    }
}
