package org.example.admin.mode;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(schema = "admin")
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;

}
