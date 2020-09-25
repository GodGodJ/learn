package com.example.malllearning1.service;

import com.example.malllearning1.mgb.model.PmsBrand;

import java.util.List;

public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pagNum, int pageSize);

    PmsBrand getBrand(Long id);
}
