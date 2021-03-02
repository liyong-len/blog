package com.len.blog.config;

import cn.hutool.core.codec.Base64Decoder;
import com.baomidou.mybatisplus.core.toolkit.IOUtils;

import java.io.*;
import java.util.stream.Stream;

/**
 * @author liyong
 * @version 1.0
 * @className Coversion
 * @description Coversion
 * @date 2020/12/4 21:47
 */
public class Coversion {

    public static void main(String[] args) {

        System.out.println(-0.0 == 0.0);

    }

    public static String codeString(File fileName) throws Exception {
        BufferedInputStream bin = new BufferedInputStream(
                new FileInputStream(fileName));
        int p = (bin.read() << 8) + bin.read();
        String code = null;

        switch (p) {
            case 0xefbb:
                code = "UTF-8";
                break;
            case 0xfffe:
                code = "Unicode";
                break;
            case 0xfeff:
                code = "UTF-16BE";
                break;
            default:
                code = "GBK";
        }
        IOUtils.closeQuietly(bin);
        return code;
    }
}
