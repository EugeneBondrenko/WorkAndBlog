package workandblog.dao;

import workandblog.entity.UserRegistration;

import java.util.List;

public interface UserDao {

    Long create(UserRegistration userRegistration);

    List userList();

//    Изменять книгу
    public void updateUser(UserRegistration user);

//    Удалить юзера по id
    public void removeBook(long id);

//    Получить узера по id
    public UserRegistration getUserById(Long id);
 }
