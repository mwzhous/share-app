package top.zhou.user.service;

import top.zhou.user.domain.dto.UserDto;
import top.zhou.user.domain.entity.User;

/**
 * @description:
 * @author: zhou
 * @create: 2022-09-24
 **/

public interface UserService {
    /**
     * 根据id找user
     * @param id id
     * @return user
     */
    User findById(Integer id);

    /**
     * 登录
     * @param userDto userDto
     * @return user
     */
    User login(UserDto userDto);
}
