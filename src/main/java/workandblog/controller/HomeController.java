package workandblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;
import workandblog.entity.Book;
import workandblog.entity.User;
import workandblog.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {


    @Autowired
    private UserService userService;

    //    Start page
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    //    Menu page
    @RequestMapping(name = "/create", method = RequestMethod.GET)
    public String create() {
        return "createuser";
    }

    //    User Creation page
    @RequestMapping(name = "/create-user", method = RequestMethod.POST)
    private ModelAndView createUser(@RequestParam(value = "name") String name,
                                    @RequestParam(value = "surname") String surname,
                                    @RequestParam(value = "email") String email,
                                    @RequestParam(value = "password") String password) {
        User user = new User(name, surname, email, password, new ArrayList<>());
        userService.create(user);
//        ----------------------- Test connect
        List<Book> books = user.getBooks();
        books.add(new Book("book1", user));
        books.add(new Book("book2", user));
        books.add(new Book("book3", user));
        user.setBooks(books);
        userService.updateUser(user);

        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }


    //A list of users
    @RequestMapping(value = "/userlist", method = RequestMethod.GET)
    public ModelAndView userList() {
        ModelAndView modelAndView = new ModelAndView("myContactPhone");

//        modelAndView.addObject("userList", userService.userList());
        modelAndView.addObject("userBy", userService.userList());
//        userService.userList();
        return modelAndView;
    }

    //    Displays the user by id in the browser
    @RequestMapping(value = "/get-user/{user-id}/", method = RequestMethod.GET)
    public ModelAndView getUserById(@PathVariable("user-id") Long userId) {

        ModelAndView modelAndView = new ModelAndView("userById");

        User user = userService.getUserById(userId);

        modelAndView.addObject("user", user);

        return modelAndView;
    }

    //   Received books n-th user
    @RequestMapping(value = "/getBooksByUserId", method = RequestMethod.GET)
    public ModelAndView getBooksByUserId() {
        Long id = 12L;
        System.out.println("Test");
        userService.booksListUser(id);
        ModelAndView modelAndView = new ModelAndView("workAndBlog");
        return modelAndView;
    }

    //    Delete user by ID
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public ModelAndView removeUserByID(@RequestParam("user_id") Long userId) {

//        ModelAndView modelAndView = new ModelAndView("redirect:/userlist");
        ModelAndView modelAndView = new ModelAndView("redirect:/myContactPhone");
        userService.removeUser(userId);

        return modelAndView;
    }

    @RequestMapping(value = "/edit-user/{user-id}/", method = RequestMethod.GET)
    public ModelAndView editUser(@PathVariable("user-id") Long userId) {

        ModelAndView editUserPage = new ModelAndView("editUser");

        User user = userService.getUserById(userId);

        editUserPage.addObject("user", user);

        return editUserPage;
    }


    @RequestMapping(value = "/update-user", method = RequestMethod.POST)
    public ModelAndView updateUser(@RequestParam("user_id") Long userId,
                                   @RequestParam("user_name") String userName,
                                   @RequestParam("user_surname") String userSurname,
                                   @RequestParam("user_email") String userEmail) {

        User user = userService.getUserById(userId);

        user.setName(userName);
        user.setEmail(userEmail);
        user.setSurname(userSurname);

        userService.updateUser(user);

        return new ModelAndView("redirect:/edit-user/" + userId + "/");

    }

//    Controller sorted by user by name, phone number, etc.


}
