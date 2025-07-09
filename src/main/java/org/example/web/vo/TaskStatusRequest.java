package org.example.web.vo;

import lombok.Getter;
import lombok.Setter;
import org.example.constants.TaskStatus;

@Getter
@Setter
public class TaskStatusRequest {
    private TaskStatus status;
}
