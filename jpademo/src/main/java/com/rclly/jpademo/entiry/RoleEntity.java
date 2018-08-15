package com.rclly.jpademo.entiry;

import javax.persistence.*;

@Entity
@Table(name = "role", schema = "test", catalog = "")
public class RoleEntity {
    private int rid;
    private String rname;

    @Id
    @Column(name = "rid", nullable = false)
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "rname", nullable = true, length = 255)
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (rid != that.rid) return false;
        if (rname != null ? !rname.equals(that.rname) : that.rname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + (rname != null ? rname.hashCode() : 0);
        return result;
    }
}
