package org.seckill.dao;

import org.seckill.entity.SecKill;
import org.seckill.entity.SuccessKilled;

import java.util.List;

public interface SuccessKilledDao {
    /**
     * 插入购买明细，过滤重复
     * @param secKillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long secKillId,long userPhone);

    /**
     * 查询SuccessKilled并携带秒杀产品
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSecKill(long seckillId);

    /**
     *
     * @param offet
     * @param limit
     * @return
     */
    List<SecKill> queryAll(int offet,int limit);
}
