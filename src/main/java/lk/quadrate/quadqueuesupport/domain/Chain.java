package lk.quadrate.quadqueuesupport.domain;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public abstract class Chain implements Serializable {

    private String chainName;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Chain(String chainName) {
        this.chainName = chainName;
    }
}
