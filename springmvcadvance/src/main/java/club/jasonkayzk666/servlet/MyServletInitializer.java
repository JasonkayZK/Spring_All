package club.jasonkayzk666.servlet;

import club.jasonkayzk666.servlet.impl.Myservlet;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * @author zk
 * @DATE 19-8-11
 */
public class MyServletInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        Dynamic myServlet = servletContext.addServlet("myServlet", Myservlet.class);
        myServlet.addMapping("/custom/***");
    }

}
