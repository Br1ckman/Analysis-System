package entity;

import javax.persistence.*;

@Entity
@Table(name = "classicals", schema = "crawler", catalog = "")
public class ClassicalsEntity {
    private int id;
    private String classical;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "classical")
    public String getClassical() {
        return classical;
    }

    public void setClassical(String classical) {
        this.classical = classical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassicalsEntity that = (ClassicalsEntity) o;

        if (id != that.id) return false;
        if (classical != null ? !classical.equals(that.classical) : that.classical != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (classical != null ? classical.hashCode() : 0);
        return result;
    }
}
