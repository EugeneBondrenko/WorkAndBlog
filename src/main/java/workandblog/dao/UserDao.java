package workandblog.dao;

import workandblog.entity.User;
import workandblog.entity.User;

import java.util.List;

public interface UserDao {

    Long create(User user);

    List userList();
    List bookList();

//    Изменять книгу
    public void updateUser(User user);

//    Удалить юзера по id
    public void removeUser(long id);

//    Получить узера по id
    public User getUserById(long id);
 }
