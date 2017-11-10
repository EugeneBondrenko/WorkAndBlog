package workandblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        ModelAndView modelAndView = new ModelAndView("userList");
        modelAndView.addObject("user", new User());
        modelAndView.addObject("listUsers", userService.userList());
//        userService.userList();
        return modelAndView;
    }

    //    Displays the user by id in the browser
    @RequestMapping(value = "/getuserbyid", method = RequestMethod.GET)
    public ModelAndView getUserById() {
        Long id = 12L;
        ModelAndView modelAndView = new ModelAndView("userById");
        modelAndView.addObject("user", new User());
        modelAndView.addObject("listUsers", userService.getUserById(id));
        System.out.println(userService.getUserById(12L));
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
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
        public ModelAndView removeUserByID(){
            ModelAndView modelAndView = new ModelAndView("workAndBlog");
            Long id = 11L;
            userService.removeUser(id);
            return modelAndView;
    }

//    Controller sorted by user by name, phone number, etc.


}
