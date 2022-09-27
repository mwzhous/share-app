package top.zhou.content.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.zhou.content.common.ResponseResult;

/**
 * @description:
 * @author: zhou
 * @create: 2022-09-25
 **/

@FeignClient(value = "user-service", path = "/users")
public interface UserService {
    /**
     * 调用用户服务
     *
     * @param id
     * @return
     */
    @GetMapping("{id}")
    ResponseResult getUser(@PathVariable(value = "id") int id);
}
