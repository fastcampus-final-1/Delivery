package com.delivery.global.api;


import com.delivery.global.exception.GlobalException;
import com.delivery.global.exception.GlobalResponse;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Data
public class API {

    public static ResponseEntity OK(Object data) {
        return ResponseEntity.ok(data);
    }

    public static ResponseEntity OK() {
        return ResponseEntity.ok(new GlobalResponse("성공", HttpStatus.OK));
    }

    public static ResponseEntity ERROR(GlobalException ex) {
        return ResponseEntity.status(ex.getErrorCode().getStatus()).body(ex.getErrorResponse());
    }
}
