package com.rclly.jpademo.entiry;

import javax.persistence.*;

@Entity
@Table(name = "module", schema = "test", catalog = "")
public class ModuleEntity {
    private int mid;
    private String mname;

    @Id
    @Column(name = "mid", nullable = false)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "mname", nullable = true, length = 255)
    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModuleEntity that = (ModuleEntity) o;

        if (mid != that.mid) return false;
        if (mname != null ? !mname.equals(that.mname) : that.mname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (mname != null ? mname.hashCode() : 0);
        return result;
    }
}
