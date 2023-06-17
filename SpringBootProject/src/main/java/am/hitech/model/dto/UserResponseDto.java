package am.hitech.model.dto;

import lombok.Data;

@Data
public class UserResponseDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private  int age;
}
