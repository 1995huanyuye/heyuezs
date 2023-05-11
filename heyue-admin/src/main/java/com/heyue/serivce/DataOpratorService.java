package com.heyue.serivce;

import com.heyue.model.BasicDetail;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface DataOpratorService {
    void exportExcel(List<BasicDetail> details,HttpServletResponse response) throws IOException;

    void importExcel(MultipartFile file,Long category) throws IOException;
}
