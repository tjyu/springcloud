package cn.dlj1.ec.db.resolve;

import cn.dlj1.ec.db.component.Cnd;
import cn.dlj1.ec.db.component.returns.Return;
import cn.dlj1.ec.db.entity.Entity;

/**
 * sql拼接 解析器
 *
 */
public class DeCode {

    private static final String insert = "insert into @table_name(@fields) value(@value)";

    private Return returns;
    private Entity entity;
    private Cnd cnds;

}
