package ru.urfu.lab_7_security.service;


import ru.urfu.lab_7_security.dto.UserDto;
import ru.urfu.lab_7_security.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUser();
}
