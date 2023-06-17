package am.hitech.service.impl;

import am.hitech.model.User;
import am.hitech.model.dto.UserRequestDto;
import am.hitech.model.dto.UserResponseDto;
import am.hitech.repository.UserRepository;
import am.hitech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getById(int id){
        User user = userRepository.findById(id);
        return user;

    }

    @Override
    public UserResponseDto create(UserRequestDto requestDto) {
        User user = convertUser(requestDto);
        userRepository.save(user);
        UserResponseDto responseDto = convertToDto(user);


        return responseDto;
    }

    private User convertUser(UserRequestDto requestDto){
        User user = new User();
        user.setFirstName(requestDto.getFirstName());
        user.setLastName(requestDto.getLastName());
        user.setEmail(requestDto.getEmail());
        user.setAge(requestDto.getAge());
        user.setPassword(requestDto.getPassword());
        return user;
    }

    private UserResponseDto convertToDto(User user){

        UserResponseDto responseDto = new UserResponseDto();

        responseDto.setId(user.getId());
        responseDto.setFirstName(user.getFirstName());
        responseDto.setLastName(user.getLastName());
        responseDto.setAge(user.getAge());
        responseDto.setEmail(user.getEmail());

        return responseDto;
    }
}
