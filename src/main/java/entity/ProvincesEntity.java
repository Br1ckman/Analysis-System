package entity;

import javax.persistence.*;

@Entity
@Table(name = "provinces", schema = "crawler", catalog = "")
public class ProvincesEntity {
    private int id;
    private String province;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProvincesEntity that = (ProvincesEntity) o;

        if (id != that.id) return false;
        if (province != null ? !province.equals(that.province) : that.province != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (province != null ? province.hashCode() : 0);
        return result;
    }
}
