package net.htrap.dtoexamplestudent.Controller;

import net.htrap.dtoexamplestudent.DTO.UserDTO;
import net.htrap.dtoexamplestudent.Model.User;
import net.htrap.dtoexamplestudent.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/userData")
    public List<UserDTO> getAllData(){
        return userService.getAllData();
    }

    //Create
    @RequestMapping(value = "/userData", method = RequestMethod.POST)
    public List<UserDTO> createData(@RequestBody User user){
        userService.createData(user);
        System.out.println("Sys Message: Data Generated Successfully!");
        return userService.getAllData();
    }

    //Read
    @RequestMapping(value = "/userData/{id}", method = RequestMethod.GET)
    public UserDTO readData(@PathVariable Long id){
        return userService.readData(id);
    }

    //Update
    @RequestMapping(value = "/userData/{id}", method = RequestMethod.PUT)
    public UserDTO updateData(@PathVariable Long id,@RequestBody User u1){
        return userService.updateData(id,u1);
    }

    //Delete
    @RequestMapping(value = "/userData/{id}", method = RequestMethod.DELETE)
    public UserDTO deleteData(@PathVariable Long id){
        System.out.println("Sys Message: Data Deleted Successfully!");
        return userService.deleteData(id);
    }
}
