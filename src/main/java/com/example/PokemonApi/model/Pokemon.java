package com.example.PokemonApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

import org.hibernate.validator.constraints.URL;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio y no puede estar vacio")
    @Size(min = 2,  max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El tipo es obligatorio")
    private String tipo;

    @NotNull(message = "El nivel es obligatirio")
    @Min(value = 1, message = "El nivel minimo es 1")
    @Max(value = 100, message = "El nivel maximo es 100")
    private Integer nivel;

    @Min(value = 0, message = "El ataque no debe ser negativo")
    private Integer ataque;

    @Min(value = 0, message = "La defensa no debe ser negativa")
    private Integer defensa;

    @Size(max = 255, message = "La descripcion no puede pasar de los 255 caracteres")
    private String descripcion;

    @URL(message = "El formato de la url debe ser valido")
    private String imagenUrl;

    @Email(message = "El formato del email debe ser valido")
    private String email;

    @NotNull(message = "La fecha de captura es obligatoria")
    @PastOrPresent (message = "La fecha de captura no puede ser futura")
    private LocalDate fechaCaptura;

}
