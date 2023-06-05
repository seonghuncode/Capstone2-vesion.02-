package com.ysh.capstoneTest1.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {

    private int club_id;
    private int user_id;
    private String access_token;
    private String access_token_end_at;


}
