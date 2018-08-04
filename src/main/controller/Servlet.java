package controller;

import controller.command.Command;
import controller.command.GoToList;
import controller.command.SortByTitle;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Servlet extends HttpServlet {

    private List<User> userList;
    private Map<String, Command> commands = new HashMap<>();

    @Override
    public void init() throws ServletException {
        userList = new CopyOnWriteArrayList<>();
        userList.add(new User("Yura", 32, "Kiev"));
        userList.add(new User("Dima", 31, "Kiev"));
        userList.add(new User("Yarik", 30, "Aby-Daby"));


        commands.put("logout", new SortByTitle());
        commands.put("list", new GoToList());



    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = request.getRequestURI();
        System.out.println(path);
        path = path.replaceAll(".*/app/" , "");
        System.out.println(path);

        request.setAttribute("userList", userList);
        request.getRequestDispatcher("list.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
