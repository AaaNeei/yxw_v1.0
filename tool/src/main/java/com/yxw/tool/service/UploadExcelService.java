package com.yxw.tool.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Author:阿倪
 * @Date: 2019/3/8 17:18
 * @Description:
 * @return:
 * @throws:
 */
public interface UploadExcelService {
    /**
     * 读取excel中的数据,生成list
     */
    String readExcelFile(MultipartFile file);
}
