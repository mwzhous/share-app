package top.zhou.content.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhou.content.domain.entity.Share;
import top.zhou.content.repository.ShareRepository;
import top.zhou.content.service.ShareService;

import java.util.List;

/**
 * @description:
 * @author: zhou
 * @create: 2022-09-06
 **/

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ShareServiceImpl implements ShareService {
    final private ShareRepository shareRepository;

    //@Override
    //public Share findById(Integer id) {
    //    return shareRepository.findById(id).orElse(null);
    //}
    @Override
    public List<Share> findAll() {
        return shareRepository.findAll();
    }

}
