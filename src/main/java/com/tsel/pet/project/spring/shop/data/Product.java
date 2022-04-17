package com.tsel.pet.project.spring.shop.data;

import java.io.Serial;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "product")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 9040408000746477045L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

//    @Column(nullable = false)
//    @OneToMany
//    @JoinColumn(name = "category_id", table = "category", referencedColumnName = "id")
//    private String categoryName;

    @Column(nullable = false)
    private long price;

    @Column
    private Integer discount;

    @Column(nullable = false)
    private int count;

    @Column
    private String description;
}
