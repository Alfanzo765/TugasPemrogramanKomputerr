package com.belajar_springboot.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wellcome")
public class DateTimeController {
    
    
        @GetMapping("/currentDateTime")
        public Map<String, String> getCurrentDateTime() {
   
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
            Map<String, String> response = new HashMap<>();
            response.put("Hari", now.format(dateFormatter));
            response.put("Waktu", now.format(timeFormatter));
    
            return response;
        }
    }
