package id.my.patranto.blog.service;

import id.my.patranto.blog.payload.LoginDto;
import id.my.patranto.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
