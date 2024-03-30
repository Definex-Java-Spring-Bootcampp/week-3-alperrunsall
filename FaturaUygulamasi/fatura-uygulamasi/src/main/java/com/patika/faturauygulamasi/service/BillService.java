package com.patika.faturauygulamasi.service;

import com.patika.faturauygulamasi.producer.NotificationProducer;
import com.patika.faturauygulamasi.producer.dto.NotificationDTO;
import com.patika.faturauygulamasi.producer.enums.NotificationType;
import lombok.RequiredArgsConstructor;
import com.patika.faturauygulamasi.model.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.patika.faturauygulamasi.repository.BillRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BillService {

    private final BillRepository billRepository;
    private final NotificationProducer notificationProducer;

    public Bill save(Bill bill){
        billRepository.save(bill);

        notificationProducer.sendNotification(prepareNotificationDTO(NotificationType.EMAIL, bill.getId()));

        return bill;
    }

    public List<Bill> getAll(){
        return billRepository.getAll();
    }
    private NotificationDTO prepareNotificationDTO(NotificationType notificationType, String id) {
        return NotificationDTO.builder()
                .message("fatura kaydedildi.")
                .notificationType(notificationType)
                .id(id)
                .build();
    }

}
