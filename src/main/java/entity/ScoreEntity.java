package entity;

import javax.persistence.*;

@Entity
@Table(name = "score", schema = "crawler", catalog = "")
public class ScoreEntity {
    private int id;
    private String schoolid;
    private String provinceid;
    private String classicalid;
    private String year;
    private String lowscore;
    private String highscore;
    private String averagescore;
    private String batch;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "schoolid")
    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }

    @Basic
    @Column(name = "provinceid")
    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    @Basic
    @Column(name = "classicalid")
    public String getClassicalid() {
        return classicalid;
    }

    public void setClassicalid(String classicalid) {
        this.classicalid = classicalid;
    }

    @Basic
    @Column(name = "year")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Basic
    @Column(name = "lowscore")
    public String getLowscore() {
        return lowscore;
    }

    public void setLowscore(String lowscore) {
        this.lowscore = lowscore;
    }

    @Basic
    @Column(name = "highscore")
    public String getHighscore() {
        return highscore;
    }

    public void setHighscore(String highscore) {
        this.highscore = highscore;
    }

    @Basic
    @Column(name = "averagescore")
    public String getAveragescore() {
        return averagescore;
    }

    public void setAveragescore(String averagescore) {
        this.averagescore = averagescore;
    }

    @Basic
    @Column(name = "batch")
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScoreEntity that = (ScoreEntity) o;

        if (id != that.id) return false;
        if (schoolid != null ? !schoolid.equals(that.schoolid) : that.schoolid != null) return false;
        if (provinceid != null ? !provinceid.equals(that.provinceid) : that.provinceid != null) return false;
        if (classicalid != null ? !classicalid.equals(that.classicalid) : that.classicalid != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (lowscore != null ? !lowscore.equals(that.lowscore) : that.lowscore != null) return false;
        if (highscore != null ? !highscore.equals(that.highscore) : that.highscore != null) return false;
        if (averagescore != null ? !averagescore.equals(that.averagescore) : that.averagescore != null) return false;
        if (batch != null ? !batch.equals(that.batch) : that.batch != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (schoolid != null ? schoolid.hashCode() : 0);
        result = 31 * result + (provinceid != null ? provinceid.hashCode() : 0);
        result = 31 * result + (classicalid != null ? classicalid.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (lowscore != null ? lowscore.hashCode() : 0);
        result = 31 * result + (highscore != null ? highscore.hashCode() : 0);
        result = 31 * result + (averagescore != null ? averagescore.hashCode() : 0);
        result = 31 * result + (batch != null ? batch.hashCode() : 0);
        return result;
    }
}
