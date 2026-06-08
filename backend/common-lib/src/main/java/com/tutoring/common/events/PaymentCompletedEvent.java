package com.tutoring.common.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentCompletedEvent {

    private Long paymentId;
    private  String Status;
    private Double amount;

}
