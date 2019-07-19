package pl.kn.postgresangular.model;

import lombok.Data;
import pl.kn.postgresangular.utils.PropertyConverter;

import javax.persistence.*;
import java.util.Map;

@Data
@Table(name = "DEVICE")
@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Convert(converter = PropertyConverter.class)
    private Map<String, Object> propertiesMap;

    private String propertiesJson;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

}
