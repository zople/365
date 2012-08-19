
package com.zople.controller.service.exception;

/**
 * 
 * @author wangwy
 */
public class ExistingEntityException extends Exception {
    public ExistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public ExistingEntityException(String message) {
        super(message);
    }
}
