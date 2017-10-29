package com.bbd.data;

import com.google.common.collect.Lists;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class SinaSpittr implements SpittleRespository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = Lists.newArrayList();
        for(int i=0; i<count; i++) {
            list.add(new Spittle(Long.parseLong(i+""), "Spittle " + i, new Date(), 25.23, 28.36));
        }
        return list;
    }
}
