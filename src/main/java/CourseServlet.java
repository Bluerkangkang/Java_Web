import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CourseServlet", value = "/CourseServlet")
public class CourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");

        List<Map<String, String>> courses = new ArrayList<>();
        Map<String, String> course1 = new HashMap<>();
        course1.put("name", "会计学");
        course1.put("url", "https://mp.weixin.qq.com/s/mFsn81UqigEKkKO9bpzjVA");
        courses.add(course1);

        Map<String, String> course2 = new HashMap<>();
        course2.put("name", "金融学");
        course2.put("url", "https://mp.weixin.qq.com/s/TI3JMKvkOOgJL4cWCm-DjA");
        courses.add(course2);

        Map<String, String> course3 = new HashMap<>();
        course3.put("name", "机器人工程");
        course3.put("url", "https://mp.weixin.qq.com/s/4D9nB4CfYjkowWqQRWRA1g");
        courses.add(course3);

        Map<String, String> course4 = new HashMap<>();
        course4.put("name", "能源与动力工程");
        course4.put("url", "https://mp.weixin.qq.com/s/XAlQ856Y4SV1OS_g0xKRQA");
        courses.add(course4);

        PrintWriter out = response.getWriter();
        out.println(courses);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}