package com.kualalumpur.basic.test;

import com.kualalumpur.basic.utils.FtpUtil;
import lombok.extern.slf4j.Slf4j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author KualaLumpur
 * @Date 2019/7/31 0:55
 **/
@Slf4j
public class MainClass {
    //FTP上传文件集合
    private static void testFtpUpload(){
        File file = new File("test.txt");
        File file2 = new File("test2.txt");
        List<File> fileList =  new ArrayList<File>();
        fileList.add(file);
        fileList.add(file2);
        try {
            FtpUtil.uploadFile(fileList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        log.info( PropertiesUtil.getProperty("ftp.server.http.prefix") );//测试Properties
//        testFtpUpload();//测试FTP上传
        String fileName = "gui/MainGui.fxml";
        System.out.println(fileName);
    }
}
