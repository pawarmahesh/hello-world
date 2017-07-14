/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author uti
 */
public class Triangle {
    private String triTyp;
    private int height=0;

    public String getTriTyp() {
        return triTyp;
    }

    public void setTriTyp(String triTyp) {
        this.triTyp = triTyp;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public void draw(){
        System.out.println(" * "+getTriTyp()+" triangle of height "+getHeight()+" is drawn!");
    }
}
