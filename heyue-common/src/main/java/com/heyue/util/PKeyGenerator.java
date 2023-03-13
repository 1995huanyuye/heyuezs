package com.heyue.util;

public class PKeyGenerator {
    private static int generateCount = 0;
    /**
     * 生成时间戳主键
     */
    public static synchronized String getUniqueString()
    {
        if(generateCount > 999)
            generateCount = 0;
        String uniqueNumber = Long.toString(System.currentTimeMillis()) + Integer.toString(generateCount);
        generateCount++;
        return uniqueNumber;
    }
}
