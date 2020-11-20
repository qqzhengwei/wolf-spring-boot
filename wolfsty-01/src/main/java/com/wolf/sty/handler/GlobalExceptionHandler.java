package com.wolf.sty.handler;

import com.wolf.sty.common.vo.JSONResult;
import com.wolf.sty.exception.BusinessException;
import com.wolf.sty.exception.Exceptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.MultipartException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Liu
 * @Date: 2019/4/1 15:44
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 业务异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public JSONResult handler(BusinessException e) {
        logger.error("业务异常:", e);
        return new JSONResult(e.getCode(), StringUtils.isEmpty(e.getMessage()) ? "系统异常" : e.getMessage());
    }

    /**
     * 参数错误异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = {MethodArgumentTypeMismatchException.class, MissingServletRequestParameterException.class, BindException.class, HttpMessageNotReadableException.class})
    @ResponseBody
    public JSONResult handler(Exception e) {
        logger.error("参数异常:", e);
        return new JSONResult(Exceptions.System.REQUEST_PARAM_ERROR.getCode(), Exceptions.System.REQUEST_PARAM_ERROR.getDescription());
    }


    /**
     * Hibernate Validator参数校验异常处理
     *
     * @param e
     * @returns
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public JSONResult handler(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        ObjectError objectError = bindingResult.getAllErrors().get(0);
        return new JSONResult(Exceptions.System.REQUEST_PARAM_ERROR.getCode(), objectError.getDefaultMessage());
    }

    /**
     * 未被关注的异常信息，统一返回给客户端为“系统异常”
     *
     * @param e
     * @param response
     * @param request
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JSONResult exceptionHandler(Exception e, HttpServletResponse response, HttpServletRequest request) {
        logger.error("系统异常:", e);
        if (e instanceof HttpRequestMethodNotSupportedException) {
            return new JSONResult(Exceptions.System.REQUEST_METHOD_ERROR.getCode(), Exceptions.System.REQUEST_METHOD_ERROR.getDescription());
        }
        if (e instanceof MultipartException) {
            return new JSONResult(Exceptions.System.SYSTEM_ERROR.getCode(), "上传文件大小不能超过10M");
        }
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            logger.debug("exception  code:[{}],message:[{}]", businessException.getCode(), businessException.getMessage());
            return new JSONResult(businessException.getCode(), businessException.getMessage());
        }
        return new JSONResult(Exceptions.System.SYSTEM_ERROR.getCode(),e.getMessage());
    }

}
