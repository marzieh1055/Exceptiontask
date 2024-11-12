package com.mycompany.taskexceptiopn;

import java.io.IOException;

public class WriteFileException extends IOException{
    public WriteFileException(String message) {
        super(message);
    }
}
