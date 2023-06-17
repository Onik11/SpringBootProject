package am.hitech.service;

import am.hitech.model.User;
import am.hitech.model.dto.UserRequestDto;
import am.hitech.model.dto.UserResponseDto;
import am.hitech.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface UserService {


    User getById(int id);

    UserResponseDto create(UserRequestDto requestDto);
}
