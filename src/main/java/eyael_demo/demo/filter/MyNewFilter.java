package eyael_demo.demo.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyNewFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("My new filter started");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
