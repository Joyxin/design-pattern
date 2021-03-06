package com.example.designpattern.mediator;

import lombok.Data;

@Data
public class User {
    private String name;
    public User(String name){
        this.name  = name;
    }
    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
