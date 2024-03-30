package com.patika.faturauygulamasi.producer.dto;

import com.patika.faturauygulamasi.producer.enums.NotificationType;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class NotificationDTO {

    private NotificationType notificationType;
    private String message;
    private String id;

}