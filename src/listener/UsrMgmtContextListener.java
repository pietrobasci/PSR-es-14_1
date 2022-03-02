package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.UserMgmt;

/**
 * Application Lifecycle Listener implementation class UsrMgmtContextListener
 *
 */
@WebListener
public class UsrMgmtContextListener implements ServletContextListener {


    public UsrMgmtContextListener() {
        // TODO Auto-generated constructor stub
    }

	
    public void contextInitialized(ServletContextEvent contextEvent)  { 
    	
    	ServletContext context = contextEvent.getServletContext();
    	UserMgmt us = new UserMgmt();
    	context.setAttribute("users", us); 
    	
    }


    public void contextDestroyed(ServletContextEvent arg0)  { 
        // TODO Auto-generated constructor stub	
    }
	
}
