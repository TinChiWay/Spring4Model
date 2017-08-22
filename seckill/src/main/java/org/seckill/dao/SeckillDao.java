package org.seckill.dao;

import org.seckill.entity.SecKill;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     *
     * @param secKillId
     * @return
     */
    SecKill queryById(long secKillId);

    /**
     *
     * @param offet
     * @param limit
     * @return
     */
    List<SecKill> queryList(int offet,int limit);

}
