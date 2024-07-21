package com.pos.backend.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pos.backend.dto.ItemDto;
import com.pos.backend.entity.Item;
import com.pos.backend.exception.ResourceNotFoundException;
import com.pos.backend.mapper.ItemMapper;
import com.pos.backend.repository.ItemRepository;
import com.pos.backend.service.ItemService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;

    @Override
    public ItemDto createItem(ItemDto itemDto) {

        Item item = ItemMapper.mapToItem(itemDto);
        Item savedItem = itemRepository.save(item);

        return ItemMapper.mapToItemDto(savedItem);
    }

    @Override
    public ItemDto getItemById(Integer itemId) {
        Item item = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("Item with this id does not exist: " + itemId));
        return ItemMapper.mapToItemDto(item);
    }

    @Override
    public List<ItemDto> getAllItems() {
        List<Item> items = itemRepository.findAll();
        return items.stream().map((item) -> ItemMapper.mapToItemDto(item))
                .collect(Collectors.toList());
    }

    @Override
    public ItemDto updateItem(Integer itemId, ItemDto updatedItem) {
        Item item = itemRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("Item with this id does not exist: " + itemId));

        item.setName(updatedItem.getName());
        item.setPrice(updatedItem.getPrice());

        Item updatedItemObj = itemRepository.save(item);

        return ItemMapper.mapToItemDto(updatedItemObj);
    }

    @Override
    public void deleteItem(Integer itemId) {
        Item item = itemRepository.findById(itemId).orElseThrow(
                () -> new ResourceNotFoundException("Item with this id does not exist: " + itemId));

        itemRepository.deleteById(itemId);
    }

}
