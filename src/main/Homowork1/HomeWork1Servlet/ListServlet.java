import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class Information {
    String name;
    String age;
    String sex;
    String[] hobby;
    int id;

    Information(String name, String age, String sex, String[] hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }
}

@WebServlet(name = "ListServlet", value = "/ListServlet")
public class ListServlet extends HttpServlet {

    private ArrayList<Information> informations = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String[] hobby = request.getParameterValues("hobby");

        if (name == null || age == null || sex == null || hobby == null) {

            if (name.isEmpty() || age.isEmpty() || sex.isEmpty() || hobby.length == 0) {
                throw new ServletException("有一项或多项的值为空");
            }

            throw new ServletException("有一项或多项的值为NULL");
        }

        Information information = new Information(name, age, sex, hobby);
        information.id = informations.size();
        informations.add(information);

        request.setAttribute("information's", informations);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}