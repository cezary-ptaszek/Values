package com.simple.program.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "VALUES")
public class Value {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lId;
    private String sColumn1;
    private String sColumn2;
    private String sColumn3;
    private Long lColumn4;

    public Value() {}

    public Value(Long lId, String sColumn1, String sColumn2, String sColumn3, Long lColumn4) {
        this.lId = lId;
        this.sColumn1 = sColumn1;
        this.sColumn2 = sColumn2;
        this.sColumn3 = sColumn3;
        this.lColumn4 = lColumn4;
    }

    public long getlId() {
        return lId;
    }

    public void setlId(long lId) {
        this.lId = lId;
    }

    public String getsColumn1() {
        return sColumn1;
    }

    public void setsColumn1(String sColumn1) {
        this.sColumn1 = sColumn1;
    }

    public String getsColumn2() {
        return sColumn2;
    }

    public void setsColumn2(String sColumn2) {
        this.sColumn2 = sColumn2;
    }

    public String getsColumn3() {
        return sColumn3;
    }

    public void setsColumn3(String sColumn3) {
        this.sColumn3 = sColumn3;
    }

    public long getlColumn4() {
        return lColumn4;
    }

    public void setlColumn4(long lColumn4) {
        this.lColumn4 = lColumn4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return lId.equals(value.lId) &&
                Objects.equals(sColumn1, value.sColumn1) &&
                Objects.equals(sColumn2, value.sColumn2) &&
                Objects.equals(sColumn3, value.sColumn3) &&
                Objects.equals(lColumn4, value.lColumn4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lId, sColumn1, sColumn2, sColumn3, lColumn4);
    }

    @Override
    public String toString() {
        return "Value{" +
                "lId=" + lId +
                ", sColumn1='" + sColumn1 + '\'' +
                ", sColumn2='" + sColumn2 + '\'' +
                ", sColumn3='" + sColumn3 + '\'' +
                ", lColumn4=" + lColumn4 +
                '}';
    }
}
