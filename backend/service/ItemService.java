package com.pos.backend.service;

import com.pos.backend.dto.ItemDto;
import java.util.List;

public interface ItemService {
    ItemDto createItem(ItemDto itemDto);

    ItemDto getItemById(Integer itemId);

    List<ItemDto> getAllItems();

    ItemDto updateItem(Integer itemId, ItemDto updatedItem);

    void deleteItem(Integer itemId);
}
