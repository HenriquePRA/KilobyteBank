package tech.hpoggi.kilobytebank.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class AccountHolder implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Boolean admin;
}
