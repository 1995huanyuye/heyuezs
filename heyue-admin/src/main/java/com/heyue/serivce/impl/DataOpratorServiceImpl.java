package com.heyue.serivce.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.heyue.dao.BasicDetailDao;
import com.heyue.dao.MaterialDao;
import com.heyue.dto.BasicDetailExport;
import com.heyue.dto.MaterialDetailExport;
import com.heyue.listener.BasicDetailImportListener;
import com.heyue.listener.MaterialDetailImportListener;
import com.heyue.model.BasicDetail;
import com.heyue.model.MaterialDetail;
import com.heyue.serivce.DataOpratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
public class DataOpratorServiceImpl implements DataOpratorService {

    @Autowired
    private BasicDetailDao basicDetailDaodao;
    @Autowired
    private MaterialDao materialDaodao;

    @Override
    public void exportBasicExcel(List<BasicDetail> details,HttpServletResponse response) throws IOException {
        EasyExcel.write(response.getOutputStream())
                .head(BasicDetailExport.class)
                .excelType(ExcelTypeEnum.XLSX)
                .sheet("sheet1")
                .doWrite(details);
    }

    @Override
    public void importBasicExcel(MultipartFile file,Long category) throws IOException {
        EasyExcel.read(file.getInputStream(), BasicDetail.class,new BasicDetailImportListener(basicDetailDaodao,category)).sheet().doRead();
    }

    @Override
    public void exporMaterialExcel(List<MaterialDetail> details, HttpServletResponse response) throws IOException {
        EasyExcel.write(response.getOutputStream())
                .head(MaterialDetailExport.class)
                .excelType(ExcelTypeEnum.XLSX)
                .sheet("sheet1")
                .doWrite(details);
    }

    @Override
    public void importMaterialExcel(MultipartFile file, Long category) throws IOException {
        EasyExcel.read(file.getInputStream(), MaterialDetail.class,new MaterialDetailImportListener(materialDaodao,category)).sheet().doRead();
    }
}
