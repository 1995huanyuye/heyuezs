package com.heyue.util;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class ExcelExportUtils {

    public static void setExcelResProp(HttpServletResponse response,String fileName) throws UnsupportedEncodingException {
        String Name = URLEncoder.encode(fileName, "UTF-8");
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-disposition", "attachment;filename=" + Name + ".xlsx");
    }
}
