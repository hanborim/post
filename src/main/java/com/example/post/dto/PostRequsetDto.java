package com.example.post.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostRequsetDto {
    private String account;
    private String eamil;
    private  String address;
    private String passwd;
    @JsonProperty("phone")
    private String phoneNumber;

    @Override
    public String toString()
    {
        return "PostRequestDto { " + "account : " + account + "email" + eamil + "adress" + address + "passwd" + passwd + " \n"
                +"phoneNumber" + phoneNumber;
    }

}
