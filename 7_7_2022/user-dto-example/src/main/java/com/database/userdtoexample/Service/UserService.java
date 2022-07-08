package com.database.userdtoexample.Service;


import com.database.userdtoexample.DTO.UserDTO;
import com.database.userdtoexample.Model.User;
import com.database.userdtoexample.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class UserService {



    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserRepository userRepository;

    //Read All Data
    public Message getAllData(){
        Message msg = new Message();

        String sql = "SELECT * FROM dbo.Users";
        List<User> users= jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
//        users.forEach(System.out :: println);
        msg.message="Data:";
        msg.data =users;
//        System.out.println("At Service:");
//        System.out.println("User msg:"+msg.message);
//        System.out.println("User obj:"+msg.obj);

        UserDTO dto = new UserDTO();
        return msg;
    }

    //ReadAtPosition
    public Message getData(Long id){
        Message msg = new Message();
        String sql= "Select * From dbo.Users Where id="+id+";";
        List<User> users=jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(User.class));
        msg.message="Selected Data:";
        msg.data = users;
        return msg;
    }

    //Create
    public Message putData(User user){
        Message msg = new Message();
        String sql = "Insert into dbo.Users (id,firstName,lastName,password,email) values ("+"'"+user.getId()+"'"+","+"'"+user.getFirstName()+"'"+","+"'"+user.getLastName()+"'"+","+"'"+user.getPassword()+"'"+","+"'"+user.getEmail()+"'"+");";
        System.out.println("\n\nSQL query:"+sql);
        jdbcTemplate.execute(sql);
        String sql1= "Select * From dbo.Users Where id="+user.getId()+";";
        System.out.println("SQL1 query:"+sql1);

        List<User> users= jdbcTemplate.query(sql1,BeanPropertyRowMapper.newInstance(User.class));
        msg.message="Data Created Successfully!";
        msg.data = users;

        return msg;
    }

    //UPDATE
    public Message updateData(Long id,User user){
        Message msg = new Message();
        String sql = "Update dbo.Users SET id = '"+user.getId()+"', firstName = '"+user.getFirstName()+"', lastName = '"+user.getLastName()+"', password = '"+user.getPassword()+"', email = '"+user.getEmail()+"' where id = "+user.getId()+";";

        System.out.println("\n\nSQL query:"+sql);
        jdbcTemplate.execute(sql);
        String sql1= "Select * From dbo.Users Where id="+user.getId()+";";
        System.out.println("SQL1 query:"+sql1);

        List<User> users= jdbcTemplate.query(sql1,BeanPropertyRowMapper.newInstance(User.class));
        msg.message="Data Updated Successfully!";
        msg.data = users;

        return msg;
    }

    //DELETE
    public Message deleteData(Long id){
        Message msg = new Message();
        String sql1= "Select * From dbo.Users Where id="+id+";";
        System.out.println("SQL1 query:"+sql1);

        List<User> users= jdbcTemplate.query(sql1,BeanPropertyRowMapper.newInstance(User.class));

        String sql = "Delete from dbo.Users where id ="+id+";";
        System.out.println("\n\nSQL query:"+sql);
        jdbcTemplate.execute(sql);

        msg.message="Data Deleted Successfully!";
        msg.data = users;

        return msg;
    }
}

