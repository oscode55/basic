package com.kualalumpur.basic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @Description TODO
 * @Author KualaLumpur
 * @Date 2019/8/14 1:24
 **/
public class MainGuiAPP extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load( getClass().getResource("/gui/MainGui.fxml") );

        primaryStage.setTitle("标题文字");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
