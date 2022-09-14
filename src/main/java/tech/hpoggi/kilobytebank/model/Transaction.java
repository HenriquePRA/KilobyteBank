package tech.hpoggi.kilobytebank.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import lombok.Data;

@Data
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String description;
    private BigDecimal value;
    private Date data;
    private Account account;
}
