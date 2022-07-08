package com.database.userdtoexample.Controller;

import com.database.userdtoexample.DTO.UserDTO;
import com.database.userdtoexample.Model.User;
import com.database.userdtoexample.Service.Message;
import com.database.userdtoexample.Service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController{
    @Autowired
    UserService userService;

    //READALL
    @GetMapping("/userData")
    public ResponseEntity<Message> getAllData() throws JsonProcessingException {
        Message message = (Message) userService.getAllData();
//        System.out.println("At Controller");
//        System.out.println("Object msg data :"+message.getMessage());
//        System.out.println("Object List data :"+message.getObj());
//        Object obj1 = new Object();
//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String json = ow.writeValueAsString(message);
        return new ResponseEntity<Message>(message, HttpStatus.ACCEPTED);
    }


    //READAtPosition
    @RequestMapping(value = "/userData/{id}", method = RequestMethod.GET)
    public ResponseEntity<Message> getData(@PathVariable Long id){
        Message message = userService.getData(id);
        return new ResponseEntity<Message>(message, HttpStatus.ACCEPTED);
    }

    //Create
    @RequestMapping(value = "/userData",method = RequestMethod.POST)
    public ResponseEntity<Message> putData(@RequestBody User user){
        Message message = userService.putData(user);
        return new ResponseEntity<Message>(message, HttpStatus.ACCEPTED);
    }

    //Update
    @RequestMapping(value = "/userData/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Message> updateData(@PathVariable Long id, @RequestBody User user){
        Message message = userService.updateData(id,user);
        return new ResponseEntity<Message>(message,HttpStatus.ACCEPTED);
    }

    //Delete
    @RequestMapping(value = "/userData/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Message> deleteDate(@PathVariable Long id){
        Message msg = userService.deleteData(id);
        return new ResponseEntity<Message>(msg,HttpStatus.ACCEPTED);
    }
}