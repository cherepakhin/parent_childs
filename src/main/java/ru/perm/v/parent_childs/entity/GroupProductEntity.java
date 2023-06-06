package ru.perm.v.parent_childs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "group_product")
public class GroupProductEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id = -1L;
    @Column(name = "name", nullable = false)
    private String name = "";
    @Column(name = "parent_id", nullable = false)
    private Long parentId = -1L;
    private Boolean isLast = false;

    public GroupProductEntity() {
    }

    public GroupProductEntity(Long id, String name, Long parentId, Boolean isLast) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.isLast = isLast;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupProductEntity that = (GroupProductEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(parentId, that.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parentId);
    }
}
