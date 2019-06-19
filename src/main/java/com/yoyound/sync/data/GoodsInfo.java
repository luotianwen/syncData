package com.yoyound.sync.data;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class GoodsInfo extends BaseRowModel {
    @ExcelProperty(index = 0)
    private String name;
    @ExcelProperty(index = 7)
    private String marketPrice;
    @ExcelProperty(index = 20)
    private String details;
    @ExcelProperty(index = 28)
    private String imgs;
    @ExcelProperty(index = 33)
    private String artNo;
    @ExcelProperty(index = 55)
    private String skus;

    public String getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getArtNo() {
        return artNo;
    }

    public void setArtNo(String artNo) {
        this.artNo = artNo;
    }

    public String getSkus() {
        return skus;
    }

    public void setSkus(String skus) {
        this.skus = skus;
    }
}
