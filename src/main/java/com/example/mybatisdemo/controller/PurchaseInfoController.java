package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.PurchaseInfo;
import com.example.mybatisdemo.service.PurchaseInfoService;
import com.example.mybatisdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class PurchaseInfoController {

    private final PurchaseInfoService purchaseInfoService;

    public PurchaseInfoController(PurchaseInfoService purchaseInfoService) {
        this.purchaseInfoService = purchaseInfoService;
    }
    @GetMapping("/purchase-info")
    public List<PurchaseInfo> info() {
        return purchaseInfoService.findAll();
    }

    @GetMapping("/purchase-info/price")
    public List<PurchaseInfoResponse> price() {
        List<PurchaseInfo> purchaseInfos = purchaseInfoService.findAll();
        List<PurchaseInfoResponse> purchaseInfoResponses = purchaseInfos.stream().map(PurchaseInfoResponse::new).toList();

        return purchaseInfoResponses;
    }
}
