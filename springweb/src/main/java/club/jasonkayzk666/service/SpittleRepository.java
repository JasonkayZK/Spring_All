package club.jasonkayzk666.service;

import club.jasonkayzk666.entity.Spittle;
import club.jasonkayzk666.entity.Spitter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zk
 * @DATE 19-8-10
 */
public interface SpittleRepository {


    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);

}
