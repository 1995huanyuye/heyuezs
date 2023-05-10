package com.heyue.serivce;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface DataOpratorService {
    void exportExcel(HttpServletResponse response);

    void importExcel(MultipartFile file) throws IOException;
}
