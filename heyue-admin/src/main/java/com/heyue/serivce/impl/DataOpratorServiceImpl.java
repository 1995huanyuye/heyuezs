package com.heyue.serivce.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.heyue.dao.BasicDetailDao;
import com.heyue.dto.BasicDetailExport;
import com.heyue.listener.BasicDetailImportListener;
import com.heyue.model.BasicDetail;
import com.heyue.serivce.DataOpratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataOpratorServiceImpl implements DataOpratorService {

    @Autowired
    private BasicDetailDao dao;
    @Override
    public void exportExcel(List<BasicDetail> details,HttpServletResponse response) throws IOException {

        EasyExcel.write(response.getOutputStream())
                .head(BasicDetailExport.class)
                .excelType(ExcelTypeEnum.XLSX)
                .sheet("sheet1")
                .doWrite(details);
    }

    @Override
    public void importExcel(MultipartFile file,Long category) throws IOException {
        EasyExcel.read(file.getInputStream(), BasicDetail.class,new BasicDetailImportListener(dao,category)).sheet().doRead();
    }
}
