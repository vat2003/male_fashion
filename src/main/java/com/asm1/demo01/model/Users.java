package com.asm1.demo01.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer userID;

    @NotBlank(message = "Please enter your email")
    @Email(message = "Invalid email")
    String email; // cũng là username

    @NotBlank(message = "Please enter your password")
    String passwords;

    @NotBlank(message = "Please enter your fullname")
    String fullname;

    Boolean role = false;

    @NotBlank(message = "Please enter your address")
    String address;

    @Temporal(TemporalType.DATE)
    Date birthday ;

//    @NotBlank(message = "Please enter your phoneNum")
    @Size(min = 10, max = 15, message = "Phone number must be 10 to 15 characters")
    String phoneNum;
}
