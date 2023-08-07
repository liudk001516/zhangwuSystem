package cn.yunhe.dao.impl;

import cn.yunhe.dao.AccountDao;
import cn.yunhe.enity.Account;
import cn.yunhe.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDaoImpl implements AccountDao {
    QueryRunner qr = new QueryRunner(JdbcUtils.getDataSource());
    @Override
    public List<Account> selectAll() {
        try {
            return qr.query("select * from account",new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Account> selectLimit(int ce, int ps) {
        try {
            return qr.query("select * from account limit ?,?",new BeanListHandler<Account>(Account.class),ce,ps);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
