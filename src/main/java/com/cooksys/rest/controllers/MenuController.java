package com.cooksys.rest.controllers;

import com.cooksys.rest.services.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "menu")
public class MenuController {

    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("")
    public ResponseEntity<MenuResponseDto> createMenu(@RequestBody MenuRequestDto menuRequestDto){
        return menuService.createMenu(menuRequestDto);
    }
}
