package am.hitech.model.dto;

import lombok.Data;

@Data
public class UserRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private  String password;
    private  int age;

}
