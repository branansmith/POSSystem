package com.pos.backend.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pos.backend.dto.ItemDto;
import com.pos.backend.service.ItemService;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/items")
public class ItemController {

    private ItemService itemService;

    // build add employee REST API
    @PostMapping
    public ResponseEntity<ItemDto> createItem(@RequestBody ItemDto itemDto) {
        ItemDto savedItem = itemService.createItem(itemDto);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    // GET item REST API
    @GetMapping("{id}")
    public ResponseEntity<ItemDto> getItemById(@PathVariable("id") Integer itemId) {
        ItemDto itemDto = itemService.getItemById(itemId);
        return ResponseEntity.ok(itemDto);
    }

    // get ALL items
    @GetMapping
    public ResponseEntity<List<ItemDto>> getAllItems() {
        List<ItemDto> items = itemService.getAllItems();
        return ResponseEntity.ok(items);

    }

    // Update Item REST API
    @PutMapping("{id}")
    public ResponseEntity<ItemDto> updateItem(@PathVariable("id") Integer itemId, @RequestBody ItemDto updatedItem) {
        ItemDto itemDto = itemService.updateItem(itemId, updatedItem);
        return ResponseEntity.ok(itemDto);
    }

    // delete item REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteItem(@PathVariable("id") Integer itemId) {
        itemService.deleteItem(itemId);
        return ResponseEntity.ok("Item deleted");
    }
}
