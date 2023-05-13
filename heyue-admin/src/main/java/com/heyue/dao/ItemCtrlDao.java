package com.heyue.dao;


import com.heyue.model.ItemVO;

import java.util.List;

public interface ItemCtrlDao {
    List<ItemVO> listBasicAll();

    List<ItemVO> listMaterialAll();

    void insertBasic(ItemVO item);

    void insertMaterial(ItemVO item);

    void updateBasic (ItemVO item);

    void updateMaterial (ItemVO item);



}
