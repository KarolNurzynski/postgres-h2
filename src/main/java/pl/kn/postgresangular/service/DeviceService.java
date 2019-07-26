package pl.kn.postgresangular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kn.postgresangular.model.Device;
import pl.kn.postgresangular.repository.DeviceRepository;

import java.util.List;

@Service
public class DeviceService implements IDeviceService {

    @Autowired
    DeviceRepository deviceRepository;


    @Override
    public Device findDevice(Long id) {
        return deviceRepository.findById(id).orElse(new Device());
    }

    @Override
    public List<Device> findAllDevices() {
        return deviceRepository.findAll();
    }

    @Override
    public void saveDevice(Device device) {
        deviceRepository.save(device);
    }
}
