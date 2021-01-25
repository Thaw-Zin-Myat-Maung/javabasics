package com.solt.jdc.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.media.AudioClip;

public class filecontroller {

    @FXML
    private Label output;
    
    private int num = 1;
    private int numc = 0;
    @FXML
    void cc() {
    	int q = 0;
     if (Integer.valueOf(output.getText()) >= 100) {
		num = 2;
		q = Integer.valueOf(output.getText()) - 100;
		numc = Integer.valueOf(output.getText()) - 100;
		output.setText(String.valueOf(q));
	}
    }

    @FXML
    void click() {
    	
    	
     
     numc = numc + num;
     
     output.setText(String.valueOf(numc));
     playsound("clicksound.m4a");
     
    }

    @FXML
    void dd() {
    	int i = 0;
        if (Integer.valueOf(output.getText()) >= 1000) {
   		num = 5;
   		i = Integer.valueOf(output.getText()) - 1000;
   		numc = Integer.valueOf(output.getText()) - 1000;
   		output.setText(String.valueOf(i));
   	}
        
    }
    @FXML
    void gg() {
    	int i = 0;
        if (Integer.valueOf(output.getText()) >= 2000) {
   		num = 10;
   		i = Integer.valueOf(output.getText()) - 2000;
   		numc = Integer.valueOf(output.getText()) - 2000;
   		output.setText(String.valueOf(i));
   		
    }
    }
    public void playsound(String item) {
    	AudioClip clip = new AudioClip(getClass().getResource(item).toString());
    	clip.play();
    }
}

