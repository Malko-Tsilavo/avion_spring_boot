package com.example.avion.models.PromtionEnfant;

import jakarta.persistence.*;


@Entity
@Table(name = "reduction_enfant")
public class ReductionEnfant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reduction_enfant")
    private Long id;

    @Column(nullable = false)
    private Integer age;

    @Column(name = "pourcentage_reduction")
    private Double pourcentageReduction;
    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public Double getPourcentageReduction() {
        return pourcentageReduction;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPourcentageReduction(Double pourcentageReduction) {
        this.pourcentageReduction = pourcentageReduction;
    }
}
