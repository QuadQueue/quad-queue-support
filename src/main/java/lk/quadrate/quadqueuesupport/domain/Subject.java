package lk.quadrate.quadqueuesupport.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public abstract class Subject {

    private String subjectName;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }
}
