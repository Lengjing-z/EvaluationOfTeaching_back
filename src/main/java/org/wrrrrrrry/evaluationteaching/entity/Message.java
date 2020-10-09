package org.wrrrrrrry.evaluationteaching.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {
    private int id;
    private Integer uId;
    private Integer sttId;
    private Integer tttId;
    private String context;
    // todo delete: this property is excess
    private String startedTime;
    private boolean isRead;
    private Integer targetId;
    private boolean isFinished;
}
