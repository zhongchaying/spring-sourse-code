① 导入spring-jdbc和spring-tx坐标
② 创建数据库表和实体
③ 创建JdbcTemplate对象
JdbcTemplate jdbcTemplate = new JdbcTemplate();
jdbcTemplate.setDataSource(dataSource);
④ 执行数据库操作
更新操作：(增删改)
jdbcTemplate.update (sql,params)
查询操作：
jdbcTemplate.query (sql,Mapper,params)
jdbcTemplate.queryForObject(sql,Mapper,params)