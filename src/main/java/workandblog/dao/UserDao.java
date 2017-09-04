package workandblog.dao;

import workandblog.entity.UserRegistration;

public interface UserDao {

    Long create(UserRegistration userRegistration);
}
