package io.lazy.dto;

import io.lazy.model.Service;
import io.lazy.model.ServiceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceDTO {
    private ServiceType name;

    static public ServiceDTO toDTO(Service service) {
        return new ServiceDTO(service.getName());
    }

    static public Service toEntity(ServiceDTO dto) {
        Service service = new Service();
        service.setName(dto.getName());
        return service;
    }
}
