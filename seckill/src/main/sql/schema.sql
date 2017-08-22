-- 数据库初始化脚本
-- 创建数据库
CREATE DATABASE seckill;
use seckill;

CREATE TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品id',
`name` VARCHAR(120) NOT NULL COMMENT '商品名称',
`number` INT NOT NULL COMMENT '库存',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`start_time` TIMESTAMP NOT NULL COMMENT '秒杀开启时间',
`end_time` TIMESTAMP NOT NULL COMMENT '秒杀结束时间',
PRIMARY KEY (seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY  idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存';

INSERT INTO
  seckill(name,number,start_time,end_time)
VALUES
  ('1000元秒杀iPhone6s',100,'2017-08-21 00:00:00','2017-08-22 00:00:00'),
  ('500元秒杀iPad2',200,'2017-08-21 00:00:00','2017-08-22 00:00:00'),
  ('300元秒杀小米4',50,'2017-08-21 00:00:00','2017-08-22 00:00:00'),
  ('200元秒杀红米note',100,'2017-08-21 00:00:00','2017-08-22 00:00:00');

--秒杀明细表
CREATE TABLE success_killed(
`seckill_id` bigint NOT NULL COMMENT '秒杀商品id',
`user_phone` bigint NOT NULL COMMENT '用户手机号',
`state` tinyint NOT NULL DEFAULT -1 COMMENT '状态标识：-1无效 0：成功 1：已付款 2：已发货'，
`create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
PRIMARY KEY (seckill_id,user_phone),/*联合主键*/
KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀明细';

--链接数据库控制台
mysql -u root

--
ALTER TABLE seckill
DROP INDEX idx_create_time,
ADD INDEX idx_c_n_c_s(start_time,create_time);