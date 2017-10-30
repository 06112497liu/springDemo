package com.bbd.data;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class SinaSpittr implements SpittleRespository {

    private static Map<String, Spitter> map = Maps.newHashMap();

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> list = Lists.newArrayList();
        for(int i=0; i<count; i++) {
            list.add(new Spittle(Long.parseLong(i+""), "Spittle " + i, new Date(), 25.23, 28.36));
        }
        return list;
    }

    @Override
    public void save(Spitter spitter) {
        map.put(spitter.getUsername(), spitter);
    }

    @Override
    public Spitter findUserByName(String username) {
        return map.get(username);
    }
}
