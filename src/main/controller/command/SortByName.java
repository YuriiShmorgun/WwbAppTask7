package controller.command;

import javax.servlet.http.HttpServletRequest;

public class SortByName implements Command {
    @Override
    public String execute(HttpServletRequest request) {

        return "list.jsp";
    }
}
