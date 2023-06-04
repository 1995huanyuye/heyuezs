package com.heyue.listener;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import com.alibaba.excel.util.ListUtils;
import com.heyue.dao.BasicDetailDao;
import com.heyue.model.BasicDetail;
import com.heyue.util.PKeyGenerator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class BasicDetailImportListener implements ReadListener<BasicDetail> {

    private static final Log logger = LogFactory.getLog(BasicDetailImportListener.class);
    /**
     * 每隔5条存储数据库，实际使用中可以100条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 100;
    /**
     * 缓存的数据
     */
    private List<BasicDetail> cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);

    private BasicDetailDao dao;
    private Long categoryId ;

    public BasicDetailImportListener() {

    }

    public BasicDetailImportListener(BasicDetailDao dao, Long categoryId) {
        this.dao = dao;
        this.categoryId = categoryId;
    }

    @Override
    public void invoke(BasicDetail detail, AnalysisContext analysisContext) {
        cachedDataList.add(detail);
        if(cachedDataList.size()>=BATCH_COUNT){
            saveData();
            cachedDataList = ListUtils.newArrayListWithExpectedSize(BATCH_COUNT);
        }

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
        logger.info("所有数据解析完成！");
    }

    private void saveData(){
        for (BasicDetail detail : cachedDataList) {
            detail.setId(PKeyGenerator.generator());
            detail.setCategoryId(categoryId);
        }
        if(cachedDataList.size()!=0){
            dao.batchSave(cachedDataList);
        }

    }
}
