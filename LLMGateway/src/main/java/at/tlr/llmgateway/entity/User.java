package at.tlr.llmgateway.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class User {
    private int id;
    private String email;
    private String passwordHash;
    private float balance;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
