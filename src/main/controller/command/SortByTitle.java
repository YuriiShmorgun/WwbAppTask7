package controller.command;

import javax.servlet.http.HttpServletRequest;

public class SortByTitle implements Command {
    @Override
    public String execute(HttpServletRequest request) {
        return "/index.jsp";
    }
}
