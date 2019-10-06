package eyael_demo.demo.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

import javax.servlet.*;
import java.io.IOException;
@Controller
@Order (3)
public class MyFilter_1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 1 is called..... ");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
