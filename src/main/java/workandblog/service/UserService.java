package workandblog.service;

import workandblog.entity.Book;
import workandblog.entity.User;
import workandblog.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    void create(User user);

    List<User> userList();

    List<Book> booksListUser(Long id);

    //    Изменять книгу
    void updateUser(User user);

    //    Удалить юзера по id
    void removeUser(Long id);

    //    Получить узера по id
     User getUserById(Long id);


}
