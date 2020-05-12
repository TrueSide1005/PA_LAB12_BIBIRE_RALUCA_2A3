package main;

import java.time.LocalDateTime;

public class MyErrorResponse {
    public String message;
    public MyErrorResponse(String message) {
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
}
