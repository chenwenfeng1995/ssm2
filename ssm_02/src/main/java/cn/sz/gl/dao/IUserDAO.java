package cn.sz.gl.dao;

import cn.sz.gl.pojo.Users;

public interface IUserDAO {

	public Users findUserByNameAndPwd(Users u);
}
