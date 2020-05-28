package com.galaxy.tax.component;

import com.galaxy.tax.entity.Account;
import com.galaxy.tax.entity.Privilege;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrivilegeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Account loginAccount = (Account) request.getSession().getAttribute("loginAccount");
        for (Privilege privilege : loginAccount.getRole().getPrivileges()) {
            if(2==privilege.getId()) {
                return true;
            }
        }
            response.getWriter().print(new String("No Privilege Access"));
            return false;
        }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
