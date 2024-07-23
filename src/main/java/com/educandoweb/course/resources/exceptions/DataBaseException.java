package com.educandoweb.course.resources.exceptions;

import java.io.Serializable;

public class DataBaseException extends RuntimeException implements Serializable {
    private static Long serialVersionUID = 1L;

    public DataBaseException(String msg){
        super(msg);
    }
}
