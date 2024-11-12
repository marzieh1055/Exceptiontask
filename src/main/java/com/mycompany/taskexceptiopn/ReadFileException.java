package com.mycompany.taskexceptiopn;

import java.io.IOException;

public class ReadFileException extends IOException {
    public ReadFileException(String message) {
        super(message);
    }
}
