package controller.command;

import controller.User;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GoToList implements Command{
    @Override
    public String execute(HttpServletRequest request) {

        List<User> userList;
        userList = new CopyOnWriteArrayList<>();
        userList.add(new User("Yura", 32, "Kiev"));
        userList.add(new User("Dima", 31, "Kiev"));
        userList.add(new User("Yarik", 30, "Aby-Daby"));
        request.setAttribute("userList", userList);



        return "list.jsp";
    }
}
