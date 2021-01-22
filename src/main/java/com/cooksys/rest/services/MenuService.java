package com.cooksys.rest.services;

import com.cooksys.rest.dtos.MenuRequestDto;
import com.cooksys.rest.dtos.MenuResponseDto;
import com.cooksys.rest.mappers.MenuMapper;
import com.cooksys.rest.repository.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MenuService {

    private MenuRepository menuRepository;
    private MenuMapper menuMapper;

    public ResponseEntity<MenuResponseDto> createMenu(MenuRequestDto menuRequestDto) {
        Menu menu = menuMapper.requestDtoToEntity(menuRequestDto);

        for(Item item : menu.getItems()) {
            item.setMenu(menu);
        }

        Menu savedMenu = menuRepository.saveAndFlush(menu);
        return new ResponseEntity<>(menuMapper.entityToResponseDto(savedMenu), HttpStatus.CREATED);
    }
}
