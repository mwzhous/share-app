package top.zhou.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.zhou.content.domain.entity.Share;

/**
 * @description:
 * @author: zhou
 * @create: 2022-09-06
 **/

public interface ShareRepository extends JpaRepository<Share, Integer> {
}
