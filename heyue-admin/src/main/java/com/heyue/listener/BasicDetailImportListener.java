package com.heyue.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.heyue.mapper.BasicDetailMapper;
import com.heyue.model.BasicDetail;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class BasicDetailImportListener implements ReadListener<BasicDetail> {
    private static final Log logger = LogFactory.getLog(BasicDetailImportListener.class);
    private ExecutorService executorService = Executors.newFixedThreadPool(20);
    private ThreadLocal<ArrayList<BasicDetail>> detailList = ThreadLocal.withInitial(ArrayList::new);
    private static AtomicInteger count = new AtomicInteger(1);
    private static final int batchSize = 10000;

    @Autowired
    private BasicDetailMapper detailMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void invoke(BasicDetail detail, AnalysisContext analysisContext) {
        saveData();
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    public void saveData(){
        if(!detailList.get().isEmpty()){
            ArrayList<BasicDetail> basicDetails = detailList.get();
            for (BasicDetail basicDetail : basicDetails) {
                detailMapper.insert(basicDetail);
            }
            detailList.get().clear();
        }
    }
}
