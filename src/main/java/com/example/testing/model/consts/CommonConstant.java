package com.example.testing.model.consts;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface CommonConstant {
    String UNKNOWN = "Unknown";
    String ALL = "All";
    String DEFAULT_PACKAGE_NAME = "com.morivy.oa.api";
    String DEFAULT_PASSWORD = "123456";

    // date formatters and patterns
    String DATE_FORMAT_1 = "yyyy-MM-dd HH:mm:ss";
    String DATE_FORMAT_2 = "yyyy-MM-dd";
    String DATE_FORMAT_3 = "yyyy";
    String DATE_FORMAT_4 = "yyyyMM";
    String DATE_FORMAT_5 = "dd-MMM";

    String TIME_FORMAT = "HH:mm";

    String TIME_FORMAT_2 = "HH:mm:ss";
    String DATE_FORMAT_6 = "yyyy-MM-dd HH:mm";
    String DATE_FORMAT_7 = "yyyyMMddHHmmss";
    DateTimeFormatter FORMATTER_1 = DateTimeFormatter.ofPattern(CommonConstant.DATE_FORMAT_2);
    DateTimeFormatter FORMATTER_2 = DateTimeFormatter.ofPattern(CommonConstant.DATE_FORMAT_5);
    DateTimeFormatter FORMATTER_3 = DateTimeFormatter.ofPattern(CommonConstant.DATE_FORMAT_4);
    DateTimeFormatter FORMATTER_4 = DateTimeFormatter.ofPattern(CommonConstant.DATE_FORMAT_6);
    DateTimeFormatter FORMATTER_5 = DateTimeFormatter.ofPattern(CommonConstant.DATE_FORMAT_1);
    DateTimeFormatter FORMATTER_6 = DateTimeFormatter.ofPattern(CommonConstant.DATE_FORMAT_7);

    List<String> MEDIA_EXTENSION_FILES = Stream.of("jpeg", "jpg", "png", "gif").collect(Collectors.toList());
    BigDecimal MAX_NUMERIC_VALUE = new BigDecimal("1000000000000000");

    // Dictionary keys
    String EMPLOYEE_SETUP_STATUS_CODE = "ESS";
    String ACCEPTED_TIME_LIMIT_CODE = "ATL";
    String PAYMENT_TIME_LIMIT_CODE = "PTL";

    // caching keys
    String SYS_USER_NOTIFICATION_KEY = "SYS_USER_NOTIFICATION_";
    Long SYS_USER_CACHE_TTL = 5 * 60L;

    // file storage provider
    String ALIBABA_OSS = "ALIYUN";

    String OA_PHOTO_SETTING = "OA Logo";
    String PAYMENT_TYPE_FOLDER = "paymentType";

    String SYS_USER_FOLDER = "sysUser";

    String WITHDRAWAL_FOLDER = "withdrawal";
    String PHOTO_SETTING_FOLDER = "logoSetting";

    String DEPOSIT_FOLDER = "deposit";
}
