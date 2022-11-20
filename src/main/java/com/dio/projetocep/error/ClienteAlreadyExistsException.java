package com.dio.projetocep.error;

public class ClienteAlreadyExistsException extends RuntimeException{
    public ClienteAlreadyExistsException(String message) {
        super(message);
    }
}
