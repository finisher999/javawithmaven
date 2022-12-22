package com.model.modelattribute.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="model_attributes")
public class model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column(name = "attribute_name")
    String attribute_name;

    @Column(name = "created_at")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String created_at;

    @NotEmpty
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "deleted_at")
    private String deleted_at;

    @Column(name = "influx_attribute_name")
    String  influx_attribute_name;

    @Column(name = "max")
    Integer max;

    @Column(name = "min")
    Integer min;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private String updated_at;

    @Column(name = "data_type_id")
    Integer  data_type_id;

    @Column(name = "org_id")
    Integer org_id;

    public model() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttribute_name() {
        return attribute_name;
    }

    public void setAttribute_name(String attribute_name) {
        this.attribute_name = attribute_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
    }

    public String getInflux_attribute_name() {
        return influx_attribute_name;
    }

    public void setInflux_attribute_name(String influx_attribute_name) {
        this.influx_attribute_name = influx_attribute_name;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Integer getData_type_id() {
        return data_type_id;
    }

    public void setData_type_id(Integer data_type_id) {
        this.data_type_id = data_type_id;
    }

    public Integer getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Integer org_id) {
        this.org_id = org_id;
    }

    public model(Integer id, String attribute_name, String created_at, String deleted_at, String influx_attribute_name, Integer max, Integer min, String updated_at, Integer data_type_id, Integer org_id) {
        this.id = id;
        this.attribute_name = attribute_name;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
        this.influx_attribute_name = influx_attribute_name;
        this.max = max;
        this.min = min;
        this.updated_at = updated_at;
        this.data_type_id = data_type_id;
        this.org_id = org_id;
    }

    @Override
    public String toString() {
        return "model{" +
                "id=" + id +
                ", attribute_name='" + attribute_name + '\'' +
                ", created_at='" + created_at + '\'' +
                ", deleted_at='" + deleted_at + '\'' +
                ", influx_attribute_name='" + influx_attribute_name + '\'' +
                ", max=" + max +
                ", min=" + min +
                ", updated_at='" + updated_at + '\'' +
                ", data_type_id=" + data_type_id +
                ", org_id=" + org_id +
                '}';
    }
}
