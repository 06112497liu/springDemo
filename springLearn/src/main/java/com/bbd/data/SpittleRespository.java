package com.bbd.data;

import java.util.List;

public interface SpittleRespository {
    List<Spittle> findSpittles(long max, int count);
    void save(Spitter spitter);
    Spitter findUserByName(String username);
}
