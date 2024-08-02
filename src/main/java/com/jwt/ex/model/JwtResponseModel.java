package com.jwt.ex.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class JwtResponseModel {
    private String jwtToken;
    private String userName;




}
