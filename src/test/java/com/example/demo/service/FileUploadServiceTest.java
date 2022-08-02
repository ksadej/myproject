package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileUploadServiceTest {

    @Autowired
    private FileUploadService fileUploadService;

    @Test
    public void pathtest() throws IOException {
        String pt = null;
        pt = fileUploadService.pathFile();
        System.out.println(pt);
    }
}