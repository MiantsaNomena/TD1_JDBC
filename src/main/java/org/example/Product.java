package org.example;
import lombok.*;

import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private Instant creationDatetime;
    private Category category;

    public String getCategoryName() {
        return (category != null) ? category.getName() : "Aucune catégorie";
    }
}
