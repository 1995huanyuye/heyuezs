package com.heyue.util;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.converters.ReadConverterContext;
import com.alibaba.excel.converters.WriteConverterContext;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.heyue.constinfo.basic.UnitEnum;

public class UnitConverter implements Converter<Integer> {
    @Override
    public Integer convertToJavaData(ReadConverterContext<?> context) throws Exception {
        String value = context.getReadCellData().getStringValue();
        switch (value.toUpperCase()){
            case UnitEnum.PM:
                return 1;
            case UnitEnum.X:
                return 2;
            case UnitEnum.G:
                return 3;
            case UnitEnum.B:
                return 4;
            case UnitEnum.M:
                return 5;
            case UnitEnum.T:
                return 6;
            case UnitEnum.TA:
                return 7;
        }
        return 0;
    }

    @Override
    public WriteCellData<?> convertToExcelData(WriteConverterContext<Integer> context) throws Exception {
        Integer value = context.getValue();
        switch (value){
            case 1:
                return new WriteCellData<>(UnitEnum.PM);
            case 2:
                return new WriteCellData<>(UnitEnum.X);
            case 3:
                return new WriteCellData<>(UnitEnum.G);
            case 4:
                return new WriteCellData<>(UnitEnum.B);
            case 5:
                return new WriteCellData<>(UnitEnum.M);
            case 6:
                return new WriteCellData<>(UnitEnum.T);
            case 7:
                return new WriteCellData<>(UnitEnum.TA);
        }
        return new WriteCellData<>(UnitEnum.M);
    }
}
