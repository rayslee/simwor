package com.simwor.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Book {
    @TableId
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String producer;
    private String subtitle;
    private String primalName;
    private String translator;
    private String published;
    private int pages;
    private String price;
    private String binding;
    private String series;
    private String coverImageUrl;
    private String digest;
}
