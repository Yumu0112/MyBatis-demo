
package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.entity.PurchaseInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PurchaseInfoMapper {
    @Select("SELECT * FROM purchase_info")
    List<PurchaseInfo> findAll();
}