package com.luoxinxin.crowd.mvc.config;

import com.google.gson.Gson;
import com.luoxinxin.crowd.constant.CrowdConstant;
import com.luoxinxin.crowd.util.CrowdUtil;
import com.luoxinxin.crowd.util.ResultEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Comments:
 * Author：  luoxinxin
 * Create Date：  2020-10-27
 * Modified By： luoxinxin
 */

@ControllerAdvice
public class CrowdExceptionResolver {

    @ExceptionHandler(Exception.class)
    public ModelAndView resolveNullPointerException(Exception exception, HttpServletRequest request, HttpServletResponse response) throws IOException {

        boolean judgeResult = CrowdUtil.judgeRequestType(request);

        if(judgeResult){
            ResultEntity<Object> resultEntity = ResultEntity.failed(exception.getMessage());
            Gson gson = new Gson();
            String json = gson.toJson(resultEntity);
            response.getWriter().write(json);
            return null;
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(CrowdConstant.ATTR_NAME_EXCEPTION,exception);
        modelAndView.setViewName("system-error");
        return modelAndView;
    }

    private ModelAndView commonResolveException(Exception exception,HttpServletRequest request,HttpServletResponse response,String viewName) throws IOException {
        boolean judgeResult = CrowdUtil.judgeRequestType(request);

        if(judgeResult){
            String message = exception.getMessage();
            ResultEntity<Object> resultEntity = ResultEntity.failed(message);
            Gson gson = new Gson();
            String json = gson.toJson(resultEntity);
            PrintWriter writer = response.getWriter();
            writer.write(json);
            return null;
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(CrowdConstant.ATTR_NAME_EXCEPTION,exception);
        modelAndView.setViewName(viewName);

        return modelAndView;
    }



}
