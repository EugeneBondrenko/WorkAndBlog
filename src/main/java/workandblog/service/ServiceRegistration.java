package workandblog.service;

import workandblog.entity.UserRegistration;

import java.util.List;

public interface ServiceRegistration {

    void create(String name, String surname, String email, String password, String compass);

    List<UserRegistration> userList();

    //    Изменять книгу
    void updateUser(UserRegistration user);

    //    Удалить юзера по id
    void removeBook(int id);

    //    Получить узера по id
     UserRegistration getUserById(Long id);


}
