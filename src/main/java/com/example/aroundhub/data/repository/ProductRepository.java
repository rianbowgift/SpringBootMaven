package com.example.aroundhub.data.repository;

import com.example.aroundhub.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<ProductEntity,String> {
}                                           //Id(프라이머리키)의 타입을 같이전송(String)
