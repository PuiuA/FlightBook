package io.lazy.mapper;

import io.lazy.dto.ServiceDTO;
import io.lazy.model.Service;
import org.springframework.stereotype.Component;

@Component
public class ServiceMapper {
    public ServiceDTO toDTO(Service service) {
        return new ServiceDTO(service.getName());
    }
    public Service toEntity(ServiceDTO dto) {
        Service service = new Service();
        service.setName(dto.getName());
        return service;
    }
}
