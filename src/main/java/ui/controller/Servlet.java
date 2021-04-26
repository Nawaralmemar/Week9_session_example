package ui.controller;


import domain.db.PersonDatabase;
import domain.model.Person;

import javax.servlet.http.Cookie;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    private PersonDatabase database = new PersonDatabase();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destination;
        String command = request.getParameter("command");
        if (command == null || command.isEmpty()) {
            command = "";
        }
        switch (command) {
            case "hello":
               destination = hello(request,response);
                break;
            case "helloagain":
                destination = helloagain(request, response);
                break;
            default:
                destination = "index.jsp";
                break;
        }

        RequestDispatcher view = request.getRequestDispatcher(destination);
        view.forward(request, response);
    }

    private String helloagain(HttpServletRequest request, HttpServletResponse response) {
        // request.getSession().invalidate();
       Person person = (Person) request.getSession().getAttribute("user");
       person.setPassword("azerty");
       return "helloagain.jsp";
    }

    private String hello(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        Person person = database.vindPerson(name);
        if(person != null){
            HttpSession session = request.getSession();
            session.setAttribute("user",person);
            return "hello.jsp";
        }
        else{
            request.setAttribute("message","not register user. Use Serhat or Bob");
            return "index.jsp";
        }

    }


}
