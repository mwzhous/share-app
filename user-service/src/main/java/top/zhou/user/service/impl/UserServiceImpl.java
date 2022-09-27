package top.zhou.user.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhou.user.domain.dto.UserDto;
import top.zhou.user.domain.entity.User;
import top.zhou.user.repository.UserRepository;
import top.zhou.user.service.UserService;

/**
 * @description:
 * @author: zhou
 * @create: 2022-09-24
 **/

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User login(UserDto userDto) {
        return userRepository.findByMobileAndPassword(userDto.getUsername(), userDto.getPassword());
    }
}

