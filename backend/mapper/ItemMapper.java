package com.pos.backend.mapper;

import com.pos.backend.dto.ItemDto;
import com.pos.backend.entity.Item;

public class ItemMapper {

    public static ItemDto mapToItemDto(Item item) {
        return new ItemDto(
                item.getId(),
                item.getQuantity(),
                item.getName(),
                item.getPrice());

    }

    public static Item mapToItem(ItemDto itemDto) {
        return new Item(
                itemDto.getId(),
                itemDto.getQuantity(),
                itemDto.getName(),
                itemDto.getPrice());

    }

}
