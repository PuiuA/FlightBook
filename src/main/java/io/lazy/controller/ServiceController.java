package io.lazy.controller;

import io.lazy.dto.ServiceDTO;
import io.lazy.services.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/services")
public class ServiceController {
    private final ServiceService serviceService;

    @GetMapping
    public List<ServiceDTO> getAllServices() { return serviceService.getAllServices();}

    @GetMapping("/{id}")
    public ServiceDTO getServiceById(@PathVariable Long id) { return serviceService.getServiceById(id);}

    @PutMapping
    public ServiceDTO updateServiceById(@RequestBody Long id, ServiceDTO serviceDTO) {
        return serviceService.updateService(id, serviceDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteServiceById(@PathVariable Long id) {
        serviceService.deleteServiceById(id);
    }
    @DeleteMapping
    public void deleteService(@RequestBody ServiceDTO serviceDTO) {
        serviceService.delete(serviceDTO);
    }

}
