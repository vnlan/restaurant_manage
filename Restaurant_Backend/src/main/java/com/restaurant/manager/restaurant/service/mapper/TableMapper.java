package com.restaurant.manager.restaurant.service.mapper;

import java.util.ArrayList;
import java.util.List;

import com.restaurant.manager.restaurant.model.Customer;
import com.restaurant.manager.restaurant.model.TableE;
import com.restaurant.manager.restaurant.service.dto.TableDTO;

import org.springframework.stereotype.Service;

@Service
public class TableMapper {
    public TableDTO tabletoTableDTO(TableE entity){
        if(entity == null) return null;
        else{
        TableDTO dto = new TableDTO();
        dto.setId(entity.getId());
        dto.setStatus(entity.isStatus());
        dto.setPosition(entity.getPosition());
        dto.setPeople_quantity(entity.getPeople_quantity());
        dto.setCustomer_id(tableCustomerId(entity));
        dto.setCustomer_name(tableCustomerName(entity));
        dto.setCustomer_phone(tableCustomerPhone(entity));
        return dto;
        }
    }

    public TableE tableDTOtoTableE(TableDTO dto){
        if(dto == null) return null;
        else{
            TableE entity = new TableE();
            entity.setId(dto.getId());
            entity.setStatus(dto.isStatus());
            entity.setPosition(dto.getPosition());
            entity.setPeople_quantity(dto.getPeople_quantity());
            entity.setCustomer(tableDTOtoCustomer(dto));
            return entity;
        }
    }

    public TableE toEntity(TableDTO dto){
        if(dto == null) return null;
        else{
            TableE entity = new TableE();
            entity.setId(dto.getId());
            entity.setStatus(dto.isStatus());
            entity.setPosition(dto.getPosition());
            entity.setPeople_quantity(dto.getPeople_quantity());
            return entity;
        }
    }

    public List<TableDTO> listTableMapper(List<TableE> list){
        if(list == null) return null;
        List<TableDTO> dtolist = new ArrayList<>();
        list.forEach(t -> dtolist.add(tabletoTableDTO(t)));
        return dtolist;
    }

    private Long tableCustomerId(TableE tableE) {
        if ( tableE == null ) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if ( customer == null ) {
            return null;
        }
        Long id = customer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String tableCustomerName(TableE tableE) {
        if ( tableE == null ) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String name = customer.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String tableCustomerPhone(TableE tableE) {
        if ( tableE == null ) {
            return null;
        }
        Customer customer = tableE.getCustomer();
        if ( customer == null ) {
            return null;
        }
        String phone = customer.getPhone_number();
        if ( phone == null ) {
            return null;
        }
        return phone;
    }

    protected Customer tableDTOtoCustomer(TableDTO dto){
        if(dto == null) return null;
        Customer customer = new Customer();
        customer.setId(dto.getCustomer_id());
        customer.setName(dto.getCustomer_name());
        customer.setPhone_number(dto.getCustomer_phone());
        return customer;
    }
}
