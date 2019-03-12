package com.baizhi.testmapper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import javax.print.DocFlavor;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_user")
public class User {
    private String id;
    private String username;
    private String password;
}
