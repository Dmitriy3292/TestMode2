package ru.netology.data;

import lombok.*;

@Value
public class RegistrationInfo {
    private String login;
    private String password;
    private String status;

}