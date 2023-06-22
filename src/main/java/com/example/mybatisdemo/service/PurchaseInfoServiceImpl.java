package com.example.mybatisdemo.service;

import com.example.mybatisdemo.entity.PurchaseInfo;
import com.example.mybatisdemo.mapper.PurchaseInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseInfoServiceImpl implements PurchaseInfoService {

    private final PurchaseInfoMapper purchaseInfoMapper;

    public PurchaseInfoServiceImpl(PurchaseInfoMapper purchaseInfoMapper) {
        this.purchaseInfoMapper = purchaseInfoMapper;
    }
    public List<PurchaseInfo> findAll() {
        return purchaseInfoMapper.findAll();
    }
}