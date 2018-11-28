/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package announsee.controllers;
import java.io.IOException;
    import javax.servlet.Filter;
    import javax.servlet.FilterChain;
    import javax.servlet.FilterConfig;
    import javax.servlet.ServletException;
    import javax.servlet.ServletRequest;
    import javax.servlet.ServletResponse;

    /**
     *
     * @author DINANATH
     */
    public class EncodingFilter implements Filter {

        private String encoding = "utf-8";

        public void doFilter(ServletRequest request,ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
            request.setCharacterEncoding(encoding);
    //                response.setContentType("text/html;charset=UTF-8");
                    response.setCharacterEncoding(encoding);
            filterChain.doFilter(request, response);

        }

        public void init(FilterConfig filterConfig) throws ServletException {
            String encodingParam = filterConfig.getInitParameter("encoding");
            if (encodingParam != null) {
                encoding = encodingParam;
            }
        }

        public void destroy() {
            // nothing todo
        }

    }