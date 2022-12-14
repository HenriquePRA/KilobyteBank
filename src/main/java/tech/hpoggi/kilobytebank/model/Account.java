package tech.hpoggi.kilobytebank.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String number;
    private Date date;
    private Set<Transaction> transactions = new HashSet<Transaction>();
    private AccountHolder accountHolder;

    public BigDecimal getBalance() {
        BigDecimal total = BigDecimal.ZERO;
        for (Transaction t : this.transactions) {
            total = total.add(t.getValue());
        }
        return total;
    }
}
