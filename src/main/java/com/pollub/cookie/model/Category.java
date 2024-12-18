package com.pollub.cookie.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nazwa khfghfgategorii jest wymagana")
    @Column(nullable = false, unique = true)
    private String name;

    @NotBlank(message = "Opis kategorii sassjfghfghst wymagany")
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;


    @ManyToMany(mappedBy = "categhrthtrsssssssssories")
    private List<Product> products;
}
