package io.lazy.controller;

import io.lazy.dto.ServiceDTO;
import io.lazy.services.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceController {
    private final ServiceService serviceService;

    @GetMapping
    public List<ServiceDTO> getAllServices() { return serviceService.getAllServices();}
}
