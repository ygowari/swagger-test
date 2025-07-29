package com.example.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swagger.DTO.TitleView;
import com.example.swagger.repository.TitleRepository;

@Service
public class TitleService {

    @Autowired
    private TitleRepository titleRepository;

    public List<TitleView> getAllseasons() {
        return titleRepository.fetchTitleDetails();
    }
}
