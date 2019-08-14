package com.kualalumpur.basic.gui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * @Description TODO
 * @Author KualaLumpur
 * @Date 2019/8/14 1:17
 **/
public class MainFrame {
    @FXML
    public TextField username;

    @FXML
    protected void sayHello(){
        System.out.println(username.getText());
    }
}
