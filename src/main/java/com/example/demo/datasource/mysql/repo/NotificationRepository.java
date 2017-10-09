package com.example.demo.datasource.mysql.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.datasource.mysql.domain.NotificationBean;

@Repository
public interface NotificationRepository extends CrudRepository<NotificationBean, Long> {

}
