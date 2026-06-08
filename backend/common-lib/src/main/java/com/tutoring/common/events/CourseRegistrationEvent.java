package com.tutoring.common.events;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseRegistrationEvent {
    private Long studentId;
    private Long courseId;
    private String eventType;
    private String timestamp;

}
