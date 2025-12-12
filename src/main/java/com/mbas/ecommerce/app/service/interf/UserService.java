package com.mbas.ecommerce.app.service.interf;

import com.mbas.ecommerce.app.dtos.LoginRequest;
import com.mbas.ecommerce.app.dtos.Response;
import com.mbas.ecommerce.app.dtos.UserDto;
import com.mbas.ecommerce.app.entities.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
