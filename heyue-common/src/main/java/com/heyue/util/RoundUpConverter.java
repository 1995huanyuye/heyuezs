package com.heyue.util;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.heyue.constinfo.basic.NormalConst;

public class RoundUpConverter implements Converter<Integer> {
    @Override
    public Integer convertToJavaData(ReadConverterContext<?> context) throws Exception {
        String value = context.getReadCellData().getStringValue();
        if(NormalConst.Y.equals(value.toUpperCase())){
            return 1;
        }else if(NormalConst.N.equals(value.toUpperCase())){
            return 2;
        }
        return 1;
    }

    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<Integer> context) throws Exception {
        Integer value = context.getValue();
        if(1==value){
            return new WriteCellData<>(NormalConst.Y);
        }else{
            return new WriteCellData<>(NormalConst.N);
        }
    }
}
