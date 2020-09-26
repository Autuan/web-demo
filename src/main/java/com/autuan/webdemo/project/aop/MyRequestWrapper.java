package com.autuan.webdemo.project.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author : Autuan.Yu
 * @description :  描述
 * @remark : 备注
 * @date : 2020/9/26 17:11
 * @company : 上海奥若拉信息科技集团有限公司
 */
public class MyRequestWrapper  extends HttpServletRequestWrapper {
    private byte[] body;

    public MyRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);

        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader reader = request.getReader();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        String body = sb.toString();
        this.body = body.getBytes(StandardCharsets.UTF_8);
    }


    public String getBody() {
        return new String(body, StandardCharsets.UTF_8);
    }
}
