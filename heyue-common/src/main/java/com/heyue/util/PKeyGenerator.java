package com.heyue.util;

public class PKeyGenerator {
    private static int generateCount = 0;
    /**
     * 生成时间戳主键
     */
    public static synchronized Long generator()
    {
        if(generateCount > 999)
            generateCount = 0;
        String uniqueNumber = System.currentTimeMillis() + Integer.toString(generateCount);
        generateCount++;
        return Long.valueOf(uniqueNumber);
    }
}
