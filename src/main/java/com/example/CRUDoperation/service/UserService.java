package com.example.CRUDoperation.service;

import com.example.CRUDoperation.entity.UserEntity;
import com.example.CRUDoperation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserEntity> fatchUserData() {
        return (List<UserEntity>) userRepository.findAll();
    }

    public UserEntity postUserData(UserEntity entity) {
        return userRepository.save(entity);
    }

    public UserEntity userDataUpdate(Long id, UserEntity user) {
        UserEntity entity = userRepository.findById(id).get();
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setDesignation(user.getDesignation());
        return userRepository.save(entity);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
