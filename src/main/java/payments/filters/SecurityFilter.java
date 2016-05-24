package payments.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;

/**
 * Security filter
 * @author Yulia
 * @since 05.05.2016.
 */
//@WebFilter(filterName = "security_filter", urlPatterns = "/*")
public class SecurityFilter{
//public class SecurityFilter implements Filter{

//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
////        Principal userPhone = request.getUserPrincipal();
////        HttpSession session = request.getSession(false);
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
}
