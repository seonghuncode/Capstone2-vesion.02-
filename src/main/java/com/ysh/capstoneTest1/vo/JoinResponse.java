package com.ysh.capstoneTest1.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JoinResponse {

        private int clubCode;
        private int department_code;
        private int student_id;
        private String name;
        private String gender;
        private String phone;

        private String email;
        private String address;
        private String birthday;
        private boolean cctv;
        private boolean project;

        private String message;

}
