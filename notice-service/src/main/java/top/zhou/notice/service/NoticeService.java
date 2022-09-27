package top.zhou.notice.service;

import top.zhou.notice.entity.Notice;

/**
 * @description:
 * @author: zhou
 * @create: 2022-09-25
 **/

public interface NoticeService {
    /**
     * 获取最新通知
     *
     * @return notice
     */
    Notice getLatestNotice();
}

