package com.heyue.dao;

import com.heyue.model.BasicDetail;

import java.util.List;

public interface BasicDetailDao {
    List<BasicDetail> listAll(Long category_id);
}
