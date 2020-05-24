package com.galaxy.tax.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Slf4j
public class StringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        Date date = new Date();
        try {
            date =  new SimpleDateFormat(ConstantNum.PARRTEN).parse(s);
        } catch (ParseException e) {
            log.error("需要的格式‘yyyy-MM-dd’,但是："+s);
        }
        return date;
    }
}
