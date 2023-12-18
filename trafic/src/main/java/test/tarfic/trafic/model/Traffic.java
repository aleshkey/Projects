package test.tarfic.trafic.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Traffic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private Date enterTime;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private Date exitTime;

    @JsonIgnore
    @ManyToOne
    private User user;

}
