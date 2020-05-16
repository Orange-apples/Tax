package com.galaxy.tax.component;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        Date date = new Date();
        try {
            date =  new SimpleDateFormat(ConstantNum.PARRTEN).parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
