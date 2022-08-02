package com.example.demo.service;

import com.example.demo.model.FileEntity;
import com.example.demo.repository.FileEntityRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

// https://www.youtube.com/watch?v=gdbtue48z2E

@Service
public class FileUploadService {

    @Autowired
    private FileEntityRepository fileEntityRepository;

    private String uploadFolder = this.pathFile();

    public String pathFile() {
        String fileName = "FilePath.txt";
        File file = new File(fileName);
        String path = null;
        BufferedReader bufferedReader = null;

        try {
            if (file.exists()) {
            }else {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            path = bufferedReader.readLine();
            if(path.isEmpty()){
                throw new IOException("File is empty. Plase insert the path");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return path;
    }

    public String randomName(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy (HH-mm-ss)");
        Date date = new Date();

        return formatter.format(date);
    }

    public void uploadToLocal(MultipartFile file) {
        try {
            byte[] data= file.getBytes();
            Path path = Paths.get(uploadFolder + this.randomName() +file.getOriginalFilename());
            Files.write(path, data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveFileDataInDb(MultipartFile file){
        FileEntity fileEntity = new FileEntity();
        fileEntity.setImgname(this.randomName() +file.getOriginalFilename());
        fileEntity.setPath(this.pathFile());
        fileEntityRepository.save(fileEntity);
    }
}
