drop table if exists `test`;
create table `test`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    `password` varchar (50) comment 'password',
    primary key (`id`)
)engine = innodb default charset = utf8mb4 comment ='测试';

select *from test;