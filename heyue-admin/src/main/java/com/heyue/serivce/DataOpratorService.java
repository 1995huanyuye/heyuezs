package com.heyue.serivce;

import com.heyue.model.BasicDetail;
import com.heyue.model.MaterialDetail;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public interface DataOpratorService {
    void exportBasicExcel(List<BasicDetail> details,HttpServletResponse response) throws IOException;
    @Transactional
    void importBasicExcel(MultipartFile file,Long category) throws IOException;


    void exporMaterialExcel(List<MaterialDetail> details, HttpServletResponse response) throws IOException;
    @Transactional
    void importMaterialExcel(MultipartFile file,Long category) throws IOException;
}
