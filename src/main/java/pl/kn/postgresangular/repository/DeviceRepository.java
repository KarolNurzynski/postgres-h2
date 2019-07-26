package pl.kn.postgresangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kn.postgresangular.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
