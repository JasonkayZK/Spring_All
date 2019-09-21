package club.jasonkayzk666.service;

import club.jasonkayzk666.entity.Spitter;

/**
 * @author zk
 * @DATE 19-8-11
 */
public interface SpitterRepository {


    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
