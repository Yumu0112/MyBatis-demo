package com.example.mybatisdemo.controller;

import com.example.mybatisdemo.entity.PurchaseInfo;
public class PurchaseInfoResponse {

        //    nameのみをレスポンスとして返却するクラス
        private int price;

        public PurchaseInfoResponse(PurchaseInfo price) {
            this.price = price.getPrice();
        }

        public int getPrice() {
            return price;
        }
    }

