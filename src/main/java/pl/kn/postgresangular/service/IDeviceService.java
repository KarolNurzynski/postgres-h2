package pl.kn.postgresangular.service;

import pl.kn.postgresangular.model.Device;

import java.util.List;

public interface IDeviceService {
    Device findDevice(Long id);
    List<Device> findAllDevices();
    void saveDevice(Device device);
}
