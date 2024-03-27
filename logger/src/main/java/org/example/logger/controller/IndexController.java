package org.example.logger.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    private static final Logger logger = Logger.getLogger(IndexController.class);

    @GetMapping
    public String index() {
        logger.debug("Đang tải...");
        logger.info("Thông báo cấp độ THÔNG TIN!!");
        logger.warn("Thông báo cấp độ CẢNH BÁO!!");
        logger.error("Thông báo cấp độ LỖI!!");
        logger.fatal("Thông báo cấp độ LỖ HỔNG!!");
        logger.trace("Thông báo cấp độ DẤU VẾT!!");
        logger.debug("Thoát!");
        return "index";
    }
}
