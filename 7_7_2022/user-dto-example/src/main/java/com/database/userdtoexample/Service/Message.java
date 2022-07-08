package com.database.userdtoexample.Service;

import com.database.userdtoexample.Model.User;
import lombok.Data;

import java.util.List;

@Data
public class Message {
    String message;
    List<User> data;
}
