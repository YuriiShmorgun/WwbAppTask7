package controller.command;

import javax.servlet.http.HttpServletRequest;

public class GoToList implements Command{
    @Override
    public String execute(HttpServletRequest request) {
        return "/list.jsp";
    }
}
