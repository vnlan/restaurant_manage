package com.restaurant.manager.restaurant.service;

import java.util.List;

import com.restaurant.manager.restaurant.model.TableE;
import com.restaurant.manager.restaurant.repository.TableRepository;
import com.restaurant.manager.restaurant.service.dto.TableDTO;
import com.restaurant.manager.restaurant.service.mapper.TableMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TableService {
    @Autowired
    private TableRepository tableRepository;
    @Autowired
    private TableMapper tableMapper;

    public List<TableE> listTable() {
        return tableRepository.findAll();
    }

    public TableDTO save(TableDTO dto) {
        TableE entity = tableMapper.toEntity(dto);
        entity = tableRepository.save(entity);
        return tableMapper.tabletoTableDTO(entity);
    }
}
