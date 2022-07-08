package net.htrap.dtoexamplestudent.Service;


import net.htrap.dtoexamplestudent.DTO.UserDTO;
import net.htrap.dtoexamplestudent.Model.User;
import net.htrap.dtoexamplestudent.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getAllData(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    //Create
    public List<UserDTO> createData(User user){
        userRepository.save(user);
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserDTO convertEntityToDto(User user){
        UserDTO userDto = new UserDTO();
        userDto.setFirstName(user.getFirstName());
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());

        return userDto;
    }


    //Read
    public UserDTO readData(Long id){

        User u1 = userRepository.getById(id);

        UserDTO dt1 = new UserDTO();
        dt1.setId(id);
        dt1.setEmail(u1.getEmail());
        dt1.setFirstName(u1.getFirstName());

        return dt1;
    }

    //UPDATE
    public UserDTO updateData(Long id, User user){

//        userRepository.deleteById(id);
//        user.setId(id);
//        userRepository.save(user);
        User user1 = userRepository.getById(id);
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getFirstName());
        user1.setId(user.getId());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        userRepository.save(user1);

        UserDTO dt1 = new UserDTO();
        dt1.setId(id);
        dt1.setFirstName(user.getFirstName());
        dt1.setEmail(user.getEmail());


        return dt1;
    }

    //DELETE

    public UserDTO deleteData(Long id){
        User u1 = userRepository.getById(id);

        UserDTO dt1 = new UserDTO();
        dt1.setId(id);
        dt1.setFirstName(u1.getFirstName());
        dt1.setEmail(u1.getEmail());
        userRepository.delete(u1);
        return dt1;
    }
}
