package com.heyue.serivce.impl;

import com.alibaba.excel.EasyExcel;
import com.heyue.listener.BasicDetailImportListener;
import com.heyue.model.BasicDetail;
import com.heyue.serivce.DataOpratorService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class DataOpratorServiceImpl implements DataOpratorService {
    @Resource
    private BasicDetailImportListener basicDetailImportListener;

    @Override
    public void exportExcel(HttpServletResponse response) {

    }

    @Override
    public void importExcel(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), BasicDetail.class,basicDetailImportListener).doReadAll();

    }
}
