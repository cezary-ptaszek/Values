package com.simple.program.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tabela_testowa")
public class Value {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String kolumna1;
    private String kolumna2;
    private String kolumna3;
    private Long kolumna4;

    public Value() {}

    public Value(Long id, String kolumna1, String kolumna2, String kolumna3, Long kolumna4) {
        this.id = id;
        this.kolumna1 = kolumna1;
        this.kolumna2 = kolumna2;
        this.kolumna3 = kolumna3;
        this.kolumna4 = kolumna4;
    }

    public long getlId() {
        return id;
    }

    public void setlId(long id) {
        this.id = id;
    }

    public String getKolumna1() {
        return kolumna1;
    }

    public void setKolumna1(String kolumna1) {
        this.kolumna1 = kolumna1;
    }

    public String getKolumna2() {
        return kolumna2;
    }

    public void setKolumna2(String kolumna2) {
        this.kolumna2 = kolumna2;
    }

    public String getKolumna3() {
        return kolumna3;
    }

    public void setKolumna3(String kolumna3) {
        this.kolumna3 = kolumna3;
    }

    public long getKolumna4() {
        return kolumna4;
    }

    public void setKolumna4(long kolumna4) {
        this.kolumna4 = kolumna4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return id.equals(value.id) &&
                Objects.equals(kolumna1, value.kolumna1) &&
                Objects.equals(kolumna2, value.kolumna2) &&
                Objects.equals(kolumna3, value.kolumna3) &&
                Objects.equals(kolumna4, value.kolumna4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, kolumna1, kolumna2, kolumna3, kolumna4);
    }

    @Override
    public String toString() {
        return "{" + id + kolumna1 + kolumna2 + kolumna3 + kolumna4 + "}";
    }
}
