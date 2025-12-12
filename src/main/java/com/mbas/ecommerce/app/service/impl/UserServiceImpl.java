package com.mbas.ecommerce.app.service.impl;

import com.mbas.ecommerce.app.dtos.LoginRequest;
import com.mbas.ecommerce.app.dtos.Response;
import com.mbas.ecommerce.app.dtos.UserDto;
import com.mbas.ecommerce.app.entities.User;
import com.mbas.ecommerce.app.mapper.EntityDtoMapper;
import com.mbas.ecommerce.app.repository.UserRepo;
import com.mbas.ecommerce.app.security.JwtUtils;
import com.mbas.ecommerce.app.service.interf.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;
    private final EntityDtoMapper entityDtoMapper;

    @Override
    public Response registerUser(UserDto registrationRequest) {
        return null;
    }

    @Override
    public Response loginUser(LoginRequest loginRequest) {
        return null;
    }

    @Override
    public Response getAllUsers() {
        return null;
    }

    @Override
    public User getLoginUser() {
        return null;
    }

    @Override
    public Response getUserInfoAndOrderHistory() {
        return null;
    }
}
