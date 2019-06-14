package com.rn_dus_testing.dusdependencies;

import com.flipkart.dus.dependencies.DusLogger;

/**
 * Created by surya.kanoria on 08/01/18.
 */

public class DusLoggerResolver implements DusLogger {
    @Override
    public void log(String log) {
        System.out.println(log);
    }

    @Override
    public void logException(Throwable throwable) {
        System.err.println(throwable.getStackTrace().toString());
    }
}
