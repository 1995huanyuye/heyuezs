package com.heyue.util;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.heyue.constinfo.basic.UnitEnum;

public class BasicDetailUnitConverter implements Converter<Integer> {
    @Override
    public Integer convertToJavaData(ReadConverterContext<?> context) throws Exception {
        String value = context.getReadCellData().getStringValue();
        if(UnitEnum.M.equals(value.toUpperCase())){
            return 1;
        }
        return 0;
    }

    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<Integer> context) throws Exception {
        Integer value = context.getValue();
        if(1==value){
            return new WriteCellData<>(UnitEnum.M);
        }
        return new WriteCellData<>(UnitEnum.M);
    }
}
