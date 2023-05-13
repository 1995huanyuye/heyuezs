package com.heyue.dao;

import com.heyue.model.MaterialDetail;

import java.util.List;

public interface MaterialDao {
    int batchSave(List<MaterialDetail> data);
}
