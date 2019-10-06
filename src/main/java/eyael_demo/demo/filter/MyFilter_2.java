package eyael_demo.demo.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;

import javax.servlet.*;
import java.io.IOException;

@Controller
@Order(1)
public class MyFilter_2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2 is called..... ");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
