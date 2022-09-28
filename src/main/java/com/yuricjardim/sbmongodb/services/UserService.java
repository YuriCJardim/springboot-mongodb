package com.yuricjardim.sbmongodb.services;

import com.yuricjardim.sbmongodb.domain.User;
import com.yuricjardim.sbmongodb.dto.UserDTO;
import com.yuricjardim.sbmongodb.repository.UserRepository;
import com.yuricjardim.sbmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
       }

       public User insert(User obj){
         return userRepository.insert(obj);
    }

    public void delete(String id){
        findById(id);
         userRepository.deleteById(id);
    }

    public User fromDTO(UserDTO objDTO){
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }

    public User update(User obj) {
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return userRepository.save(newObj);
    }

    private void updateData(User newObj, User obj) {
            newObj.setName(obj.getName());
            newObj.setEmail(obj.getEmail());

    }
}
