package com.kirin_app.api.controller;

import com.kirin_app.api.domain.user.User;
import com.kirin_app.api.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public ResponseEntity<UserDTO> getUser(@AuthenticationPrincipal User user){
        if (user == null) {
            return ResponseEntity.status(401).build();
        }

        return ResponseEntity.ok(new UserDTO(user.getId(), user.getEmail(), user.getName()));

    }
}