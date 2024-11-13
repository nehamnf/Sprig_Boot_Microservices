package com.myspringboot.accounts.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseDTO {

    private String statusMessage;
    private String statusCode;

}
