package at.tlr.llmgateway.entity;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class Logging {
    private int id;
    private int userId;
    private int providerId;
    private int modelId;
    private float cost;
    private int input_tokens;
    private int output_tokens;
    private String request;
    private String response;
    private Timestamp timestamp;
}
