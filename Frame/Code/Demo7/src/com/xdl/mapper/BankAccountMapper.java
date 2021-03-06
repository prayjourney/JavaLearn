package com.xdl.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.xdl.bean.BankAccount;

public class BankAccountMapper implements RowMapper<BankAccount> {

	@Override
	public BankAccount mapRow(ResultSet rs, int arg1) throws SQLException {
		return new BankAccount(rs.getString("ano"), rs.getString("aname"),
			rs.getString("apassword"), rs.getDouble("money"));
	}

}
