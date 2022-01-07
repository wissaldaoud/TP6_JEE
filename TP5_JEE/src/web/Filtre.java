package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class Filtre implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                                                                    throws IOException, ServletException {
        request.getServletContext().log("parameters received: " + parametersToString(request));
        chain.doFilter(request, response);
    }

    private List<String> parametersToString(ServletRequest request) {
        List<String> parameters = new ArrayList<>();
        request.getParameterMap().forEach((k, v) -> parameters.add(k + "=" + Arrays.toString(v)));
        return parameters;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("LogFilter init!");
    }

    @Override
    public void destroy() {
		System.out.println("LogFilter destroy!");
    }
    
}