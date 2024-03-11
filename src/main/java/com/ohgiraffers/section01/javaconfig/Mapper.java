package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {

    @Select("SELECT CURDATE() FROM DUAL")
    java.util.Date selectSysdate();


}
