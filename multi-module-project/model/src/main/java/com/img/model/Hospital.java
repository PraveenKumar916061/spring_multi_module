package com.img.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Hospital {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Pattern(regexp = "[a-zA-Z]+")
    private String hospitalName;
    @NotNull
    private String hospitalLocation;
    @NotNull
    private String patientName;
    @Min(value = 15)
    private Integer patientAge;
}
