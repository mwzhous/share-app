package top.zhou.content.service;

//import com.alibaba.csp.sentinel.annotation.SentinelResource;
//import com.alibaba.csp.sentinel.slots.block.BlockException;
import top.zhou.content.domain.entity.Share;

import java.util.List;

/**
 * @description:
 * @author: zhou
 * @create: 2022-09-06
 **/

public interface ShareService {
    /**
     * @param id id
     * @return share
     */
    //Share findById(Integer id);

    List<Share> findAll();
}
