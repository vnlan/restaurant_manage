package com.restaurant.manager.restaurant.controller;

import java.util.List;

import com.restaurant.manager.restaurant.model.TableE;
import com.restaurant.manager.restaurant.service.TableService;
import com.restaurant.manager.restaurant.service.dto.TableDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TableController {
    @Autowired
    private TableService tableService;

    @GetMapping("/get-table")
    public List<TableE> listTable() {
        return tableService.listTable();
    }

    @PostMapping("/post-table")
    public TableDTO postTable(@RequestBody TableDTO dto) {
        return tableService.save(dto);
    }
}
